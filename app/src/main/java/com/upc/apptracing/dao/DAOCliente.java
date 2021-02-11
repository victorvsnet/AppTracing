package com.upc.apptracing.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.upc.apptracing.entidades.Cliente;
import com.upc.apptracing.util.Constantes;
import com.upc.apptracing.util.DBHelper;

public class DAOCliente {
    DBHelper dbHelper;
    SQLiteDatabase db;
    private Context context;

    public DAOCliente(Context context) {
        dbHelper = new DBHelper(context);
        this.context = context;
    }

    public void openDB() {
        db = dbHelper.getWritableDatabase();
    }

    public void registrarCliente(Cliente cliente) {
        try {
            ContentValues values = new ContentValues();
            values.put("gls_nombre", cliente.getGls_nombre());
            values.put("gls_apellido", cliente.getGls_apellido());
            values.put("num_dni", cliente.getNum_dni());
            values.put("num_telefono", cliente.getNum_telefono());
            values.put("gls_direccion", cliente.getGls_direccion());

            long resultado = db.insert(Constantes.TB_CLIENTE, null, values);

            if (resultado == -1) {
                //Toast.makeText(context, "Error al insertar", Toast.LENGTH_SHORT).show();
                Log.i("==> registrarCliente", "Error al insertar");
            } else {
                //Toast.makeText(context, "Se registró correctamente->" + resultado, Toast.LENGTH_SHORT).show();
                Log.i("==> registrarCliente", "Se registró correctamente");
            }
        } catch (Exception e) {
            //Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.i("==> DAOCliente: ", e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }
}
