package com.example.demo4.model.zad3;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Bike extends Vehicle{
private String model;
private String cost;
}
