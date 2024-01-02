package com.weplay.dataaccess.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

/**
 * 계정 엔티티
 *
 * @property id 테이블 일련번호
 * @property uid    uuid
 * @property name   이름
 * @property email  이메일
 * @property phoneNumber    휴대폰 번호
 * @property password       비밀번호
 * @property createdAt      생성일시
 * @property createdBy      생성자
 * @property modifiedAt     수정일시
 * @property modifiedBy     수정자
 */
@Entity
class Account(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val uid: String,
    val name: String,
    val email: String,
    val phoneNumber: String,
    val password: String,
    val createdAt: LocalDateTime,
    val createdBy: String,
    val modifiedAt: LocalDateTime,
    val modifiedBy: String
)