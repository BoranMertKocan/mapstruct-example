package com.bmk.mapstructexample.domain.model

import java.util.UUID

data class Book(
    val id: UUID,
    val name: String,
    val writer: String,
    val publisher: String?,
    val pageSize: Int,
    val existingLibraries: List<Library>
)
