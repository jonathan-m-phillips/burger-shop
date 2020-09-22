package model;
// This is the DAO Interface

import java.util.List;

// This interface will define all the methods we need to access the data from our Bean
// This is the interface the DAO will implement
public interface Burgers {

    // We need a method to go find a burger by its ID
    Long findById(long id);

    // get a list of all the burgers
    List<Burger> all();

//    public long createBurger(Burger burger);

}
