package org.sayner.sandbox.example.springboot.allspringboot.config

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary

class PostgresFoundationDatasourceConfiguration {
    @Bean
    @Primary
    @ConfigurationProperties("allspringboot.datasource.postgres.foundation")
    fun postgresFoundationDataSourceProperties() =
            DataSourceProperties()

    @Bean
    @Primary
    @ConfigurationProperties("allspringboot.datasource.postgres.foundation.configuration")
    fun postgresFoundationDataSource() =
            postgresFoundationDataSourceProperties().initializeDataSourceBuilder()
                    .type(HikariDataSource::class.java).build()!!
}
