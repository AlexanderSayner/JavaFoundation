package org.sayner.sandbox.example.springboot.allspringboot.service

import org.sayner.sandbox.example.springboot.allspringboot.controller.UserController
import org.sayner.sandbox.example.springboot.allspringboot.util.DelayedCallable
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Service
import java.util.concurrent.CompletionService
import java.util.concurrent.CountDownLatch
import java.util.concurrent.ExecutorCompletionService
import java.util.concurrent.Executors.newFixedThreadPool

@Service
class ThreadService {
    private val logger = getLogger(UserController::class.java)
    private val executor = newFixedThreadPool(4)
    fun get(): String {
        val service: CompletionService<String> = ExecutorCompletionService(executor)

        val callables = mutableListOf(
                DelayedCallable("fast thread", 100, null),
                DelayedCallable("slow thread", 3000, null),
                DelayedCallable("really slow thread", 7000, null)
        )

        for (callable in callables) {
            service.submit(callable)
        }

        val startProcessingTime = System.currentTimeMillis()

        var future = service.take()
        val firstThreadResponse = future.get()
        logger.info("First response should be from the fast thread: $firstThreadResponse")

//        assertTrue("First response should be from the fast thread", "fast thread" == firstThreadResponse)
//        assertTrue(totalProcessingTime >= 100
//                && totalProcessingTime < 1000)
        var totalProcessingTime = System.currentTimeMillis() - startProcessingTime
        logger.info("Thread finished after: " + totalProcessingTime
                + " milliseconds")

        future = service.take()
        val secondThreadResponse = future.get()
        logger.info("Second response should be from the slow thread: $secondThreadResponse")

        future = service.take()
        val lastThreadResponse = future.get()
        logger.info("Last response should be from the really slow thread: $lastThreadResponse")

//        assertTrue("Last response should be from the slow thread", "slow thread" == secondThreadResponse)
//        assertTrue(totalProcessingTime >= 3000
//                && totalProcessingTime < 4000)

        totalProcessingTime = System.currentTimeMillis() - startProcessingTime
        logger.info("Thread finished after: " + totalProcessingTime
                + " milliseconds")

//        awaitTerminationAfterShutdown(WORKER_THREAD_POOL)

        logger.info("метод закончился")
        return "конец"
    }

    fun infinity(): String {
        val service = ExecutorCompletionService<String>(executor)
        val latch = CountDownLatch(10001)
        val callables = ArrayList<DelayedCallable>(10001)
        logger.info("Старт инициализации")
        for (i in (1..10001)) {
            val random = (0..15).random()
            val delayedCallable = DelayedCallable("Random task $i : $random sec", random.toLong(), latch)
            callables.add(delayedCallable)
            service.submit(delayedCallable)
            logger.info("Задача $i добавлена")
        }
        logger.info("Конец цикла инициализации")
        for (i in (1..10001)) {
            val take = service.take()
            logger.info("Беру результат: ${take.get()}")
        }
        logger.info("метод закончился")
        return "конец"
    }

    fun countDownLatch(){

    }
}
