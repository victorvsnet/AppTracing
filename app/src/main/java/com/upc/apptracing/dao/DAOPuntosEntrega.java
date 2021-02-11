package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.PuntosEntrega;
import com.upc.apptracing.entidades.VehiculoConductor;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOPuntosEntrega {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOPuntosEntrega(Context context){
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarPuntosEntrega(PuntosEntrega puntosEntrega) {
        try {
            ContentValues values = new ContentValues();
            values.put("id_conductor", puntosEntrega.getId_conductor());
            values.put("id_cliente", puntosEntrega.getId_cliente());
            values.put("nro_orden", puntosEntrega.getNro_orden());
            values.put("estado", puntosEntrega.getEstado());
            values.put("fecha_hora", puntosEntrega.getFecha_hora());

            long resultado = db.insert(Constantes.TB_PUNTOS_ENTREGA, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> regPuntosEntrega", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> regPuntosEntrega", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOPuntosEntrega: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }
}
