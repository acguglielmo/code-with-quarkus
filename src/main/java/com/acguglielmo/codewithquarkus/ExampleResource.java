package com.acguglielmo.codewithquarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    private final ExampleService exampleService;

    public ExampleResource() {

        exampleService = new ExampleService();

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return exampleService.hello();

    }
}