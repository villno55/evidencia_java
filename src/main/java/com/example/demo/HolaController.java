package com.example.demo;

import org.springframework.web.bind.annotation. GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org. springframework. web. bind. annotation. RestController;

@RestController
public class HolaController {

@GetMapping("/hola")
public String hola() {
return "Hola pana desde Spring Boot";
}
 @PostMapping("/hola")
    public String holaPost() {
        return "Hola pana desde POST";
    }

}