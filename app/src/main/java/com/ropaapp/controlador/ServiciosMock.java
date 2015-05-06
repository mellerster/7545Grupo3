package com.ropaapp.controlador;

/**
 * Created by Tomás on 05/05/2015.
 */
public class ServiciosMock {

    private static ServiciosMock instancia = null;

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

}
