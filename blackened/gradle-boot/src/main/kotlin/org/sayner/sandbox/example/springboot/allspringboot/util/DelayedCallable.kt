package org.sayner.sandbox.example.springboot.allspringboot.util

import java.util.concurrent.Callable
import java.util.concurrent.CountDownLatch


class DelayedCallable(
        private val name: String?,
        private val period: Long,
        private val latch: CountDownLatch?) : Callable<String> {
    override fun call(): String? {
        try {
            Thread.sleep(period)
            latch?.countDown()
        } catch (ex: InterruptedException) {
            // handle exception
            ex.printStackTrace()
            Thread.currentThread().interrupt()
        }
        return name
    }
}
