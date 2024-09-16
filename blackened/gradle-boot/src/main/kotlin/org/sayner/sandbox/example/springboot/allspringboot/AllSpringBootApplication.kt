package org.sayner.sandbox.example.springboot.allspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AllSpringBootApplication

fun main(args: Array<String>) {
	runApplication<AllSpringBootApplication>(*args)
}
