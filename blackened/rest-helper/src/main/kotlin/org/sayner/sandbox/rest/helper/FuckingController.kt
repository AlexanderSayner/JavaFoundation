package org.sayner.sandbox.rest.helper

import org.sayner.sandbox.rest.helper.history.DoctorGetDocumentVersionResponse
import org.sayner.sandbox.rest.helper.history.DocumentVersion
import org.sayner.sandbox.rest.helper.history.Sections
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
class FuckingController {
    private val logger = LoggerFactory.getLogger(FuckingController::class.java)

    @PostMapping("/api/form/1/history/doctor")
    fun history(@RequestBody doctorGetDocumentVersionRequest: DoctorGetDocumentVersionRequest): org.sayner.sandbox.rest.helper.history.DoctorGetDocumentVersionResponse {
        logger.info("fucking history: $doctorGetDocumentVersionRequest, ${Instant.now()}")

        return org.sayner.sandbox.rest.helper.history.DoctorGetDocumentVersionResponse(
                listOf(
                        DocumentVersion(
                                "date", "string", "DOCTOR",
//                listOf(
//                        Sections(
//                                true, "MENSTRUAL_CYCLE"
//                        ),
//                        Sections(
//                                false, "MENSTRUAL_CYCLE"
//                        )
//                ),
                                null,
                                "12",
                                13,
                                "Специальность"
                        )))
    }
}