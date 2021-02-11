package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.ClienteProducto;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOClienteProducto {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOClienteProducto(Context context){
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarClienteProducto(ClienteProducto clienteProducto) {
        try {
            ContentValues values = new ContentValues();
            values.put("id_cliente", clienteProducto.getId_cliente());
            values.put("id_producto", clienteProducto.getId_producto());

            long resultado = db.insert(Constantes.TB_CLIENTE_PRODUCTO, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> regClienteProducto", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> regClienteProducto", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOClienteProd: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
