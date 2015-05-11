package com.ropaapp.modelo;

import com.ropaapp.modelo.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a una marca tanto de la tienda virtual como propietaria de un local.
 */
public class Marca {

    private String nombre;
    private List<Prenda> prendas = new ArrayList<Prenda>();
    private String logo;

    /**
     *
     * @param nombre de la marca
     * @param logo nombre del recurso asociado al logo de la marca
     */
    public Marca(String nombre, String logo) {
        this.nombre = nombre;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

}
