package com.weplay.dataaccess.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.*
import java.util.function.Supplier

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
class JpaConfiguration {

    @Bean
    fun auditorProvider(auditorProviderImpl: Supplier<*>): AuditorAware<*> =
        AuditorAware { Optional.of(auditorProviderImpl.get()) }
}