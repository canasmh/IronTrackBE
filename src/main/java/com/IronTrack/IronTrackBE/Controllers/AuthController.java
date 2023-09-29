package com.IronTrack.IronTrackBE.Controllers;

import com.IronTrack.IronTrackBE.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginForm loginform) {
        // Validate the loginDTO, hash and salt the password, and authenticate
        if (loginform.getEmail() == null || loginform.getPassword() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email and password are required.");
        }

        if (authService.authenticate(loginform.getEmail(), loginform.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }

//    @GetMapping("/login")
//    public ResponseEntity<String> login() {
//        System.out.println("It's hitting!");
//        return ResponseEntity.ok("Hello, World");
//    }
}
