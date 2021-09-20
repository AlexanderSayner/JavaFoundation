package org.sayner.sandbox.example.springboot.allspringboot.util

import org.sayner.sandbox.example.springboot.allspringboot.controller.UserController
import java.util.concurrent.TimeUnit.MILLISECONDS
import org.slf4j.LoggerFactory.getLogger
class RunnableTask :Runnable {
    private val logger = getLogger(RunnableTask::class.java)
    override fun run() {
        logger.info("${this.hashCode()} - старт")
        MILLISECONDS.sleep(100)
        logger.info("${this.hashCode()} - стоп")
    }
}