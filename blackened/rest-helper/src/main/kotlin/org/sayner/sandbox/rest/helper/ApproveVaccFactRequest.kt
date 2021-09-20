package org.sayner.sandbox.rest.helper

data class ApproveVaccFactRequest(
        val author: String,
        val vaccinationDocumentId: String,
        val vaccinationFactId: String
)
