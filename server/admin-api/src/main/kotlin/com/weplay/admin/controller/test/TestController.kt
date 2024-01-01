package com.weplay.admin.controller.test

import com.weplay.dataaccess.entity.Account
import com.weplay.dataaccess.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val accountService: AccountService
) {
    @GetMapping("/tests")
    fun getTests(): Account = Account(null, "a").let(accountService::save)
}