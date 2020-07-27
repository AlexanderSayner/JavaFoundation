package org.sayner.sandbox.example.jetty.controller

import org.sayner.sandbox.example.jetty.services.HashMapService
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class RootController(private val hashMapService: HashMapService) {
    @GetMapping
    fun index() =
        ResponseEntity("awesome", OK)

    @GetMapping("collections/map/hashmap")
    fun hashmap() =
        ResponseEntity(hashMapService.hashMapExample(), OK)
}
