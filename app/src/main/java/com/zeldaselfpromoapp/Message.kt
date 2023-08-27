package com.zeldaselfpromoapp

data class Message(
    val contactName: String,
    val contactNumber: String,
    val displayName: String,
    val includedJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
)