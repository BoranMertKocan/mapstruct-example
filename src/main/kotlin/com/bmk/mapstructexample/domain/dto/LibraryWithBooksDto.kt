package com.bmk.mapstructexample.domain.dto

import com.bmk.mapstructexample.domain.model.Book
import com.bmk.mapstructexample.domain.model.Library

data class LibraryWithBooksDto(
    val library: Library,
    val books: List<Book>
)
