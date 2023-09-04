package org.marvic.appFacturas.models;

public class ItemsFactura {
    private int amount;
    private Producto product;

    public ItemsFactura(int amount, Producto product) {
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }
}
