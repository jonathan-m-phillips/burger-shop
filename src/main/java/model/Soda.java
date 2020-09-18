package model;

import java.io.Serializable;

public class Soda implements Serializable {

    private long id;
    private String sodaName;
    private String size;

    // zero-argument constructor
    public Soda() {}

    // constructor with all properties except the ID
    public Soda(String sodaName, String size) {
        this.sodaName = sodaName;
        this.size = size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
