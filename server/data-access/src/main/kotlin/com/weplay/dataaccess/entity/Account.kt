package com.weplay.dataaccess.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

/**
 * 계정 엔티티
 *
 * @property id 계정 일련번호
 * @property name 계정 이름
 */
@Entity
class Account(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val name: String
)