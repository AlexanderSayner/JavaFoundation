package org.sayner.sandbox.example.web.application

import org.sayner.sandbox.example.web.controller.BasicController
import org.sayner.sandbox.example.web.controller.HomeController
import org.thymeleaf.ITemplateEngine
import org.thymeleaf.TemplateEngine
import org.thymeleaf.templatemode.TemplateMode.HTML
import org.thymeleaf.templateresolver.ServletContextTemplateResolver
import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest

class MyApplication(servletContext: ServletContext) {
    private val templateEngine: TemplateEngine = TemplateEngine()
    private val controllersByURL = mutableMapOf<String, BasicController>()

    init {
        val templateResolver = ServletContextTemplateResolver(servletContext)
        // HTML is the default mode, but we will set it anyway for better understanding of code
        templateResolver.templateMode = HTML
        // This will convert "home" to "/WEB-INF/templates/home.html"
        templateResolver.prefix = "/WEB-INF/templates/"
        templateResolver.suffix = ".html"
        // Set template cache TTL to 1 hour. If not set, entries would live in cache until expelled by LRU
        templateResolver.cacheTTLMs = 3600000L
        // Cache is set to true by default. Set to false if you want templates to
        // be automatically updated when modified.
        templateResolver.isCacheable = false

        templateEngine.setTemplateResolver(templateResolver)

        controllersByURL["/ui/home"] = HomeController()
//        controllersByURL["/product/list"] = ProductListController()
//        controllersByURL["/product/comments"] = ProductCommentsController()
//        controllersByURL["/order/list"] = OrderListController()
//        controllersByURL["/order/details"] = OrderDetailsController()
//        controllersByURL["/subscribe"] = SubscribeController()
//        controllersByURL["/userprofile"] = UserProfileController()
    }

    fun getTemplateEngine(): ITemplateEngine {
        return templateEngine
    }

    fun resolveControllerForRequest(request: HttpServletRequest): BasicController {
        val path: String = getRequestPath(request)
        return controllersByURL[path] ?: HomeController()
    }

    private fun getRequestPath(request: HttpServletRequest): String {
        var requestURI = request.requestURI
        val contextPath = request.contextPath
        val fragmentIndex = requestURI.indexOf(';')
        if (fragmentIndex != -1) {
            requestURI = requestURI.substring(0, fragmentIndex)
        }
        return if (requestURI.startsWith(contextPath)) {
            requestURI.substring(contextPath.length)
        } else requestURI
    }
}
