package com.bmk.mapstructexample.service

import com.bmk.mapstructexample.domain.dto.LibraryWithBooksDto
import com.bmk.mapstructexample.domain.model.Book
import com.bmk.mapstructexample.domain.model.Library
import com.bmk.mapstructexample.util.getBook
import com.bmk.mapstructexample.util.getLibrary
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.UUID

@Service
class LibraryService {

    fun getById(id: UUID): Library {
        return getLibrary()
    }

    fun getAllWithBooks(): List<LibraryWithBooksDto> {
        return listOf(
            LibraryWithBooksDto(
                getLibrary(),
                listOf(getBook())
            )
        )
    }
}