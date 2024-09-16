package org.sayner.sandbox.example.springboot.allspringboot.repository.persistant

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.sayner.sandbox.example.springboot.allspringboot.controller.UserPersistenceController
import org.sayner.sandbox.example.springboot.allspringboot.model.AwesomeUser
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Repository
import javax.persistence.EntityManagerFactory

@Repository
class UserPersistenceRepository(private val entityManagerFactory: EntityManagerFactory) {
    private val logger = LoggerFactory.getLogger(UserPersistenceController::class.java)
    private val sessionFactory = entityManagerFactory.unwrap(SessionFactory::class.java)
    private var counter = 0

    fun getUserByEmail(id: Int) {
        logger.info("Вызов метода поиска пользователя по id: $id")
        val session = sessionFactory.openSession()
        logger.info("Сессия успешно открыта")
        val load = session.load(AwesomeUser::class.java, id)
        logger.info("Добыт объект с email=${load.email}: $load")
        if (!session.isOpen) session.close()
        logger.info("Сессия закрыта")
        logger.info("Метод завершил своё выполнение ${++counter}")
    }
}
