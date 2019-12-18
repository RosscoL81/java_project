package com.codeclan.example.restaurantservice.configs;

<<<<<<< HEAD
import com.codeclan.example.restaurantservice.models.*;
=======
import com.codeclan.example.restaurantservice.models.Customer;
import com.codeclan.example.restaurantservice.models.Dish;
import com.codeclan.example.restaurantservice.models.Order;
import com.codeclan.example.restaurantservice.models.Restaurant;
>>>>>>> 1682970ede3e982a938b1a0d5a821fac52b6ab0e
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
<<<<<<< HEAD
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
=======
public class SpringGlobalConfig implements RepositoryRestConfigurer, WebMvcConfigurer {

    private static final String CORS_BASE_PATTERN = "/**";
    private static final String ALLOWED_ORIGINS = "*";
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Order.class, Dish.class, Restaurant.class, Customer.class);
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
>>>>>>> 1682970ede3e982a938b1a0d5a821fac52b6ab0e
