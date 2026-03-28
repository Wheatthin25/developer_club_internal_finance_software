package com.devwmu.dc_fin_soft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public Test test() {
        return new Test();
    }
}
