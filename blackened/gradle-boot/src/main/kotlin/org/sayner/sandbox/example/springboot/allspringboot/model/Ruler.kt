package org.sayner.sandbox.example.springboot.allspringboot.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash("rulers")
data class Ruler(
        @Id
        @get:JsonProperty("plu")
        val plu: Int,
        @get:JsonProperty("description")
        val description: String,
        @get:JsonProperty("horizontal")
        val horizontal: String,
        @get:JsonProperty("vertical")
        val vertical: String
)
