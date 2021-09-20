package org.sayner.sandbox.rest.helper

data class RejectVaccinationFactRequest(
        val author: String,
        val rejectionReasonId: Int,
        val vaccinationFactId: String
)
