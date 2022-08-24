package com.cbin.demo.html

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author Cbin
 * @CreateDate 2022/8/24
 * @describe
 */
@RestController
class TestController {
    @GetMapping("/get/h")
    fun h(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello $name"
    }

    @PostMapping("/post/h")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String?): String {
        return "Hello $name"
    }
}