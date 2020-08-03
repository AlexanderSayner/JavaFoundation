package org.sayner.sandbox.example.springboot.allspringboot.repository

import org.sayner.sandbox.example.springboot.allspringboot.model.AwesomeUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.validation.ReportAsSingleViolation

@Repository
interface UserRepository : JpaRepository<AwesomeUser, Int> {
    fun findAllByEmailIn(email: Collection<String>)
            : Collection<AwesomeUser>
}
