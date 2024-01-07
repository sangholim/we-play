package com.weplay.admin.config

import com.weplay.dataaccess.entity.Account
import com.weplay.dataaccess.enum.AccountStatusType
import com.weplay.dataaccess.service.AccountService
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MysqlConfigurationTest(
    private val accountService: AccountService
) : FunSpec({
    test("mysql configuration 테스트") {
        Account(
            null, "a", AccountStatusType.ACIVE, "b", "c", "d", "a"
        ).let(accountService::save)
        val accounts = accountService.findAll()
        accounts shouldNotBe null
    }
})