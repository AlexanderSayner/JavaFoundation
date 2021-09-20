package org.sayner.sandbox.example.web.controller

import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.thymeleaf.ITemplateEngine

interface BasicController {
    fun process(
            request: HttpServletRequest,
            response: HttpServletResponse,
            servletContext: ServletContext,
            templateEngine: ITemplateEngine
    )
}
