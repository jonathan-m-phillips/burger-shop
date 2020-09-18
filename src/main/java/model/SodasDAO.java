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

        Soda pepsi = new Soda("Pepsi", 3);
        pepsi.setId(3L);
        sodas.add(pepsi);

        Soda dietPepsi = new Soda("Diet Pepsi", 3);
        dietPepsi.setId(4L);
        sodas.add(dietPepsi);

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
