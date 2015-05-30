package com.ropaapp.controlador;

import com.ropaapp.modelo.Marca;
import com.ropaapp.modelo.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementacion mockeada de los servicios que deberia brindar una base de datos.
 */
public class ServiciosMock {

    private static ServiciosMock instancia = null;

    private List<Marca> marcas;

    private List<Prenda> prendas;

    private ServiciosMock() {}

    public static ServiciosMock getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosMock();
        }
        return instancia;
    }

    public String getUrlBannerPantallaInicial() {
        return "http://www.tarjetasantanderrio.com.ar/online/promociones";
    }

    /**
     *
     * @return lista que contenga a las marcas que hay disponibles en la tienda virtual ordenadas
     * alfabeticamente segun su nombre
     */
    public List<Marca> getMarcasTiendaVirtual() {
        if (marcas == null) {
            crearMarcas();
        }
        return marcas;
    }

    private List<Marca> crearMarcas() {
        marcas = new ArrayList<Marca>();
        marcas.add(new Marca("47 Street", "logo_street"));
        marcas.add(new Marca("John L Cook", "logo_cook"));
        marcas.add(new Marca("Lee", "logo_lee"));
        marcas.add(new Marca("Wanama", "logo_wanama"));
        marcas.add(new Marca("Wrangler", "logo_wrangler"));

        return marcas;
    }

    public String getNombreDrawableBannerPantallaInicial() {
        return "banner_pantalla_inicial";
    }


}
