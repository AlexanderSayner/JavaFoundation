package org.sayner.sandbox.example.springboot.allspringboot.controller

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.example.springboot.allspringboot.dto.BasicAnswer
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/xlsx")
class XlsxController {
    @Operation(summary = "Upload xlsx table")
    @PostMapping("/upload", consumes = ["multipart/form-data"])
    fun upload(@RequestParam("file") file: MultipartFile): ResponseEntity<BasicAnswer> {
        return ResponseEntity(BasicAnswer("s", "s"), OK)
    }
}
