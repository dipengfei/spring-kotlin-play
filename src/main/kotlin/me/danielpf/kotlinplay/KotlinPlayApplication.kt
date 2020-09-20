package me.danielpf.kotlinplay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPlayApplication

fun main(args: Array<String>) {
	runApplication<KotlinPlayApplication>(*args)
}
