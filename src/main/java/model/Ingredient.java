package model;

import java.io.Serializable;

// We want this class to represent a burger ingredient
public class Ingredient implements Serializable {

    // 1. long id
    private long id;
    // 2. String name
    private String ingredientName;
    // 3. int quantity
    private int quantity;


    // zero-argument constructor
    public Ingredient() {}

    // constructor with all properties except the ID
    public Ingredient(String ingredientName, int quantity) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }

    // all getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
