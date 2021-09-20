package org.sayner.sandbox.rest.helper

data class DoctorGetDocumentVersionRequest (
        val author: String,
        val cctCode:String,
        val patientId:String,
        val sectionTitle:List<EnumkaOne>
)
