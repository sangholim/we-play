package com.weplay.dataaccess.entity

import com.weplay.dataaccess.enum.AccountStatusType
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

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
@EntityListeners(AuditingEntityListener::class)
class Account(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val uid: String,
    val status: AccountStatusType,
    val name: String,
    val email: String,
    val phoneNumber: String,
    val password: String,
) {
    @CreatedDate
    var createdAt: Instant? = null

    @CreatedBy
    @Column(updatable = false)
    var createdBy: String? = null

    @LastModifiedDate
    var modifiedAt: Instant? = null

    @LastModifiedBy
    var modifiedBy: String? = null
}