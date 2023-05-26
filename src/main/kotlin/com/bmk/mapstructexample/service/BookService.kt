package com.bmk.mapstructexample.service

import com.bmk.mapstructexample.domain.model.Book
import com.bmk.mapstructexample.domain.model.Library
import com.bmk.mapstructexample.util.getBook
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class BookService {

    fun getById(id: UUID): Book {
        return getBook()
    }
}