package com.ropaapp.modelo.prendas;

import com.ropaapp.modelo.talles.Talle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tomás on 05/05/2015.
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
