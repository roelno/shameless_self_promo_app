package com.zeldaselfpromoapp

import java.io.Serializable

data class Message(
    val contactName: String,
    val contactNumber: String,
    val displayName: String,
    val includedJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
) : Serializable {

    fun getFullJobDescription() = if (includedJunior) "a Junior $jobTitle" else "an $jobTitle"

    fun getAvailability() = if(immediateStart) "immediately" else "from $startDate"
}