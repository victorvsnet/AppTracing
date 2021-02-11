package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.EstadosEntrega;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOEstadosEntrega {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOEstadosEntrega(Context context) {
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarEstados(EstadosEntrega estados) {
        try {
            ContentValues values = new ContentValues();
            values.put("gls_estado", estados.getGls_estado());

            long resultado = db.insert(Constantes.TB_ESTADOS_ENTREGA, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarEstados", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarEstados", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOEstadosEntrega: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
