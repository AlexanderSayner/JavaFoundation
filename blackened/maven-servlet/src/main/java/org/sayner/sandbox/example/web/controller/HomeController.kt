package org.sayner.sandbox.example.web.controller

import org.thymeleaf.ITemplateEngine
import org.thymeleaf.context.WebContext
import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar.*
import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class HomeController : BasicController {
    override fun process(
            request: HttpServletRequest,
            response: HttpServletResponse,
            servletContext: ServletContext,
            templateEngine: ITemplateEngine
    ) {
        val dateFormat= SimpleDateFormat("dd MMMM yyyy")
        val dateTime=getInstance().time
        val webContext = WebContext(request, response, servletContext, request.locale)
        webContext.setVariable("today", dateFormat.format(dateTime))
        templateEngine.process("home", webContext, response.writer)
    }
}