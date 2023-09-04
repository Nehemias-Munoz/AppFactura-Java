package org.marvic.appFacturas.models;

import java.util.Date;

public class Factura {
    private long id;
    private String description;
    private Date date;

    public Factura(Date date) {
        this.date = date;
    }

    public Factura( String description, Date date) {
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
}
