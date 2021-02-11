package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.upc.apptracing.entidades.Vehiculo;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

import android.util.Log;

public class DAOVehiculo {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOVehiculo(Context context) {
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        try {
            ContentValues values = new ContentValues();
            values.put("placa", vehiculo.getPlaca());
            values.put("gls_marca", vehiculo.getGls_marca());
            values.put("gls_modelo", vehiculo.getGls_modelo());
            values.put("anio", vehiculo.getAnio());

            long resultado = db.insert(Constantes.TB_VEHICULO, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarVehiculo", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarVehiculo", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOVehiculo: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
