package com.htl.rezeptplatform.service;

import com.htl.rezeptplatform.DTO.IngredientResponse;
import com.htl.rezeptplatform.DTO.Mapper.IngredientMapper;
import com.htl.rezeptplatform.entity.Ingredient;
import com.htl.rezeptplatform.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository ingredientRepository;
    private final IngredientMapper ingredientMapper;

    public IngredientService(IngredientRepository ingredientRepository, IngredientMapper ingredientMapper) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientMapper = ingredientMapper;
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        Ingredient createdIngredient = ingredientRepository.save(ingredient);
        return createdIngredient;
    }

    public List<IngredientResponse> returnIngredients() {
        List<Ingredient> getIngredients = ingredientRepository.findAll();
        List<IngredientResponse> ingredientResponses = ingredientMapper.toIngredientResponseList(getIngredients);
        return ingredientResponses;
    }
}
