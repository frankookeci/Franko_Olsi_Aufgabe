package com.htl.rezeptplatform.controller;

import com.htl.rezeptplatform.DTO.IngredientResponse;
import com.htl.rezeptplatform.entity.Ingredient;
import com.htl.rezeptplatform.entity.Recipe;
import com.htl.rezeptplatform.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }


    @PostMapping
    public ResponseEntity<Ingredient> createRecipe(@RequestBody Ingredient ingredient) {
        Ingredient ingredient1 = ingredientService.createIngredient(ingredient);
        return ResponseEntity.ok().body(ingredient1);
    }

    @GetMapping("/getAll")
    public List<IngredientResponse> getIngredientService() {
        List<IngredientResponse> ingredients = ingredientService.returnIngredients();
        return ingredients;
    }


}
