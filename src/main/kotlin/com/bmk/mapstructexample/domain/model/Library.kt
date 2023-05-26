package com.bmk.mapstructexample.domain.model

import java.util.UUID

data class Library(
    val id: UUID,
    val name: String,
    val mail: String,
    val phoneNumber: String,
    val address: String
)
