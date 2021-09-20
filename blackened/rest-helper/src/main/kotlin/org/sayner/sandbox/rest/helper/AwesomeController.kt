package org.sayner.sandbox.rest.helper

import io.swagger.v3.oas.annotations.Operation
import org.sayner.sandbox.rest.helper.getvaccpackage.*
import org.sayner.sandbox.rest.helper.paccList.*
import org.sayner.sandbox.rest.helper.patientPackageList.Attachment
import org.sayner.sandbox.rest.helper.patientPackageList.GetPatientVaccinationPackageListRequest
import org.sayner.sandbox.rest.helper.patientPackageList.GetPatientVaccinationPackageListResponse
import org.sayner.sandbox.rest.helper.patientPackageList.VaccinationPackageListItem
import org.sayner.sandbox.rest.helper.getvaccpackage.VaccinationPackage
import org.sayner.sandbox.rest.helper.getvaccpackage.PatientInfo
import org.slf4j.LoggerFactory.getLogger
import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
@RequestMapping("/api/vacc/soap/1")
class AwesomeController {
    private val logger = getLogger(AwesomeController::class.java)

    @GetMapping
    @Operation(summary = "Upload xlsx table")
    fun index() =
            "very good"

    @PostMapping("/lock-vacc-package")
    fun lockVacc(@RequestBody lockVaccPackageRequest: LockVaccPackageRequest): Empty {
        logger.info("very good: $lockVaccPackageRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return Empty()
    }

    @PostMapping("/unlock-vacc-package")
    fun unlockVacc(@RequestBody unlockVaccPackageRequest: UnlockVaccPackageRequest): Empty {
        logger.info("very fucking good: $unlockVaccPackageRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return Empty()
    }

    @PostMapping("/approve-vacc-fact")
    fun unlockVacc(@RequestBody approveVaccFactRequest: ApproveVaccFactRequest): Empty {
        logger.info("апрувд: $approveVaccFactRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return Empty()
    }

    @PostMapping("/reject-vacc-fact")
    fun unlockVacc(@RequestBody rejectVaccinationFactRequest: RejectVaccinationFactRequest): Empty {
        logger.info("fuck it : $rejectVaccinationFactRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return Empty()
    }

    @PostMapping("/reject-vacc-package")
    fun unlockVacc(@RequestBody rejectVaccPackageRequest: RejectVaccPackageRequest): Empty {
        logger.info("fuck it : $rejectVaccPackageRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return Empty()
    }

    @PostMapping("/revert-decision")
    fun unlockVacc(@RequestBody rejectDecisionRequest: RejectDecisionRequest): Empty {
        logger.info("fuck it : $rejectDecisionRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return Empty()
    }

    @PostMapping("/get-vacc-package")
    fun unlockVacc(@RequestBody getVaccinationPackageRestRequest: GetVaccinationPackageRestRequest):
            GetVaccinationPackageResponse {
        logger.info("damn package : $getVaccinationPackageRestRequest, ${Instant.now()}")
//        throw Exception("трах-ба-бах")
        return GetVaccinationPackageResponse(
                VaccinationPackage(
                        PatientInfo(
                                13
                        ),
                        "string",
                        "2020-09-02T06:34:32.270Z",
                        0,
                        "2020-09-02T06:34:32.270Z",
                        "string",
                        "string",
                        VaccinationFacts(
                                listOf(
                                        VaccinationFact(
                                                "string",
                                                "string",
                                                "string",
                                                "string",
                                                "string",
                                                "REJECTED",
                                                "string",
                                                "string",
                                                listOf(VaccinationInfections(
                                                        "covid",
                                                        0,
                                                        "string"
                                                )),
                                                "2020-09-02T06:34:32.270Z",
                                                "2020-09-02T06:34:32.270Z",
                                                "IMMUNODIAGNOSIS",
                                                "2020-09-02T06:34:32.270Z"
                                        )
                                )
                        ),
                        "2020-09-02T06:34:32.270Z",
                        "string",
                        true,
                        "REJECTED"
                )
        )
    }

    @PostMapping("/get-vacc-package-list")
    fun unlockVacc(@RequestBody getVaccinationPackageListRequest: GetVaccinationPackageListRequest):
            GetVaccinationPackageListResponse {
        logger.info("package list : $getVaccinationPackageListRequest, ${Instant.now()}")
        return GetVaccinationPackageListResponse(
                VaccinationPackageStatInfo(
                        0,
                        0
                ),
                PagingResults(
                        0,
                        0,
                        true,
                        0,
                        0
                ),
                VaccinationPackageList(
                        listOf(
                                org.sayner.sandbox.rest.helper.paccList.VaccinationPackageListItem(
                                        "2020-09-02T10:01:11.099Z",
                                        "2020-09-02T10:01:11.099Z",
                                        true,
                                        "111",
                                        org.sayner.sandbox.rest.helper.paccList.PatientInfo(
                                                0
                                        ),
                                        "2020-09-02T10:01:11.100Z",
                                        "REJECTED"
                                )
                        )
                )
        )
    }

    @PostMapping("/get-patient-vacc-package-list")
    fun unlockVacc(@RequestBody getPatientVaccinationPackageListRequest: GetPatientVaccinationPackageListRequest):
            GetPatientVaccinationPackageListResponse {
        logger.info("package list : $getPatientVaccinationPackageListRequest, ${Instant.now()}")
        return GetPatientVaccinationPackageListResponse(
                listOf(
                        org.sayner.sandbox.rest.helper.patientPackageList.VaccinationPackageListItem(
                                "2020-09-02T10:19:31.827Z",
                                "2020-09-02T10:19:31.827Z",
                                true,
                                "111",
                                "2020-09-02T10:19:31.827Z",
                                "REJECTED"
                        )
                ),
                PagingResults(
                        0,
                        0,
                        true,
                        0,
                        0
                ),
                org.sayner.sandbox.rest.helper.patientPackageList.PatientInfo(
                        0,
                        listOf(
                                Attachment(
                                        "1234",
                                        "1029384756",
                                        "431",
                                        "123143",
                                        true,
                                        696,
                                        "string"
                                )
                        )
                )
        )
    }
}
