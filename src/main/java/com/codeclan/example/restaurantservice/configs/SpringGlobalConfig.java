package com.codeclan.example.restaurantservice.configs;

import com.codeclan.example.restaurantservice.models.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
    public class SpringGlobalConfig implements RepositoryRestConfigurer, WebMvcConfigurer {

        private static final String CORS_BASE_PATTERN = "/**";
        private static final String ALLOWED_ORIGINS = "*";
        private static final String ALLOWED_HEADERS = "*";
        private static final String ALLOWED_METHODS = "*";

        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            config.exposeIdsFor(Customer.class, Restaurant.class, Dish.class, Order.class, Ingredient.class);
            config.getCorsRegistry()
                    .addMapping(CORS_BASE_PATTERN)
                    .allowedOrigins(ALLOWED_ORIGINS)
                    .allowedHeaders(ALLOWED_HEADERS)
                    .allowedMethods(ALLOWED_METHODS);
        }

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping(CORS_BASE_PATTERN)
                    .allowedOrigins(ALLOWED_ORIGINS)
                    .allowedHeaders(ALLOWED_HEADERS)
                    .allowedMethods(ALLOWED_METHODS);
        }
    }

