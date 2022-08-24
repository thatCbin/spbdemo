package com.cbin.demo.h

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author Cbin
 * @CreateDate 2022/8/23
 * @describe helloWord
 */

class HelloWord {
    @GetMapping("/get/h")
    fun h(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello $name"
    }

    @PostMapping("/post/h")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String?): String {
        return "Hello $name"
    }
}