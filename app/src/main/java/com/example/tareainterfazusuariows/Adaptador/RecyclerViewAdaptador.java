package com.example.tareainterfazusuariows.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareainterfazusuariows.R;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.MyViewHolder> {
    Context contexto;
    List<Adaptador> datos;

    public RecyclerViewAdaptador(Context context, List<Adaptador> dato) {
        this.contexto = context;
        this.datos = dato;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(contexto).inflate(R.layout.chatitem,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nombre.setText(datos.get(position).getNombre());
        holder.mensaje.setText(datos.get(position).getMensaje());
        holder.imagen.setImageResource(datos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private TextView mensaje;
        private ImageView imagen;

        public MyViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.idnombre);
            mensaje = itemView.findViewById(R.id.idmensaje);
            imagen = itemView.findViewById(R.id.imagenView);

        }
    }
}
