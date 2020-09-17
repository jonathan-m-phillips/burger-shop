package model;
// This is the DAO Interface

// This interface will define all the methods we need to access the data from our Bean
// This is the interface the DAO will implement
public interface Burgers {

    // We need a method to go find a burger by its ID
    Burger findById(long id);

    // We need a method to create a new burger, and return the ID(long) once it is successfully created
    long createBurger(Burger burger);
}
