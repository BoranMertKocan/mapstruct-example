package com.bmk.mapstructexample.configuration

import org.mapstruct.MapperConfig
import org.mapstruct.extensions.spring.SpringMapperConfig

@SpringMapperConfig
@MapperConfig(componentModel = "spring")
interface MappingConfiguration
