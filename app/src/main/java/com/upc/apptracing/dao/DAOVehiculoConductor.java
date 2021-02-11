package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.VehiculoConductor;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOVehiculoConductor {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOVehiculoConductor(Context context){
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarVehiculoConductor(VehiculoConductor vehiculoConductor) {
        try {
            ContentValues values = new ContentValues();
            values.put("placa", vehiculoConductor.getPlaca());
            values.put("id_conductor", vehiculoConductor.getId_conductor());

            long resultado = db.insert(Constantes.TB_VEHICULO_CONDUCTOR, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarVehCondu", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarVehCondu", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOVehiculoCondu: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
