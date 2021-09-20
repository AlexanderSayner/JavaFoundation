package org.sayner.sandbox.rest.helper

data class RejectVaccPackageRequest (
        val author:String,
        val rejectionReasonId:Int,
        val vaccinationPackageId:String
)
