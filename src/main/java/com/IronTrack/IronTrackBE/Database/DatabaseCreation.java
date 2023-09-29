package com.IronTrack.IronTrackBE.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;

@Component
public class DatabaseCreation implements EnvironmentAware {

    @Autowired
    private Environment environment;

    private String jdbcUrl;
    private String username;
    private String password;

    @Override
    public void setEnvironment(Environment environment) {

        this.jdbcUrl = environment.getProperty("spring.datasource.url");
        this.username = environment.getProperty("spring.datasource.username");
        this.password = environment.getProperty("spring.datasource.password");
        System.out.println(this.jdbcUrl);
    }

    public void createDatabase() {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Database operations will go here
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
