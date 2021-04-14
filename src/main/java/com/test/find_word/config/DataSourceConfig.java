package com.test.find_word.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    // prefix = "spring.datasource" -> application.properties [spring.datasource.some.some]
    // application.properties to @ConfigurationProperties -> create build datasource.[application.properties]

}
