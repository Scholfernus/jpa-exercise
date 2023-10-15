package com.example.demo4.model;

import jakarta.persistence.*;

@Entity
public class UnitOfMeasure {
@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String description;

    @OneToOne
    private Ingredient ingredient;

    @Enumerated(EnumType.STRING)
    private EnumExample category;

    public UnitOfMeasure(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public UnitOfMeasure() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
