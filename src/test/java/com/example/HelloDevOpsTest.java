package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloDevOpsTest {

    @Test
    void testMessage() {

        String message = HelloDevOps.getMessage();

        assertEquals("Hello from DevOps!", message);
    }
}