package com.ropaapp.vista;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ropaapp.R;
import com.ropaapp.modelo.Marca;

import java.util.List;

/**
 * Created by Tomás on 09/05/2015.
 */
public class MarcaAdapter extends ArrayAdapter<Pair<Marca, String>> {

    private Activity context;
    private List<Pair<Marca, String>> marcas;

    public MarcaAdapter(Activity context, List<Pair<Marca, String>> marcas) {
        super(context, R.layout.marca_adapter, R.id.nombre_marca, marcas);
        this.context = context;
        this.marcas = marcas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View marcaView = inflater.inflate(R.layout.marca_adapter, parent, false);
        ImageView logoMarca = (ImageView) marcaView.findViewById(R.id.logo_marca);
        logoMarca.setImageResource(context.getResources().getIdentifier(marcas.get(position).second,
                "drawable", context.getPackageName()));
        TextView nombreMarca = (TextView) marcaView.findViewById(R.id.nombre_marca);
        nombreMarca.setText(marcas.get(position).first.getNombre());
        return marcaView;
    }

}

