package com.htl.rezeptplatform.service;

import com.htl.rezeptplatform.entity.Recipe;
import com.htl.rezeptplatform.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe createRecipe(Recipe recipe) {
        Recipe createdRecipe = recipeRepository.save(recipe);
        return createdRecipe;
    }


    public List<Recipe> returnRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipes;
    }
}
