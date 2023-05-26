package com.bmk.mapstructexample.util

import com.bmk.mapstructexample.domain.model.Book
import com.bmk.mapstructexample.domain.model.Library
import java.util.UUID

fun getBook(): Book {
    return Book(
        id = UUID.fromString("a3aee4f6-8eb9-40ba-93c4-9570e7705339"),
        name = "Bitmeyen Kavga",
        writer = "John Steinbeck",
        publisher = null,
        pageSize = 300,
        existingLibraries = listOf(getLibrary())
    )
}

fun getLibrary(): Library {
    return Library(
        id = UUID.fromString("b3aee4f6-8eb9-12ba-93c4-7670e7705338"),
        name = "Test Kütüphanesi",
        mail = "test@test.com",
        phoneNumber = "05550005500",
        address = "Test Mahallesi Test Sokak No Test Testköy Testanbul"
    )
}