package com.weplay.admin.config

import com.weplay.dataaccess.config.JpaConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import java.util.*

@Configuration
@ComponentScan(value = ["com.weplay.dataaccess"])
class DataAccessConfiguration: JpaConfiguration() {

    override fun auditorProvider() = AuditorAware { Optional.of("admin-api auditor") }
}