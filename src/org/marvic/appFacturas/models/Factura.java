package org.marvic.appFacturas.models;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private long id;
    private static long lastId;
    private String description;
    private Date date;
    private Cliente cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemsFactura> getItems() {
        return item;
    }

    public void addItemFactura(ItemsFactura item){
         this.item.add(item);
    }
}
