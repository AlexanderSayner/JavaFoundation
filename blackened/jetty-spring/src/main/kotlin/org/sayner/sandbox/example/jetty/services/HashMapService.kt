package org.sayner.sandbox.example.jetty.services

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service
import java.util.*

@Service
class HashMapService {
    fun hashMapExample(): String {
        val person1 = PersonKey("Bill")
        val person2 = PersonKey("Sam")
        val person3 = PersonKey("Dart")
        val hashMap = WeakHashMap<PersonKey, String>()
//        hashMap[1] = "en"
//        hashMap[2] = "to"
//        hashMap[3] = "tre"
//        hashMap[4] = "fire"
//        hashMap[5] = "fem"
//        hashMap[6] = "seks"
//        hashMap[7] = "syv"
//        hashMap[8] = "åtte"
//        hashMap[9] = "ni"
//        hashMap[10] = "ti"
        hashMap[person1] = "en"
        hashMap[person2] = "to"
        hashMap[person3] = "tre"
        return hashMap.toString()
    }
}

private class PersonKey(val name: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if((other as PersonKey).name != this.name) return false
        return true
    }

    override fun hashCode(): Int {
        return 1
    }

    override fun toString(): String {
        return ObjectMapper().writeValueAsString(this)
    }
}
