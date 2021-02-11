package com.upc.apptracing.util;

import android.content.Context;

import com.upc.apptracing.dao.DAOCliente;
import com.upc.apptracing.dao.DAOClienteProducto;
import com.upc.apptracing.dao.DAOConductor;
import com.upc.apptracing.dao.DAOEstadosEntrega;
import com.upc.apptracing.dao.DAOProducto;
import com.upc.apptracing.dao.DAOPuntosEntrega;
import com.upc.apptracing.dao.DAOVehiculo;
import com.upc.apptracing.dao.DAOVehiculoConductor;
import com.upc.apptracing.entidades.Cliente;
import com.upc.apptracing.entidades.ClienteProducto;
import com.upc.apptracing.entidades.Conductor;
import com.upc.apptracing.entidades.EstadosEntrega;
import com.upc.apptracing.entidades.Producto;
import com.upc.apptracing.entidades.PuntosEntrega;
import com.upc.apptracing.entidades.Vehiculo;
import com.upc.apptracing.entidades.VehiculoConductor;

public class LoadDataBase {
    DAOEstadosEntrega daoEstadosEntrega;
    EstadosEntrega estadosEntrega;

    DAOVehiculo daoVehiculo;
    Vehiculo vehiculo;

    DAOConductor daoConductor;
    Conductor conductor;

    DAOCliente daoCliente;
    Cliente cliente;

    DAOProducto daoProducto;
    Producto producto;

    DAOClienteProducto daoClienteProducto;
    ClienteProducto clienteProducto;

    DAOVehiculoConductor daoVehiculoConductor;
    VehiculoConductor vehiculoConductor;

    DAOPuntosEntrega daoPuntosEntrega;
    PuntosEntrega puntosEntrega;

    public LoadDataBase(Context context) {
        loadEstadosEntrega(context);
        loadVehiculo(context);
        loadConductor(context);
        loadCliente(context);
        loadProducto(context);
        loadClienteProducto(context);
        loadVehiculoConductor(context);
        loadPuntosEntrega(context);
    }

    private void loadPuntosEntrega(Context context){
        daoPuntosEntrega = new DAOPuntosEntrega(context);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(1,1,1,1,"12/02/2021  13:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(1,2,2,1,"12/02/2021  14:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(1,3,3,1,"12/02/2021  15:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(1,4,4,1,"12/02/2021  16:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(1,5,4,1,"12/02/2021  17:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(1,6,6,1,"12/02/2021  18:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(2,7,1,1,"12/02/2021  10:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(2,8,2,1,"12/02/2021  12:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(2,9,3,1,"12/02/2021  14:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(2,10,4,1,"12/02/2021  16:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(2,11,5,1,"12/02/2021  17:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

        daoPuntosEntrega.openDB();
        puntosEntrega = new PuntosEntrega(2,12,6,1,"12/02/2021  18:00:00");
        daoPuntosEntrega.registrarPuntosEntrega(puntosEntrega);

    }

    private void loadVehiculoConductor(Context context){
        daoVehiculoConductor = new DAOVehiculoConductor(context);

        daoVehiculoConductor.openDB();
        vehiculoConductor = new VehiculoConductor("B0D-089",1);
        daoVehiculoConductor.registrarVehiculoConductor(vehiculoConductor);

        daoVehiculoConductor.openDB();
        vehiculoConductor = new VehiculoConductor("LXT-233",2);
        daoVehiculoConductor.registrarVehiculoConductor(vehiculoConductor);

        daoVehiculoConductor.openDB();
        vehiculoConductor = new VehiculoConductor("F5E-935",3);
        daoVehiculoConductor.registrarVehiculoConductor(vehiculoConductor);

        daoVehiculoConductor.openDB();
        vehiculoConductor = new VehiculoConductor("B9D-829",4);
        daoVehiculoConductor.registrarVehiculoConductor(vehiculoConductor);

    }

    private void loadClienteProducto(Context context){
        daoClienteProducto = new DAOClienteProducto(context);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(1,2);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(1,6);
        daoClienteProducto.registrarClienteProducto(clienteProducto);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(2,5);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(3,9);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(4,13);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(5,3);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(6,7);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(7,13);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(8,12);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(9,11);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(10,10);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(11,9);
        daoClienteProducto.registrarClienteProducto(clienteProducto);

        daoClienteProducto.openDB();
        clienteProducto = new ClienteProducto(12,8);
        daoClienteProducto.registrarClienteProducto(clienteProducto);
    }

    private void loadProducto(Context context) {
        daoProducto = new DAOProducto(context);

        daoProducto.openDB();
        producto = new Producto("TELEVISOR", "TELEVISOR SAMSUNG 50 UHD 4K,SMART TV,BLUETOOTH,AÑO 2020");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("TELEVISOR", "Televisor Sony XBR 85X855G LA8 85' 4K UHD Android Smart TV - Negro");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("LAPTOP", "LAPTOP HP 250 G7Intel Core i5-1035G1 8GB 1TB, LED 15.6 10ma Generacion");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("LAPTOP", "Laptop Hp Elitebook 850 G6 15.6' 8Gb Ram 256Gb");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("PLAYSTATION", "Consola Playstation 5 con lector de discos Ps5");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("PLAYSTATION", "Consola Playstation 4 Slim 1TB");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("LAVASECA", "Lavaseca 12Kg Lavado 7Kg Secado - SAMSUNG");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("REFRIGERADORA", "Refrigeradora 543 Lts SBS Black Edition");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("REFRIGERADORA", "Refrigeradora 432L RL4363SBABS");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("ASPIRADORA", "Aspiradora Recco 1400w Azul");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("ASPIRADORA", "Aspiradora Taurus Panamera 2.0 - Blanco/Negro");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("LICUADORA", "Licuadora Oster Xpert BLSTVB P00 051-Rojo/Negro");
        daoProducto.registrarProducto(producto);

        daoProducto.openDB();
        producto = new Producto("PARLANTE", "JBL Parlante Bluetooth Charge 4 Acuatico 30W Portatil");
        daoProducto.registrarProducto(producto);

    }

    private void loadCliente(Context context) {
        daoCliente = new DAOCliente(context);

        daoCliente.openDB();
        cliente = new Cliente("Helmut", "Rodriguez Torres", "44258758", "997263254", "Jr. Narciso de la Colina 1263, Surquillo");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Gonzalo", "Colchado Falco", "44446526", "997263254", "Av. Pardo y Aliaga 640, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Fatima", "Caro Mesia", "44152878", "997263254", "Las Orquideas 467, San Isidro");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Enrique", "Supo Gonzales", "44587458", "997263254", "Calle Berlin 172, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Pedro", "Jaimes Valera", "44268954", "997263254", "Av. Alfredo Benavides 1201, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Belquin", "Gutierrez Caro", "44154514", "997263254", "Calle Alcanfores 350C, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Miguel", "Huaytan Raymundo", "44415478", "997263254", "Calle Berlin 319, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Flor", "Roman Martinez", "44265897", "997263254", "Av. República de Panamá 5897, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Denis", "Marin Torres", "42254754", "997263254", "Av. Alfredo Benavides 2019, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Jesus", "Perez Huaman", "36985275", "997263254", "Av. la Paz 343, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Mafer", "Diaz Diaz", "25681568", "997263254", "Av. Mariscal Caceres 510, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("May", "Gastulo Cubillan", "25347618", "997263254", "Av. Guillermo Prescott 415, San Isidro");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Segundo", "Marcial Paredez", "51478524", "997263254", "Julio Cesar Tello 224, Lince");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Jhoana", "Avenio Rivera", "44257851", "997263254", "Calle Grimaldo del Solar 113, Miraflores");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Diego", "Villar Cuadros", "44147447", "997263254", "Av. Almte. Miguel Grau 302, Barranco");
        daoCliente.registrarCliente(cliente);

        daoCliente.openDB();
        cliente = new Cliente("Anthony", "Rivera Matta", "44188147", "997263254", "Jr. Carlos A. Salaverry 3686, Cercado de Lima");
        daoCliente.registrarCliente(cliente);

    }

    private void loadConductor(Context context) {
        daoConductor = new DAOConductor(context);

        daoConductor.openDB();
        conductor = new Conductor("Jhon", "Malmorejo Perez", "44452897", "admin1231", 1, "997521854", "586974389562", "31/12/21");
        daoConductor.registrarConductor(conductor);

        daoConductor.openDB();
        conductor = new Conductor("Eduardo", "Alcantara Torres", "44485728", "admin1241", 1, "997521854", "586974389562", "31/12/21");
        daoConductor.registrarConductor(conductor);

        daoConductor.openDB();
        conductor = new Conductor("Guillermo", "Inca Chalco", "44425865", "admin1251", 1, "997521854", "586974389562", "31/12/21");
        daoConductor.registrarConductor(conductor);

        daoConductor.openDB();
        conductor = new Conductor("Jose", "Nuñez Soto", "44412563", "admin1261", 1, "997521854", "586974389562", "31/12/21");
        daoConductor.registrarConductor(conductor);

    }

    private void loadVehiculo(Context context) {
        daoVehiculo = new DAOVehiculo(context);

        daoVehiculo.openDB();
        vehiculo = new Vehiculo("B0D-089", "TOYOTA", "SEDAN", 2009);
        daoVehiculo.registrarVehiculo(vehiculo);

        daoVehiculo.openDB();
        vehiculo = new Vehiculo("LXT-233", "LEXUS", "CAMION", 2012);
        daoVehiculo.registrarVehiculo(vehiculo);

        daoVehiculo.openDB();
        vehiculo = new Vehiculo("F5E-935", "HYUNDAI", "H1", 2013);
        daoVehiculo.registrarVehiculo(vehiculo);

        daoVehiculo.openDB();
        vehiculo = new Vehiculo("B9D-829", "DATSUN", "STANZA", 1978);
        daoVehiculo.registrarVehiculo(vehiculo);

    }

    private void loadEstadosEntrega(Context context) {
        daoEstadosEntrega = new DAOEstadosEntrega(context);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("En Almacen");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("Inicio de Carga");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("Fin de Carga");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("En Ruta");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("En Cliente");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("Entrega Aceptada");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

        daoEstadosEntrega.openDB();
        estadosEntrega = new EstadosEntrega("Entrega Rechazada");
        daoEstadosEntrega.registrarEstados(estadosEntrega);

    }

}
