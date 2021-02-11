package com.upc.apptracing;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @NonNull
    @Override
    public com.upc.apptracing.ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element, null);
        return new com.upc.apptracing.ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull com.upc.apptracing.ListAdapter.ViewHolder holder, int position) {
        ListElement item = mData.get(position);
        holder.bindData(item);
    }

    public void setItems(List<ListElement> items) {
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, city, status;
        ImageButton btnGps, btnLlamar;
        Button btnCliente;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTextView);
            city = itemView.findViewById(R.id.cityTextView);
            status = itemView.findViewById(R.id.statusTextView);
            btnGps = itemView.findViewById(R.id.btnGps);
            btnLlamar = itemView.findViewById(R.id.btnLlamar);
            btnCliente = itemView.findViewById(R.id.btnEnCliente);
        }

        void bindData(final ListElement item) {
            name.setText(item.getName());
            city.setText(item.getCity());
            status.setText(item.getStatus());

            btnGps.setOnClickListener(v -> {
                Log.d("", "click en boton GPS");
                onClickClienteGPS();
            });

            btnCliente.setOnClickListener(v -> {
                Log.d("", "click en boton Cliente");
                onClickEntregado();
            });
            btnLlamar.setOnClickListener(v -> {
                Log.d("", "click en boton Llamar");
                onClickClienteDetalles();
            });
        }
    }

    private void onClickClienteDetalles() {
        Intent miIntent = new Intent(context, ContactActivity.class);
        context.startActivity(miIntent);
    }

    private void onClickClienteGPS() {
        Intent miIntent = new Intent(context, MapsActivity.class);
        context.startActivity(miIntent);
    }

    private void onClickEntregado() {
        Intent miIntent = new Intent(context, EvidenciaActivity.class);
        context.startActivity(miIntent);
    }
}
