package org.sayner.sandbox.example.springboot.allspringboot.controller

import org.sayner.sandbox.example.springboot.allspringboot.SomeThing
import org.sayner.sandbox.example.springboot.allspringboot.dto.BasicAnswer
import org.slf4j.LoggerFactory.getLogger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {
    private val logger = getLogger(HomeController::class.java)
    @GetMapping
    fun index() =
            BasicAnswer("200", "very good")

    @GetMapping("thread")
    fun thread(): BasicAnswer {
        val st = SomeThing()
        val myThready = Thread(st)
        myThready.start()
        logger.info("Главный поток завершён...")
        return BasicAnswer("200", "Побочный поток запущен");
    }
}
