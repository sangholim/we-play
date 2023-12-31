package com.weplay.dataaccess.repository

import com.weplay.dataaccess.entity.User
import org.springframework.data.repository.Repository

interface UserRepository: Repository<User, Long>