package org.sayner.sandbox.example.springboot.allspringboot.redis.repository

import org.sayner.sandbox.example.springboot.allspringboot.model.Ruler
import org.springframework.data.keyvalue.repository.KeyValueRepository

interface RulerRepository : KeyValueRepository<Ruler, Int>
