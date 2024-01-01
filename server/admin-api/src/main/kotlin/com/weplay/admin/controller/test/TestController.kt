package com.weplay.admin.controller.test

import com.weplay.dataaccess.entity.Account
import com.weplay.dataaccess.repository.AccountRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val accountRepository: AccountRepository
) {

    @GetMapping("/tests")
    fun getTests()= Account(null, "a").let(accountRepository::save)
}