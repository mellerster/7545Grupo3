package com.ropaapp.modelo.prendas;

import com.ropaapp.modelo.talles.Talle;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa una prenda de vestir de un local y contiene unformacion acerca del stock de la misma.
 */
public abstract class Prenda {

    private String nombre;

    private Map<Talle, Integer> stockPorTalle = new HashMap<Talle, Integer>();

    public Map<Talle, Integer> getStockPorTalle() {
        return stockPorTalle;
    }

    public Prenda(String nombre) {
        this.nombre = nombre;
    }

    public void modificarStock(Talle talle, int cantidad) {
        stockPorTalle.put(talle, stockPorTalle.get(talle) + cantidad);
    }
}
