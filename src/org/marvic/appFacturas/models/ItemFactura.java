package org.marvic.appFacturas.models;

public class ItemFactura {
    private int quantity;
    private Product product;

    public ItemFactura(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    /***
     * CalculateAmount
     * @return float precio final productos
     */
    public float calculateAmount(){
        return  this.quantity * this.product.getPrice();
    }

    @Override
    public String toString() {
        return product +
                "\t" + quantity +
                "\t" + calculateAmount() ;
    }
}
