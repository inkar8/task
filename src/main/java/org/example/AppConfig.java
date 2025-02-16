package com.beauty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.beauty.models.BeautyProduct;

import java.util.List;

@Configuration
@ComponentScan("com.beauty")
public class AppConfig {
    @Bean
    public List<BeautyProduct> beautyProducts() {
        return List.of(
                new BeautyProduct("Moisturizing Cream", "Hydrates and nourishes skin"),
                new BeautyProduct("Lip Balm", "Softens and protects lips"),
                new BeautyProduct("Face Serum", "Reduces wrinkles and brightens skin"),
                new BeautyProduct("Sunscreen SPF 50", "Protects from UV rays"),
                new BeautyProduct("Hair Oil", "Strengthens and nourishes hair")
        );
    }
}
