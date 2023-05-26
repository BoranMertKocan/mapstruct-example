package com.bmk.mapstructexample.domain.dto.response

import java.util.UUID

data class LibraryWithBooksResponse(
    val id: UUID,
    val name: String,
    val books: List<BookResponse>
)
