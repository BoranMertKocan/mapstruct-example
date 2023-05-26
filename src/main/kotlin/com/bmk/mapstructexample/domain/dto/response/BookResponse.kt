package com.bmk.mapstructexample.domain.dto.response

import java.time.Instant
import java.util.UUID

data class BookResponse(
    val id: UUID,
    val name: String,
    val writer: String,
    val publisher: String?,
    val pageSize: Int,
    val existingLibraries: List<LibraryResponse>,
    val transactionDate: Instant
)
