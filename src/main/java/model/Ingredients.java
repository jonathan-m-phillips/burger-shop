package model;

public interface Ingredients {

    // We want a method to find an ingredient by its ID
    Ingredient findById(long id);

    // We want a method to create an ingredient and return newly created id
    long createIngredient(Ingredient ingredient);

}
