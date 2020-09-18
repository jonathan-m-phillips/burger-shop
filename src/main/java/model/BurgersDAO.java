package model;
// This is the DAO

import java.util.ArrayList;
import java.util.List;

// This class will implement the 'Burgers' interface
//     therefore, it must have all the methods defined in 'Burgers'
public class BurgersDAO implements Burgers {

    // Create a temporary list to hold the burgers as they are created
    private List<Burger> burgers = new ArrayList<>();
    Ingredients ing = DaoFactory.getIngredientsDao();

    public List<Ingredient> buildIngredientList(long[] list) {
        List<Ingredient> iList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            iList.add(ing.findById(list[i]));
        }
        return iList;
    }

    // Create some burgers that contain those ingredients
    public BurgersDAO() {

        // BigMac = Patty (x2), Buns (x3), Cheese (x2), Pickles (x3)
        long[] bigMacList = {7L, 10L, 4L, 1L};
        Burger bigMac = new Burger("Big Mac", buildIngredientList(bigMacList));
        bigMac.setId(1L);
        burgers.add(bigMac);

        // Homestyle = Patty (x1), Buns (x2), Pickles (x3), Tomatoes (x2)
        long[] hsList = {6L, 9L, 1L, 2L};
        Burger homestyle = new Burger("Homestyle", buildIngredientList(hsList));
        homestyle.setId(2L);
        burgers.add(homestyle);

        // Quarter Pounder = Buns (x2), Patty (x1), Pickles (x3), Cheese (x1)
        long[] qpList = {9L, 6L, 1L, 3L};
        Burger quarterPounder = new Burger("Quarter Pounder", buildIngredientList(qpList));
        quarterPounder.setId(3L);
        burgers.add(quarterPounder);
    }

    // If we had a MySQL connection instead of an ArrayList,
    //  the create and find methods would still do the exact same
    //  thing and return the exact same data types
    // And everywhere except this exact file has no idea what storage
    //  medium we are using


    // This method will search for a burger by its ID,
    //  and return the full Burger object
    @Override
    public Burger findById(long id) {
        // We want to find the burger with the ID that's passed in as an
        //  argument to this method
        // QUESTION: Are ArrayLists 1-indexed or 0-indexed?
        // ANSWER: 0-indexed
        // So to get the burger with an ID of 1, we need to get
        //  the element at index 0 of our 'burgers' ArrayList

        // ArrayList.get(index) expects 'index' to be an int, so we have
        //  to type-cast id from a long to an int
        return burgers.get((int)id-1);
    }

    // This method will create a Burger object in our
    //  local repository of burgers, and return the newly
    //  added burger's ID
    @Override
    public long createBurger(Burger burger) {
        // The ID for each burger should be 1-indexed
        //  to get the ID of a newly created burger, we'll get the size
        //  of the content 'burgers' list, and add 1 to it
        burger.setId(burgers.size() + 1);

        // Add the passed in 'Burger' object (burger) to our ArrayList
        burgers.add(burger);

        // Returning newly added burger's ID as a long value
        return burger.getId();
    }
}
