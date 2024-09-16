package org.sayner.sandbox.example.springboot.allspringboot.controller

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.example.springboot.allspringboot.service.ThreadService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/thread")
class ThreadController(val threadService: ThreadService) {
    @Operation(summary = "Experimental method")
    @GetMapping
    fun index() = threadService.infinity()
}