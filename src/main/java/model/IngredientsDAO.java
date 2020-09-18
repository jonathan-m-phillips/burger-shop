package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients{

    // We want a storage variable to hold all the ingredients
    private List<Ingredient> ingredients = new ArrayList<>();

    // Create some ingredients to be used by default
    public IngredientsDAO() {
        // Pickles (x3)
        Ingredient pickles = new Ingredient();
        pickles.setId(1L);
        pickles.setIngredientName("Pickles (x3)");
        pickles.setQuantity(3);
        ingredients.add(pickles);

        // Tomatoes (x2)
        Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2L);
        tomatoes.setIngredientName("Tomatoes (x2)");
        tomatoes.setQuantity(2);
        ingredients.add(tomatoes);

        // Cheese (x1)
        Ingredient cheese = new Ingredient();
        cheese.setId(3L);
        cheese.setIngredientName("Cheese (x1)");
        cheese.setQuantity(1);
        ingredients.add(cheese);

        // Patty (x1)
        Ingredient singlePatty = new Ingredient();
        singlePatty.setId(4L);
        singlePatty.setIngredientName("Patty (x1)");
        singlePatty.setQuantity(1);
        ingredients.add(singlePatty);

        // Bun (x2)
        Ingredient twoBuns = new Ingredient();
        twoBuns.setId(5L);
        twoBuns.setIngredientName("Buns (x2)");
        twoBuns.setQuantity(2);
        ingredients.add(twoBuns);
    }

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
