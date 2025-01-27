package org.acme.getting.started;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/test/{className}")
    public String test(String className) throws ClassNotFoundException {
        Class clazz = Class.forName(className).asSubclass(org.postgresql.plugin.AuthenticationPlugin.class);
        return clazz.getName();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/test1/{className}")
    public String test1(String className) throws ClassNotFoundException {
        Class clazz = Class.forName(className);
        return clazz.getName();
    }
}