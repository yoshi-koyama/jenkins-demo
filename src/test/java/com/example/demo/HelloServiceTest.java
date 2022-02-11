package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = HelloService.class)
class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    void helloが取得できるか() {
        assertThat(helloService.hello()).isEqualTo("helloo");
    }
}
