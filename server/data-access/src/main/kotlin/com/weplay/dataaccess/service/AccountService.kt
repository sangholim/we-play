package com.weplay.dataaccess.service

import com.weplay.dataaccess.entity.Account
import com.weplay.dataaccess.repository.AccountRepository
import org.springframework.stereotype.Service

/**
 * 계정 서비스
 */
@Service
class AccountService(
    private val accountRepository: AccountRepository
) {
    /**
     * 계정 저장
     *
     * @param [account]
     * @return [Account]
     */
    fun save(account: Account): Account = accountRepository.save(account)
}