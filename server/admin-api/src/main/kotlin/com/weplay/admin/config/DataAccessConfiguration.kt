package com.weplay.admin.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import java.util.function.Supplier

@Configuration
@ComponentScan(value = ["com.weplay.dataaccess"])
class DataAccessConfiguration {

    @Bean
    fun auditorProviderImpl() = Supplier { "admin-api-test" }
}