package org.sayner.sandbox.example.jetty.config

import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext
import javax.servlet.ServletRegistration

class ApplicationInitializer : WebApplicationInitializer {
    override fun onStartup(servletContext: ServletContext) {
        // Now creating second, but java configured context
        val applicationContext = AnnotationConfigWebApplicationContext()

        // Registers annotated configurations class
        applicationContext.register(ApplicationContextConfiguration::class.java)

        val appDispatcher: ServletRegistration.Dynamic = servletContext.addServlet(
            "noxml-webapp",
            DispatcherServlet(applicationContext)
        )
        appDispatcher.setLoadOnStartup(1)
        appDispatcher.addMapping("/")
    }

}
