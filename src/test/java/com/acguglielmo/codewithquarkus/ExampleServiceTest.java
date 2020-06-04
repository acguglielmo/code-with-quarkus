package com.acguglielmo.codewithquarkus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExampleServiceTest {

    @Test
    public void shouldReturnHelloTest() {

        assertEquals("hello", new ExampleService().hello() );

    }
    
}
