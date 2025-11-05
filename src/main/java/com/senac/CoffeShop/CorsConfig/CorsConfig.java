package com.senac.CoffeShop.CorsConfig;// Exemplo de como seu CorsConfig pode estar configurado:

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/Ingredientes") // Aplica o CORS para todas as rotas (endpoints)
                // É o ideal para desenvolvimento, permite qualquer origem
                .allowedOrigins("http://localhost:8081")
                // Permite todos os métodos HTTP (GET, POST, PUT, DELETE, etc.)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(false);
    }
}