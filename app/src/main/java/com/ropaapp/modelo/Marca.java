package com.ropaapp.modelo;

import android.util.Pair;

import com.ropaapp.modelo.prendas.Prenda;
import com.ropaapp.modelo.talles.Talle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa a una marca tanto de la tienda virtual como propietaria de un local.
 */
public class Marca {

    private String nombre;
    private List<Map<Pair<Prenda, Talle>, Integer>> prendas = new ArrayList<Map<Pair<Prenda, Talle>, Integer>>();
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

    public List<Map<Pair<Prenda, Talle>, Integer>> getPrendas() {
        return prendas;
    }

    public void agregarPrenda(Pair<Prenda, Talle> prenda, int stock) {
        Map<Pair<Prenda, Talle>, Integer> mapa = new HashMap<Pair<Prenda, Talle>, Integer>();
        mapa.put(prenda, stock);
        prendas.add(mapa);
    }

}
