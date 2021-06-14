package com.example.h2zoo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mammals {

    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String species;
    private final String color;
    private final String dietType;

    public Mammals(String name, String species, String color, String dietType) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.dietType = dietType;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getDietType() {
        return dietType;
    }

    public void setName(){

    }

    public void setSpecies(){

    }

    public void setColor(){

    }

    public void setDietType(){

    }
}
