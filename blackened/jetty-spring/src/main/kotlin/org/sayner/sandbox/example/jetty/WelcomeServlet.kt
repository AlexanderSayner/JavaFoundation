package org.sayner.sandbox.example.jetty

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/")
class WelcomeServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        val printWriter = resp.writer
        printWriter.write("Hello from Jetty")
        printWriter.close()
    }
}
