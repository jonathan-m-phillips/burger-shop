package model;

import java.util.ArrayList;
import java.util.List;

public interface Ingredients {

    // We want a storage variable to hold all the ingredients
    List<Ingredient> ingredients = new ArrayList<>();

    // We want a method to find an ingredient by its ID
    Ingredient findById(long id);

    // We want a method to add an ingredient to our list/cupboard/repository
    long addIngredient(Ingredient ingredient);

}
