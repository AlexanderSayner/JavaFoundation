package org.sayner.sandbox.rest.helper

data class DoctorGetDocumentVersionResponseVersions(
        val eventStartDate: String,
        val authorRole: EnumkaThree,
        val documentId: String,
        val authorName: String,
        val authorSpeciality: String,
        val sections: List<DoctorGetDocumentVersionResponseVersionsSections>,
        val versionNumber: Int
)
