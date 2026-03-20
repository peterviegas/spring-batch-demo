package com.example.batch.batch.processor;

import com.example.batch.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductProcessor {

    @Bean
    public ItemProcesor<Product, Product> processor(){
        return product -> {
            product.setName(product.getName().toUpperCase());
            product.setProcessingVersion(1);
            return product;
        };
    }
}
