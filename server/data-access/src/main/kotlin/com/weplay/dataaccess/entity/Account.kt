package com.weplay.dataaccess.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Account(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val name: String
)