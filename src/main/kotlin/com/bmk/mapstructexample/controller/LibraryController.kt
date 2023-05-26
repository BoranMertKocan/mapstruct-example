package com.bmk.mapstructexample.controller

import com.bmk.mapstructexample.domain.dto.response.LibraryResponse
import com.bmk.mapstructexample.domain.dto.response.LibraryWithBooksResponse
import com.bmk.mapstructexample.service.LibraryService
import org.springframework.core.convert.ConversionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/libraries")
class LibraryController(private val libraryService: LibraryService, private val conversionService: ConversionService) {

    @GetMapping
    fun getById(@RequestParam id: UUID): LibraryResponse {
        return conversionService.convert(libraryService.getById(id), LibraryResponse::class.java)!!
    }

    @GetMapping("/all")
    fun getAll(): List<LibraryWithBooksResponse> {
        return libraryService.getAllWithBooks().map { conversionService.convert(it, LibraryWithBooksResponse::class.java)!! }
    }
}