package com.example.demoserver.utils;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class DBConnection {
    @Value("${db.host}")
    private String dbHost;
    @Value("${db.port}")
    private String dbPort;
    @Value("${db.username}")
    private String dbUsername;
    @Value("${db.password}")
    private String dbPassword;


    @Bean
    public DataSource getDBConnection() {
        DriverManager config = new DriverManagerDataSource();
        config.setJdbcUrl("jdbc:mysql://" + dbHost + ":" + dbPort + "/mydatabase");
        config.setUsername(dbUsername);
        config.setPassword(dbPassword);
        return new HikariDataSource(config);
    }

}
