package com.bmk.mapstructexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class MapstructExampleApplication

fun main(args: Array<String>) {
    runApplication<MapstructExampleApplication>(*args)
}
