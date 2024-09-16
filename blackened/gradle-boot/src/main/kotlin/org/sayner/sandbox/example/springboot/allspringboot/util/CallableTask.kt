package org.sayner.sandbox.example.springboot.allspringboot.util

import org.slf4j.LoggerFactory.getLogger
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit.MILLISECONDS

class CallableTask:Callable<String> {
    private val logger = getLogger(CallableTask::class.java)
    override fun call(): String {
        logger.info("${this.hashCode()} - старт")
        MILLISECONDS.sleep(300)
        logger.info("${this.hashCode()} - стоп")
        return "THis is fucking awesome"
    }
}