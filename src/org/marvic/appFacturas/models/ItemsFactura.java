package org.marvic.appFacturas.models;

public class ItemsFactura {
    private int quantity;
    private Producto product;

    public ItemsFactura(int quantity, Producto product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    /***
     * CalculateAmount
     * @return float precio final productos
     */
    public float calculateAmount(){
        return  this.quantity * this.product.getPrice();
    }
}
