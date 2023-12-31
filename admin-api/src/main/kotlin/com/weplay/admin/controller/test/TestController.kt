package com.weplay.admin.controller.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/tests")
    fun getTests(): String = "test"
}