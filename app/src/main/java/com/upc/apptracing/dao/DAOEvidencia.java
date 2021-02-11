package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.Evidencia;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOEvidencia {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOEvidencia(Context context){
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarEvidencia(Evidencia evidencia) {
        try {
            ContentValues values = new ContentValues();
            values.put("id_puntoentrega", evidencia.getId_puntoentrega());
            values.put("foto_evidencia", evidencia.getFoto_evidencia());
            values.put("gls_comentario", evidencia.getGls_comentario());

            long resultado = db.insert(Constantes.TB_EVIDENCIA, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarEvidencia", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarEvidencia", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOEvidencia: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
