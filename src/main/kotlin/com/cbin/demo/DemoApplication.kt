package com.cbin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@RestController
class DemoApplication {
    @GetMapping("/get/h")
    fun h(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello $name"
    }

    @PostMapping("/post/h")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String?): String {
        return "Hello $name"
    }

}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}



