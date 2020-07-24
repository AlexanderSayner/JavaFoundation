package org.sayner.sandbox.example.jetty.controller

import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class RootController {
    @GetMapping
    fun index() =
        ResponseEntity("awesome", OK)
}
