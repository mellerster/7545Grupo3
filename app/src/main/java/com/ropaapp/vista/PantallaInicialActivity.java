package com.ropaapp.vista;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ropaapp.R;
import com.ropaapp.controlador.ServiciosMock;

/**
 * Created by Tomás on 05/05/2015.
 */
public class PantallaInicialActivity extends Activity {

    private ServiciosMock servicios = ServiciosMock.getInstancia();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicial);

        ImageView banner = (ImageView) findViewById(R.id.banner_pantalla_inicial);
        banner.setImageResource(R.drawable.banner_pantalla_inicial);
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(servicios.getUrlBannerPantallaInicial()));
                startActivity(browserIntent);
            }
        });

    }

}
