package dev.usenkonastia.lab3java.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
        info = @Info(
                title = "Random Quotes",
                description = "Laboratory work 3 Java",
                version = "1.0.0"
        )
)
public class SwaggerConfig {
}