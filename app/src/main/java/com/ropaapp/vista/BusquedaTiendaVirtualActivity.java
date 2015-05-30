package com.ropaapp.vista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.ropaapp.R;
import com.ropaapp.controlador.ServiciosMock;
import com.ropaapp.modelo.Marca;

import java.util.ArrayList;
import java.util.List;

/**
 * Muestra la pantalla de busqueda de prendas de la tienda virtual.
 */
public class BusquedaTiendaVirtualActivity extends Activity {

    private ServiciosMock servicios = ServiciosMock.getInstancia();
    private List<Marca> marcas;
    private Marca marcaSeleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_tienda_virtual);
        crearSpinnerMarcas();
        crearBotonBuscar();
    }

    private void crearSpinnerMarcas() {
        marcas = servicios.getMarcasTiendaVirtual();
        Spinner marcasSpinner = (Spinner) findViewById(R.id.spinner_marca);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                getOpcionesSpinner(marcas));
        marcasSpinner.setAdapter(dataAdapter);
        marcasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageView logo = (ImageView) findViewById(R.id.logo_marca);
                if (position == 0) {
                    logo.setImageResource(0);
                    marcaSeleccionada = null;
                    return;
                }
                logo.setImageResource(getResources().getIdentifier(marcas.get(position-1).getLogo(),
                        "drawable", getPackageName()));
                marcaSeleccionada = marcas.get(position-1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private List<String> getOpcionesSpinner(List<Marca> marcas) {
        List<String> opcionesSpinner = new ArrayList<String>();
        opcionesSpinner.add(getString(R.string.seleccionar_marca));
        for (Marca marca : marcas) {
            opcionesSpinner.add(marca.getNombre());
        }
        return opcionesSpinner;
    }

    private void crearBotonBuscar() {
        Button botonBuscar = (Button) findViewById(R.id.buscar_boton);
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent busquedaTiendaVirtualIntent =
                        new Intent("com.ropaapp.vista.ResultadosTiendaVirtualActivity");
                startActivity(busquedaTiendaVirtualIntent);
                finish();
            }
        });
    }

}