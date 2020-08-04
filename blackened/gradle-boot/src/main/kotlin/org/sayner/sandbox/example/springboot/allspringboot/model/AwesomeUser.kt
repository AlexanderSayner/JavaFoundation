package org.sayner.sandbox.example.springboot.allspringboot.model

import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "user", schema = "all_spring_boot")
@Cacheable
@Cache(usage = READ_WRITE)
data class AwesomeUser(
        @Id
        @GeneratedValue(strategy = IDENTITY)
        var id: Int?,
        var name: String,
        var email: String,
        var password: String)
