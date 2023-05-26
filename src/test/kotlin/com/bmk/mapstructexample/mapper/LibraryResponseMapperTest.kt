package com.bmk.mapstructexample.mapper

import com.bmk.mapstructexample.domain.dto.response.LibraryResponse
import com.bmk.mapstructexample.domain.model.Library
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.UUID


class LibraryResponseMapperTest {

    private val libraryResponseMapper = LibraryResponseMapperImpl()

    @Test
    fun `when libraryResponseMapper#convert is called it should correctly convert Library to LibraryResponse`() {
        // Given
        val library = library
        val expected = libraryResponse

        // When
        val actual = libraryResponseMapper.convert(library)

        // Then
        assertEquals(expected, actual)
    }

    companion object {
        private val library: Library = Library(
            id = UUID.fromString("b3aee4f6-8eb9-12ba-93c4-7670e7705338"),
            name = "Test Kütüphanesi",
            mail = "test@test.com",
            phoneNumber = "05550005500",
            address = "Test Mahallesi Test Sokak No Test Testköy Testanbul"
        )

        private val libraryResponse: LibraryResponse = LibraryResponse(
            id = UUID.fromString("b3aee4f6-8eb9-12ba-93c4-7670e7705338"),
            name = "Test Kütüphanesi",
            mail = "test@test.com",
            phoneNumber = "05550005500",
            address = "Test Mahallesi Test Sokak No Test Testköy Testanbul"
        )
    }
}