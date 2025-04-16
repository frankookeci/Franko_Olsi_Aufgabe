package com.htl.rezeptplatform.DTO.Mapper;

import com.htl.rezeptplatform.DTO.IngredientResponse;
import com.htl.rezeptplatform.entity.Ingredient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IngredientMapper {

    public IngredientResponse toIngredientResponse(Ingredient ingredient) {
        return new IngredientResponse(
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getUnit()
        );
    }


    public List<IngredientResponse> toIngredientResponseList(List<Ingredient> ingredients) {
        return ingredients.stream()
                .map(this::toIngredientResponse)
                .collect(Collectors.toList());
    }
}
