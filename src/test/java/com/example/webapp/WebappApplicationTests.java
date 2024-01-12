package com.example.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class WebappApplicationTests {

    @Autowired
    private YourServiceClass yourService;

    @Test
    void contextLoads() {
        // Basic test to check that the application context loads successfully
        assertNotNull(yourService);
    }
}
