package com.weplay.admin.config

import io.kotest.core.annotation.AutoScan
import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.spring.SpringExtension
import org.springframework.context.annotation.ComponentScan
import org.testcontainers.containers.MySQLContainer

@AutoScan
@ComponentScan(basePackages = ["com.weplay.datamigration"])
object ProjectConfig: AbstractProjectConfig() {
    private val mysqlContainer = MySQLContainer<Nothing>("mysql:5.7.34")

    override fun extensions() = listOf(SpringExtension)

    override suspend fun beforeProject() {
        mysqlContainer.start()
        System.setProperty("spring.profiles.active", "test")
        System.setProperty("spring.liquibase.changeLog", "classpath:/we-play/changelog/20240112_root_changelog.yaml")
        System.setProperty("spring.datasource.url", mysqlContainer.jdbcUrl)
        System.setProperty("spring.datasource.username", mysqlContainer.username)
        System.setProperty("spring.datasource.password", mysqlContainer.password)
    }

    override suspend fun afterProject() {
        mysqlContainer.stop()
    }
}
