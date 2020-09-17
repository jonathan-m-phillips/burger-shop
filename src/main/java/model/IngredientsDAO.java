package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients{

    // We want a storage variable to hold all the ingredients
    private List<Ingredient> ingredients = new ArrayList<>();

    // We want a method to find an ingredient by its id
    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int)id - 1);
    }

    // We want a method to add an ingredient to our list/cupboard/repository
    @Override
    public long createIngredient(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);
        ingredients.add(ingredient);
        return ingredient.getId();
    }
}
