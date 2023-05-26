package com.bmk.mapstructexample.mapper

import com.bmk.mapstructexample.configuration.MappingConfiguration
import com.bmk.mapstructexample.domain.model.Library
import com.bmk.mapstructexample.domain.dto.response.LibraryResponse
import org.mapstruct.Mapper
import org.springframework.core.convert.converter.Converter

@Mapper(config = MappingConfiguration::class)
interface LibraryResponseMapper : Converter<Library, LibraryResponse>