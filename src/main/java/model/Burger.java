package model;
// This is the Bean

import java.io.Serializable;
import java.util.List;

public class Burger implements Serializable {

    // properties all need to be private, when implementing MVC structure to our code

    // must be able to differentiate each burger from the rest, so a unique key is needed
    private long id;

    private String burgerName;

    // TODO: Segment the condiments out into their own bean (i.e. public class Ingredient)
     private List<Ingredient> ingredients;

    // We have to create a 'zero-argument' constructor, so that Java can reserve space in memory for this object
    public Burger() {}

    // constructor
    public Burger(String burgerName, List<Ingredient> ingredientList) {
        // set each of the local class properties, to the arguments passed into this constructor
        this.burgerName = burgerName;
        this.ingredients = ingredientList;
    }


    // getters and setters
    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}