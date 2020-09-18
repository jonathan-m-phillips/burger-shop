package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDAO implements Sodas {

    // storage variable to hold all the sodas
    private List<Soda> sodas = new ArrayList<>();

    // Create some sodas
    public SodasDAO() {
        Soda cocaCola = new Soda("Coca-Cola", 3);
        cocaCola.setId(1L);
        sodas.add(cocaCola);

        Soda dietCoke = new Soda("Diet Coke", 3);
        dietCoke.setId(2L);
        sodas.add(dietCoke);

//        Soda cokeZero = new Soda();
//        cokeZero.setId(3L);
//        cokeZero.setSodaName("Coke Zero");
//
//        Soda pepsi = new Soda();
//        pepsi.setId(4L);
//        pepsi.setSodaName("Pepsi");
//
//        Soda dietPepsi = new Soda();
//        dietPepsi.setId(5L);
//        dietPepsi.setSodaName("Diet Pepsi");
//
//        Soda pepsiMax = new Soda();
//        pepsiMax.setId(6L);
//        pepsiMax.setSodaName("Pepsi Max");
//
//        Soda sprite = new Soda();
//        sprite.setId(7L);
//        sprite.setSodaName("Sprite");
//
//        Soda drPepper = new Soda();
//        drPepper.setId(8L);
//        drPepper.setSodaName("Dr. Pepper");
    }

    @Override
    public Soda findById(long id) {
        return sodas.get((int)id - 1);
    }

    @Override
    public long createSoda(Soda soda) {
        soda.setId(sodas.size() + 1);
        sodas.add(soda);
        return soda.getId();
    }
}
