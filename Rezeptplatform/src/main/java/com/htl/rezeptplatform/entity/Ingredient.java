package com.htl.rezeptplatform.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_seq")
    @SequenceGenerator(name = "ingredient_seq", sequenceName = "ingredient_id_seq", allocationSize=1)
    private Long id;

    private String name;
    private String unit;


    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

}
