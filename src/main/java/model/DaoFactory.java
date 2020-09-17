package model;
// This is the DAO Factory

// This class is used as a window into every Bean type we create.
// This class has a magic claw for each Bean type.
public class DaoFactory {

    // We don't want to require accessing the BurgersDAO directly,
    //  instead we will reference its interface
    private static Burgers burgersDao;

    // Any Bean type we have will get a method called:
    //  get[Bean]Dao()
    public static Burgers getBurgersDao (){
        if (burgersDao == null) {
            burgersDao = new BurgersDAO();
        }
        return burgersDao;
    }

    private static Ingredients ingredientsDao;

    public static Ingredients getIngredientsDao() {
        if (ingredientsDao == null) {
            ingredientsDao = new IngredientsDAO();
        }
        return ingredientsDao;
    }

    private static Sodas sodasDao;

    public static Sodas getSodasDao() {
        if (sodasDao == null) {
            sodasDao = new SodasDAO();
        }
        return sodasDao;
    }
}
