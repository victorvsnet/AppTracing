package com.upc.apptracing.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, Constantes.NOMBRE_BD, null, Constantes.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_VEHICULO +
                        " (placa TEXT PRIMARY KEY NOT NULL," +
                        " gls_marca TEXT NOT NULL," +
                        " gls_modelo TEXT NOT NULL," +
                        " anio INTEGER NOT NULL);";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_CONDUCTOR +
                        " (id_conductor INTEGER PRIMARY KEY AUTOINCREMENT," +
                        " gls_nombre TEXT NOT NULL," +
                        " gls_apellido TEXT NOT NULL," +
                        " num_dni TEXT NOT NULL," +
                        " contrasenia TEXT NOT NULL," +
                        " estado INTEGER NOT NULL DEFAULT 1," +
                        " num_telefono TEXT NOT NULL," +
                        " num_licencia TEXT NOT NULL," +
                        " fec_vencimiento TEXT NOT NULL);";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_VEHICULO_CONDUCTOR +
                        " (placa TEXT NOT NULL," +
                        " id_conductor INTEGER NOT NULL," +
                        " PRIMARY KEY (placa,id_conductor));";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_CLIENTE +
                        " (id_cliente INTEGER PRIMARY KEY AUTOINCREMENT," +
                        " gls_nombre TEXT NOT NULL," +
                        " gls_apellido TEXT NOT NULL," +
                        " num_dni TEXT NOT NULL," +
                        " num_telefono TEXT NOT NULL," +
                        " gls_direccion TEXT NOT NULL);";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_PRODUCTO +
                        " (id_producto INTEGER PRIMARY KEY AUTOINCREMENT," +
                        " gls_producto TEXT NOT NULL," +
                        " gls_descripcion TEXT NOT NULL);";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_CLIENTE_PRODUCTO +
                        " (id_cliente INTEGER NOT NULL," +
                        " id_producto INTEGER NOT NULL," +
                        " PRIMARY KEY (id_cliente,id_producto));";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_PUNTOS_ENTREGA +
                        " (id_puntoentrega INTEGER PRIMARY KEY AUTOINCREMENT," +
                        " id_conductor INTEGER NOT NULL," +
                        " id_cliente INTEGER NOT NULL," +
                        " nro_orden INTEGER NOT NULL," +
                        " estado INTEGER NOT NULL DEFAULT 1," +
                        " fecha_hora TEXT NOT NULL);";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_ESTADOS_ENTREGA +
                        " (id_estado INTEGER PRIMARY KEY AUTOINCREMENT," +
                        " gls_estado TEXT NOT NULL);";

        db.execSQL(query);


        query =
                "CREATE TABLE IF NOT EXISTS " + Constantes.TB_EVIDENCIA +
                        " (id_evidencia INTEGER NOT NULL," +
                        " id_puntoentrega INTEGER NOT NULL," +
                        " foto_evidencia INTEGER NOT NULL," +
                        " gls_comentario TEXT NOT NULL," +
                        " PRIMARY KEY (id_evidencia,id_puntoentrega));";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
