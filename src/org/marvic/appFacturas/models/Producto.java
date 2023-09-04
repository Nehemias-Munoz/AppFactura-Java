package org.marvic.appFacturas.models;

/**
 * @author nehemiasmunoz
 */
public class Producto {
    private int id;
    private int lastId;
    private String name;
    private float price;

    public Producto() {
        this.id = ++lastId;
    }

    public Producto(String name, float price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
