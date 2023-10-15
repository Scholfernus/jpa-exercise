package com.example.demo4.model.zad3;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Car extends Vehicle{
private String brand;
private String color;
}
