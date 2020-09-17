package model;

import java.io.Serializable;

public class Soda implements Serializable {

    private long id;
    private String sodaName;
    private int quantity;

    // zero-argument constructor
    public Soda() {}

    // constructor with all properties except the ID
    public Soda(String sodaName, int quantity) {
        this.sodaName = sodaName;
        this.quantity = quantity;
    }

    // getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSodaName() {
        return sodaName;
    }

    public void setSodaName(String sodaName) {
        this.sodaName = sodaName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
