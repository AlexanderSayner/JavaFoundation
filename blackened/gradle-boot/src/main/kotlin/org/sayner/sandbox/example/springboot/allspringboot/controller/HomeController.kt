package org.sayner.sandbox.example.springboot.allspringboot.controller

import org.sayner.sandbox.example.springboot.allspringboot.dto.BasicAnswer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {
    @GetMapping
    fun index() =
            BasicAnswer("200", "very good")
}
