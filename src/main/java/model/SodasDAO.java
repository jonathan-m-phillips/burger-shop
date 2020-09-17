package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDAO implements Sodas {

    // storage variable to hold all the sodas
    private List<Soda> sodas = new ArrayList<>();

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
