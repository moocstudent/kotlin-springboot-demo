package com.kotlinexample.kotlinspringbootdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringbootDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringbootDemoApplication>(*args)
}
