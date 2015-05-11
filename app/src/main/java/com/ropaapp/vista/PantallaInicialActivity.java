package com.ropaapp.vista;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.ropaapp.R;
import com.ropaapp.controlador.ServiciosMock;

/**
 * Muestra la pantalla inicial de la aplicacion.
 */
public class PantallaInicialActivity extends Activity {

    private ServiciosMock servicios = ServiciosMock.getInstancia();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicial);
        crearBanner();
        crearBotonTiendaVirtual();
    }

    private void crearBanner() {
        ImageView banner = (ImageView) findViewById(R.id.banner_pantalla_inicial);
        banner.setImageResource(getResources().getIdentifier(
                servicios.getNombreDrawableBannerPantallaInicial(), "drawable", getPackageName()));
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(servicios.getUrlBannerPantallaInicial()));
                startActivity(browserIntent);
            }
        });
    }

    private void crearBotonTiendaVirtual() {
        Button botonTiendaVirtual = (Button) findViewById(R.id.tienda_virtual_boton);
        botonTiendaVirtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent busquedaTiendaVirtualIntent =
                        new Intent("com.ropaapp.vista.BusquedaTiendaVirtualActivity");
                startActivity(busquedaTiendaVirtualIntent);
                finish();
            }
        });
    }

}
