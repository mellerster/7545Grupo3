package com.ropaapp.vista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.ropaapp.R;
import com.ropaapp.controlador.ServiciosMock;
import com.ropaapp.modelo.prendas.Prenda;

import java.util.List;

/**
 * Muestra los resultados de la busqueda de la Tienda Virtual.
 */
public class ResultadosTiendaVirtualActivity extends Activity {

    private ServiciosMock servicios = ServiciosMock.getInstancia();
    private List<Prenda> prendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_tienda_virtual);
        crearListaPrendasEnVenta();
    }

    private void crearListaPrendasEnVenta() {
        ListView listaPrendasEnVenta = (ListView) findViewById(R.id.lista_prendas_en_venta);
        //prendas = servicios.getPrendas();
        listaPrendasEnVenta.setAdapter(new PrendaEnVentaAdapter(this, prendas));
    }

}
