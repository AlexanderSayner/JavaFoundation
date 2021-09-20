package org.sayner.sandbox.example.web.filter;

import org.sayner.sandbox.example.business.model.User;
import org.sayner.sandbox.example.web.application.MyApplication;
import org.sayner.sandbox.example.web.controller.BasicController;
import org.thymeleaf.ITemplateEngine;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/ui/*")
public class ThymeleafFilter implements Filter {
    private ServletContext servletContext;
    private MyApplication myApplication;

    @Override
    public void init(FilterConfig filterConfig) {
        servletContext = filterConfig.getServletContext();
        myApplication = new MyApplication(servletContext);
    }

    @Override
    public void destroy() {
        servletContext = null;
        myApplication = null;
    }

    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain
    ) throws IOException, ServletException {
        addUserToSession((HttpServletRequest) servletRequest);
        if (!process((HttpServletRequest) servletRequest, (HttpServletResponse) servletResponse)) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    private static void addUserToSession(final HttpServletRequest request) {
        // Simulate a real user session by adding a user object
        request
                .getSession(true)
                .setAttribute(
                        "user",
                        new User(
                                "Alexander",
                                "Sayner",
                                "PetrolHead",
                                16)
                );
    }

    private boolean process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        try {
            // This prevents triggering engine executions for resource URLs
            if (request.getRequestURI().startsWith("/css") ||
                    request.getRequestURI().startsWith("/images") ||
                    request.getRequestURI().startsWith("/favicon")
            ) {
                return false;
            }
            /*
             * Query controller/URL mapping and obtain the controller
             * that will process the request. If no controller is available,
             * return false and let other filters/servlets process the request.
             */
            BasicController controller = myApplication.resolveControllerForRequest(request);
            /*
             * Obtain the TemplateEngine instance.
             */
            ITemplateEngine templateEngine = myApplication.getTemplateEngine();
            /*
             * Write the response headers
             */
            response.setContentType("text/html;charset=UTF-8");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            /*
             * Execute the controller and process view template,
             * writing the results to the response writer.
             */
            controller.process(request, response, servletContext, templateEngine);
            return true;
        } catch (Exception e) {
            try {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            } catch (final IOException ignored) {
                // Just ignore this
            }
            throw new ServletException(e);
        }
    }
}
