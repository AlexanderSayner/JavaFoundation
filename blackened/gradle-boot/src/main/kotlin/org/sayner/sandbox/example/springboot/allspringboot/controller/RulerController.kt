package org.sayner.sandbox.example.springboot.allspringboot.controller

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.example.springboot.allspringboot.dto.BasicAnswer
import org.sayner.sandbox.example.springboot.allspringboot.model.Ruler
import org.sayner.sandbox.example.springboot.allspringboot.redis.repository.RulerRepository
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/redis/ruler")
class RulerController(private val rulerRepository: RulerRepository) {
    @Operation(summary = "Get one from Redis")
    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): ResponseEntity<Ruler> {
        return ResponseEntity(
                rulerRepository.findById(id).orElse(Ruler(-1, "error", "error", "error")),
                OK
        )
    }

    @Operation(summary = "Upload entity to Redis")
    @PostMapping("/new")
    fun add(@RequestBody ruler: Ruler): ResponseEntity<BasicAnswer> {
        rulerRepository.save(ruler)
        return ResponseEntity(BasicAnswer("successful", "all done"), OK)
    }
}
