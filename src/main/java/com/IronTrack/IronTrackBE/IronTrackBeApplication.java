package com.IronTrack.IronTrackBE;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import com.IronTrack.IronTrackBE.Database.DatabaseCreation;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class IronTrackBeApplication implements CommandLineRunner {

    @Autowired
    private DatabaseCreation databaseCreation;

    public static void main(String[] args) {
        SpringApplication.run(IronTrackBeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create the database
        databaseCreation.createDatabase();
    }
}
