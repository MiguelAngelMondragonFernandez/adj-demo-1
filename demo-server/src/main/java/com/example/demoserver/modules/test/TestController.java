package com.example.demoserver.modules.test;

@Controller
@RequestMapping("/adj-api/test")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

    @GetMapping("")
    public ResponseEntity<?> hello() {
        return "Hello, World!";
    }
}
