package org.sayner.sandbox.example.springboot.allspringboot.controller

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.example.springboot.allspringboot.model.AwesomeUser
import org.sayner.sandbox.example.springboot.allspringboot.repository.UserRepository
import org.sayner.sandbox.example.springboot.allspringboot.util.MultithreadingUtil
import org.slf4j.LoggerFactory.getLogger
import org.springframework.http.HttpStatus.OK
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController(private val userRepository: UserRepository) {
    private val logger = getLogger(UserController::class.java)

    @Operation(summary = "Get all users")
    @GetMapping
    fun get(): ResponseEntity<MutableList<AwesomeUser>> =
            ResponseEntity(
                    userRepository.findAll(),
                    OK
            )

    @Operation(summary = "Save new user")
    @PostMapping("/save")
    fun save(@RequestBody awesomeUser: AwesomeUser) =
            ResponseEntity(
                    userRepository.save(awesomeUser),
                    CREATED
            )

    @Operation(summary = "Save new users")
    @PostMapping("/save/all")
    fun save(@RequestBody awesomeUsers: List<AwesomeUser>) =
            ResponseEntity(
                    userRepository.saveAll(awesomeUsers),
                    CREATED
            )

    @Operation(summary = "Get user by e-mail")
    @GetMapping("/{email}")
    fun email(@RequestParam email: String) =
            ResponseEntity(
                    userRepository.findAllByEmailIn(listOf(email)),
                    OK
            )

    @Operation(summary = "Generate test data")
    @GetMapping("/generate/{count}")
    fun generate(@RequestParam count: Int): ResponseEntity<String> {
        val name = "test name"
        val email = "test@email"
        val password = "secret"

        var iterator = 1
        for (i in (1..count / 10 + 1)) {
            val list = linkedSetOf<AwesomeUser>()
            for (n in (1..10)) {
                val awesomeUser = AwesomeUser(null, name, email, password)
                logger.info("$i.$n | $iterator/$count")
                awesomeUser.name = iterator.toString().plus(' ').plus(awesomeUser.name).plus("v2")
                awesomeUser.email = email.plus("$iterator")
                list.add(awesomeUser)
                if (iterator++ == count) break
            }
            Thread(MultithreadingUtil(userRepository, list), "user-batch-$i").start()
        }
        return ResponseEntity(
                "$count items are saving",
                OK
        )
    }
}
