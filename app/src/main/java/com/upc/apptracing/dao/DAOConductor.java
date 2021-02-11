package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.Conductor;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOConductor {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOConductor(Context context){
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarConductor(Conductor conductor) {
        try {
            ContentValues values = new ContentValues();
            values.put("gls_nombre", conductor.getGls_nombre());
            values.put("gls_apellido", conductor.getGls_apellido());
            values.put("num_dni", conductor.getNum_dni());
            values.put("contrasenia", conductor.getContrasenia());
            values.put("estado", conductor.getEstado());
            values.put("num_telefono", conductor.getNum_telefono());
            values.put("num_licencia", conductor.getNum_licencia());
            values.put("fec_vencimiento", conductor.getFec_vencimiento());

            long resultado = db.insert(Constantes.TB_CONDUCTOR, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarConductor", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarConductor", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOConductor: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
