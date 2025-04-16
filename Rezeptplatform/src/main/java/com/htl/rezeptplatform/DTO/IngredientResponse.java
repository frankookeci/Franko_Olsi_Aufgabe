package com.htl.rezeptplatform.DTO;

import com.htl.rezeptplatform.entity.Recipe;
import jakarta.persistence.*;

import java.util.List;

public record IngredientResponse(
        Long id,
        String name,
        String unit) {


}
