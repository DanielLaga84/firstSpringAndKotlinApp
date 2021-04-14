package com.example.firstspringandkotlinapp

import com.example.firstspringandkotlinapp.configuration.BlogProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class FirstSpringAndKotlinAppApplication

fun main(args: Array<String>) {
    runApplication<FirstSpringAndKotlinAppApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
