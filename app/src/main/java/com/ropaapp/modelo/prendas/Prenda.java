package com.ropaapp.modelo.prendas;

/**
 * Representa una prenda de vestir de un local.
 */
public abstract class Prenda {

    private String nombre;

    private String imagen;

    private double precio;

    public Prenda(String nombre, String imagen, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }
}
