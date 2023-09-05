package org.marvic.appFacturas.models;

/**
 * @author nehemiasmunoz
 */
public class Product {
    private int id;
    private int lastId;
    private String name;
    private float price;

    public Product() {
        this.id = ++lastId;
    }

    public Product(String name, float price) {
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

    @Override
    public String toString() {
        return id +"\t"+ name+"\t"+ price ;
    }
}
