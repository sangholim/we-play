package com.weplay.dataaccess.repository

import com.weplay.dataaccess.entity.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository: CrudRepository<Account, Long>