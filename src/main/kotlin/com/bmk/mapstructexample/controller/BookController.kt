package com.bmk.mapstructexample.controller

import com.bmk.mapstructexample.domain.dto.response.BookResponse
import com.bmk.mapstructexample.service.BookService
import org.springframework.core.convert.ConversionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/books")
class BookController(private val bookService: BookService, private val conversionService: ConversionService) {

    @GetMapping
    fun getById(@RequestParam id: UUID): BookResponse {
        return conversionService.convert(bookService.getById(id), BookResponse::class.java)!!
    }
}