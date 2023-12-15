package com.example.sb3gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT,properties = {"eureka.client.enabled=false"})
class Sb3GatewayApplicationTests {

    @Test
    void contextLoads() {
        assertNotNull(Sb3GatewayApplicationTests.class);
    }
}
