package com.example.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer processingVersion;

    public Product() {
    }

    public Product(Long id, String name, Integer processingVersion) {
        this.id = id;
        this.name = name;
        this.processingVersion = processingVersion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProcessingVersion() {
        return processingVersion;
    }

    public void setProcessingVersion(Integer processingVersion) {
        this.processingVersion = processingVersion;
    }
}
