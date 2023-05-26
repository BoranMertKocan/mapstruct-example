package com.bmk.mapstructexample.mapper

import com.bmk.mapstructexample.configuration.MappingConfiguration
import com.bmk.mapstructexample.domain.dto.LibraryWithBooksDto
import com.bmk.mapstructexample.domain.dto.response.LibraryWithBooksResponse
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.springframework.core.convert.converter.Converter

@Mapper(config = MappingConfiguration::class, uses = [BookToBookResponseMapper::class])
interface LibraryWithBooksDtoToLibraryWithBooksResponseMapper : Converter<LibraryWithBooksDto, LibraryWithBooksResponse> {

    @Mappings(
        Mapping(source = "library.id", target = "id"),
        Mapping(source = "library.name", target = "name")
    )
    override fun convert(source: LibraryWithBooksDto): LibraryWithBooksResponse
}