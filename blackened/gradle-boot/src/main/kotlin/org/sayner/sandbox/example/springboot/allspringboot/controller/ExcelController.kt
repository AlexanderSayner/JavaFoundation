package org.sayner.sandbox.example.springboot.allspringboot.controller

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.example.springboot.allspringboot.dto.BasicAnswer
import org.sayner.sandbox.example.springboot.allspringboot.service.ExcelService
import org.sayner.sandbox.example.springboot.allspringboot.util.hasXlsFormat
import org.sayner.sandbox.example.springboot.allspringboot.util.hasXlsxFormat
import org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/excel")
class ExcelController(
        private val excelService: ExcelService
) {
    @Operation(summary = "Upload xlsx table")
    @PostMapping("/upload", consumes = ["multipart/form-data"])
    fun upload(@RequestParam("file") file: MultipartFile): ResponseEntity<BasicAnswer> {
        when {
            hasXlsxFormat(file) -> excelService.saveXlsx(file)
            hasXlsFormat(file) -> excelService.saveXls(file)
            else -> return ResponseEntity(BasicAnswer("error", "unknown file format"), INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(BasicAnswer("s", "s"), OK)
    }
}
