package com.weplay.dataaccess

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataAccessApplication

fun main(args: Array<String>) {
	runApplication<DataAccessApplication>(*args)
}
