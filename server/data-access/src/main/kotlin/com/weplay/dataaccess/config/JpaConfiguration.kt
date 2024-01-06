package com.weplay.dataaccess.config

import org.springframework.context.annotation.Bean
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.*

/**
 * Jpa 설정 관리 클래스
 * auditing 활성화
 * auditing 제공자 활성화 함수 제공
 *
 */
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
open class JpaConfiguration {

    /**
     * auditing 제공자 객체 생성
     * 엔티티 데이터 변경시 생성한 사람, 수정한 사람 데이터를 기록할수 있다.
     * @return [AuditorAware]
     */
    @Bean
    open fun auditorProvider(): AuditorAware<*> =
        AuditorAware { Optional.ofNullable(null) }
}