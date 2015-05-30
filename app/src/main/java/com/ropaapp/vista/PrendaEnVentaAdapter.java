package com.ropaapp.vista;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ropaapp.R;
import com.ropaapp.modelo.prendas.Prenda;

import java.util.List;

/**
 * Adaptador para mostrar una prenda.
 */
public class PrendaEnVentaAdapter extends ArrayAdapter<Prenda> {

    private Activity context;
    private List<Prenda> prendas;

    public PrendaEnVentaAdapter(Activity context, List<Prenda> prendas) {
        super(context, R.layout.prenda_en_venta_adapter, prendas);
        this.context = context;
        this.prendas = prendas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista = inflater.inflate(R.layout.prenda_en_venta_adapter, parent, false);
        ImageView imagenPrenda = (ImageView) vista.findViewById(R.id.imagen_prenda);
        imagenPrenda.setImageResource(context.getResources().getIdentifier(prendas.get(position).getImagen(),
                "drawable", context.getPackageName()));
        TextView nombrePrenda = (TextView) vista.findViewById(R.id.nombre_prenda);
        nombrePrenda.setText(prendas.get(position).getNombre());
        TextView precioPrenda = (TextView) vista.findViewById(R.id.precio_prenda);
        precioPrenda.setText(Double.toString(prendas.get(position).getPrecio()));
        return vista;
    }

}