package com.example.batch.batch.reader;

import com.example.batch.entity.Product;
import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManagerFactory;

@Configuration
public class ProductReader {

    @Bean
    public JpaPagingItemReader<Product> reader(EntityManagerFactory emf) {

        JpaPagingItemReader<Product> reader = new JpaPagingItemReader<>();
        reader.setEntityManagerFactory(emf);
        reader.setQueryString(
                "SELECT p FROM Product p WHERE p.processingVersion IS NULL OR p.processingVersion < 1"
        );
        reader.setPageSize(5);
        reader.setSaveState(true);
        reader.setName("productReader");

        return reader;
    }
}
