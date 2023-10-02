package com.IronTrack.IronTrackBE.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class DemoController {
    @GetMapping("/")
    public ResponseEntity<String> sayHello() {
        System.out.println("Okay.. this is odd");
        return ResponseEntity.ok("Hello, World!");
    };
}
