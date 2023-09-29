package com.IronTrack.IronTrackBE.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.IronTrack.IronTrackBE.Repository.UserRepo;
import com.IronTrack.IronTrackBE.Entity.UserEntity;


@Service
public class AuthService {
    @Autowired
    private UserRepo userRepo; // Assuming you have a repository for user data

    public boolean authenticate(String email, String password) {
        // Add authentication logic here, e.g., checking against the database
        // You may also need to hash and salt the password before comparing
        UserEntity user = userRepo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}

