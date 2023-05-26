package com.bmk.mapstructexample.domain.dto.response

import java.util.UUID

data class LibraryResponse(
    val id: UUID,
    val name: String,
    val mail: String,
    val phoneNumber: String,
    val address: String
)
