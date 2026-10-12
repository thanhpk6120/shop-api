package com.poc.buggy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class BugController {

    @GetMapping("/calculate")
    public Object calculate(@RequestParam(value = "divisor", required = false) Integer divisor) {
        if (divisor == null || divisor == 0) {
            return "Cannot divide by zero";
        }
        return String.valueOf(100 / divisor);
    }
}
