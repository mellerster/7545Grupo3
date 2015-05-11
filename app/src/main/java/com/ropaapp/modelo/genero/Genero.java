package com.ropaapp.modelo.genero;

/**
 * Representa el genero de las prendas.
 */
public enum Genero { NINIO, NINIA, BEBE, HOMBRE, MUJER;

    private String nombre;

    static {
        NINIO.nombre = "Niño";
        NINIA.nombre = "Niña";
        BEBE.nombre = "Bebé";
        HOMBRE.nombre = "Hombre";
        MUJER.nombre = "Mujer" ;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
