package org.marvic.appFacturas.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private long id;
    private static long lastId;
    private String description;
    private Date date;
    private Customer customer;
    private ArrayList<ItemsFactura> item;

    public Factura() {
        this.id = ++lastId;
    }

    public Factura( String description, Date date) {
        this();
        this.description = description;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<ItemsFactura> getItems() {
        return item;
    }

    /***
     * AddItemFactura
     * añade un elemtento de tipo ItemsFactura a la lista
     * @param item
     */
    public void addItemFactura(ItemsFactura item){
         this.item.add(item);
    }

    /***
     * calculateTotal
     * Recorre la lista con productos sumando su valor
     * @return float valor total de la factura
     */
    public float calculateTotal(){
        float total = 0.0f;
        for (ItemsFactura item: getItems()) {
            total += item.calculateAmount();
        }
        return total;
    }

    /***
     * getDetails
     * Parrafo con formato e informacion de la factura
     * @return String Detalles de la factura
     */
    public String getDetails(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        StringBuilder detail = new StringBuilder("Factura N:");
        detail.append(id);
        detail.append("\nFecha: ")
                        .append(dateFormat.format(date));
        detail.append("\nCliente: ")
                .append(this.getCustomer().getName());
        detail.append("\t Rut: ")
                .append(customer.getRut());
        detail.append("\nDescripcion: ")
                .append(this.description)
                .append("\n");
        detail.append("\n #\t Nombre\tValor\tCantidad\tTotal\n");
        for (ItemsFactura item:this.getItems()) {
            detail.append(item.getProduct().getId())
                    .append("\t")
                    .append(item.getProduct().getName())
                    .append("\t")
                    .append(item.getProduct().getPrice())
                    .append("\t")
                    .append(item.getQuantity())
                    .append("\t")
                    .append(item.calculateAmount())
                    .append("\n");
        }
        detail.append("\nValor Total:")
                .append(calculateTotal());
        return detail.toString();
    }
}
