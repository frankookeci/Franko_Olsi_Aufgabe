package com.htl.rezeptplatform.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_seq")
    @SequenceGenerator(name = "recipe_seq", sequenceName = "recipe_id_seq", allocationSize=1)
    private Long id;

    private String title;
    private String description;
    private String category;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "recipe_ingredient", // Junction table name
            joinColumns = @JoinColumn(name = "recipe_id"), // Foreign key for Recipe
            inverseJoinColumns = @JoinColumn(name = "ingredient_id") // Foreign key for Ingredient
    )
    private List<Ingredient> ingredients;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}