package org.marvic.appFacturas.models;

/***
 * @author nehemiasmunoz
 */
public class Cliente {
    private String name;
    private int rut;

    public Cliente() {
    }

    public Cliente(String name, int rut) {
        this.name = name;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}
