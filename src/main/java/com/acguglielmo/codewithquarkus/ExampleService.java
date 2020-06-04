package com.acguglielmo.codewithquarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleService {

    public String hello() {
        return "hello";
    }

}
