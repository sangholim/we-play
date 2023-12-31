package com.weplay.dataaccess.repository

import com.weplay.dataaccess.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.Repository

interface UserRepository: CrudRepository<User, Long>