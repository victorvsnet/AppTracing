package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.Producto;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOProducto {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOProducto(Context context){
        dbHelper = new DBHelper(context);
        this.context = context;
    }


    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarProducto(Producto producto) {
        try {
            ContentValues values = new ContentValues();
            values.put("gls_producto", producto.getGls_producto());
            values.put("gls_descripcion", producto.getGls_descripcion());

            long resultado = db.insert(Constantes.TB_PRODUCTO, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarProducto", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarProducto", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOProducto: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }


}
