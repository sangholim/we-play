package com.weplay.admin.config

import io.kotest.core.annotation.AutoScan
import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.spring.SpringExtension
import org.testcontainers.containers.MySQLContainer

@AutoScan
object ProjectConfig: AbstractProjectConfig() {
    private val mysqlContainer = MySQLContainer<Nothing>("mysql:5.7.34")

    override fun extensions() = listOf(SpringExtension)

    override suspend fun beforeProject() {
        mysqlContainer.start()
        System.setProperty("spring.profiles.active", "test")
        System.setProperty("spring.datasource.url", mysqlContainer.jdbcUrl)
        System.setProperty("spring.datasource.username", mysqlContainer.username)
        System.setProperty("spring.datasource.password", mysqlContainer.password)
    }

    override suspend fun afterProject() {
        mysqlContainer.stop()
    }
}
