package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDAO implements Sodas {

    // storage variable to hold all the sodas
    private List<Soda> sodas = new ArrayList<>();

    // Create some sodas
    public SodasDAO() {
        Soda cocaCola = new Soda("Coca-Cola", "Medium");
        cocaCola.setId(1L);
        sodas.add(cocaCola);

        Soda dietCoke = new Soda("Diet Coke", "Large");
        dietCoke.setId(2L);
        sodas.add(dietCoke);

        Soda pepsi = new Soda("Pepsi", "Small");
        pepsi.setId(3L);
        sodas.add(pepsi);

        Soda dietPepsi = new Soda("Diet Pepsi", "Large");
        dietPepsi.setId(4L);
        sodas.add(dietPepsi);
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
