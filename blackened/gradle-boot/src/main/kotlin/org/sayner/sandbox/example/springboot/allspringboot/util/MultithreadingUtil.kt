package org.sayner.sandbox.example.springboot.allspringboot.util

import org.sayner.sandbox.example.springboot.allspringboot.model.AwesomeUser
import org.sayner.sandbox.example.springboot.allspringboot.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.stream.Collectors.toSet

@Component
class MultithreadingUtil(
        private val userRepository: UserRepository,
        private val awesomeUsers: Collection<AwesomeUser>
) : Runnable {
    private val logger = LoggerFactory.getLogger(MultithreadingUtil::class.java)

    override fun run() {
        logger.info("Going to save ${awesomeUsers.size} items")
        val allByNameOrEmailIn = userRepository.findAllByEmailIn(
                awesomeUsers.stream().map(AwesomeUser::email).collect(toSet())
        )
        awesomeUsers.forEach { awesomeUser ->
            awesomeUser.id =
                    allByNameOrEmailIn
                            .stream()
                            .filter { it.email == awesomeUser.email}
                            .findFirst()
                            .orElse(AwesomeUser(null, "", "", ""))
                            .id
        }
        userRepository.saveAll(awesomeUsers)
        userRepository.flush()
    }
}
