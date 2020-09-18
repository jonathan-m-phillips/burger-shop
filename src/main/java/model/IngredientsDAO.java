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

        // Cheese (x2)
        Ingredient doubleCheese = new Ingredient();
        doubleCheese.setId(4L);
        doubleCheese.setIngredientName("Cheese (x1)");
        doubleCheese.setQuantity(2);
        ingredients.add(doubleCheese);

        // Cheese (x3)
        Ingredient tripleCheese = new Ingredient();
        tripleCheese.setId(5L);
        tripleCheese.setIngredientName("Cheese (x1)");
        tripleCheese.setQuantity(3);
        ingredients.add(tripleCheese);

        // Patty (x1)
        Ingredient singlePatty = new Ingredient();
        singlePatty.setId(6L);
        singlePatty.setIngredientName("Patty (x1)");
        singlePatty.setQuantity(1);
        ingredients.add(singlePatty);

        // Patty (x2)
        Ingredient doublePatty = new Ingredient();
        doublePatty.setId(7L);
        doublePatty.setIngredientName("Patty (x1)");
        doublePatty.setQuantity(2);
        ingredients.add(doublePatty);

        // Patty (x3)
        Ingredient triplePatty = new Ingredient();
        triplePatty.setId(8L);
        triplePatty.setIngredientName("Patty (x1)");
        triplePatty.setQuantity(3);
        ingredients.add(triplePatty);

        // Bun (x2)
        Ingredient twoBuns = new Ingredient();
        twoBuns.setId(9L);
        twoBuns.setIngredientName("Buns (x2)");
        twoBuns.setQuantity(2);
        ingredients.add(twoBuns);

        // Bun (x3)
        Ingredient threeBuns = new Ingredient();
        threeBuns.setId(10L);
        threeBuns.setIngredientName("Buns (x2)");
        threeBuns.setQuantity(3);
        ingredients.add(threeBuns);
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
