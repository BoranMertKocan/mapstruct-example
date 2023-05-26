package com.bmk.mapstructexample.mapper

import com.bmk.mapstructexample.configuration.MappingConfiguration
import com.bmk.mapstructexample.domain.model.Book
import com.bmk.mapstructexample.domain.dto.response.BookResponse
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.springframework.core.convert.converter.Converter
import java.time.Instant

@Mapper(config = MappingConfiguration::class, imports = [Instant::class])
interface BookToBookResponseMapper : Converter<Book, BookResponse> {

    @Mappings(
        Mapping(source = "writer", target = "publisher", conditionExpression = "java(source.getPublisher()==null)"),
        Mapping(target = "transactionDate", expression = "java(Instant.now())")
    )
    override fun convert(source: Book): BookResponse
}