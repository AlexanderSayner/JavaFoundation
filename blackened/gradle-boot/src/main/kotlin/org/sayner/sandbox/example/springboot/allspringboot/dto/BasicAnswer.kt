package org.sayner.sandbox.example.springboot.allspringboot.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class BasicAnswer(
        @JsonProperty("status") val status: String,
        @JsonProperty("message") val message: String
)
