package com.weplay.admin.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.*

@Configuration
@ComponentScan(value = ["com.weplay.dataaccess"])
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
class DataAccessConfiguration {
    @Bean
    fun auditorProvider(): AuditorAware<String> = AuditorAware{ Optional.of("test")}
}