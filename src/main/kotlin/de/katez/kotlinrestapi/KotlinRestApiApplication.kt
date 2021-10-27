package de.katez.kotlinrestapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@SpringBootApplication
class KotlinRestApiApplication

fun main(args: Array<String>) {
    runApplication<KotlinRestApiApplication>(*args)
}