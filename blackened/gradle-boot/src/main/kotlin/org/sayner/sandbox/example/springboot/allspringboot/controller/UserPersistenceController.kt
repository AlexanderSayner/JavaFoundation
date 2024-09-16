package org.sayner.sandbox.example.springboot.allspringboot.controller

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.example.springboot.allspringboot.repository.persistant.UserPersistenceRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.lang.StringBuilder

@RestController
@RequestMapping("/api/persistence/user")
class UserPersistenceController(private val userPersistenceRepository: UserPersistenceRepository) {
    @Operation(summary = "Native hibernate logic")
    @GetMapping("/{email}")
    fun persistentEmail(@RequestParam id: Int) {
        userPersistenceRepository.getUserByEmail(id)
    }
}
