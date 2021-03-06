package org.sayner.sandbox.example.springboot.allspringboot.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.sayner.sandbox.example.springboot.allspringboot.model.Ruler
import org.sayner.sandbox.example.springboot.allspringboot.redis.repository.RulerRepository
import org.sayner.sandbox.example.springboot.allspringboot.util.xlsToModel
import org.sayner.sandbox.example.springboot.allspringboot.util.xlsxToModel
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ExcelService(
        private val rulerRepository: RulerRepository
) {
    private val logger = LoggerFactory.getLogger(ExcelService::class.java)

    fun saveXlsx(file: MultipartFile) {
        val xlsxList = xlsxToModel(file.inputStream)
        printList(xlsxList.distinct())
        logger.info("${saveToRedisList(xlsxList.distinct()).count()} records saved")
    }

    fun saveXls(file: MultipartFile) {
        val xlsList = xlsToModel(file.inputStream)
        printList(xlsList.distinct())
        logger.info("${saveToRedisList(xlsList.distinct()).count()} records saved")
    }

    fun saveToRedisList(list: List<Ruler>): MutableIterable<Ruler> =
            rulerRepository.saveAll(list)

    fun printList(list: List<Ruler>) {
        val objectMapper = ObjectMapper()
        list.forEach { ruler ->
            logger.info(objectMapper.writeValueAsString(ruler))
        }
    }
}
