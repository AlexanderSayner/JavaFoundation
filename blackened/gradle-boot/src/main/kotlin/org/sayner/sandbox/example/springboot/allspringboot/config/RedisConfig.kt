package org.sayner.sandbox.example.springboot.allspringboot.config

import org.sayner.sandbox.example.springboot.allspringboot.model.Ruler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate

@Configuration
class RedisConfig {
    @Bean
    fun redisTemplate(connectionFactory: RedisConnectionFactory)
            : RedisTemplate<Int, Ruler> {
        val template = RedisTemplate<Int, Ruler>()
        template.setConnectionFactory(connectionFactory)
//         Add some specific configuration here. Key serializers, etc.
        return template
    }
}
