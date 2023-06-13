package com.example;

import io.quarkus.logging.Log;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.ext.Provider;

@Provider
@PreMatching
public class TestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) {
        Log.error("DO NOT WANT THIS FILTER, please exclude");

    }
}
