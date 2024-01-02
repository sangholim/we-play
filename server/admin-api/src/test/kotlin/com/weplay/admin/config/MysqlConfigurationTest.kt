package com.weplay.admin.config

import com.weplay.dataaccess.entity.Account
import com.weplay.dataaccess.service.AccountService
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
class MysqlConfigurationTest(
    private val accountService: AccountService
) : FunSpec({
    test("mysql configuration 테스트") {
        val savedAccount = Account(
            null, "a", "b", "c", "d", "a",
            LocalDateTime.now(), "a", LocalDateTime.now(), "a"
        ).let(accountService::save)

        savedAccount.id shouldNotBe null
    }
})