package com.upc.apptracing;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.upc.apptracing.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    List<ListElement> elements;

    private RecyclerView listRecyclerView;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        listRecyclerView = root.findViewById(R.id.listRecyclerView);

        init();
        return root;
    }

    private void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("Victor Yucra", "Jr. Narciso de la Colina, Surquillo", "Estado: En Ruta"));
        elements.add(new ListElement("Alberto Diaz", "Jr. Huaynacapac Mz P3 Lt 07, Comas", "Estado: En Ruta"));
        elements.add(new ListElement("Bruno Perez", "Alcanfores 582, Miraflores", "Estado: En Ruta"));
        elements.add(new ListElement("Elena Alcantara", "Comandante espinzar 356, San Isidro", "Estado: Entregado"));
        elements.add(new ListElement("Pilar Samaniego", "Av. Pardo y Aliaga 600, Miraflores", "Estado: Entregado"));
        elements.add(new ListElement("Santiago Solis", "Salaverry 150, Jesus Maria", "Estado: Entregado"));

        //Configuramos el recyclerview
        listRecyclerView.setHasFixedSize(true);
        listRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //Cargamos el adaptador
        ListAdapter listAdapter = new ListAdapter(elements, getContext());
        listRecyclerView.setAdapter(listAdapter);
    }
}