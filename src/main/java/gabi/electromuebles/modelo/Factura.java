/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabi.electromuebles.modelo;

import java.util.Date;

/**
 *
 * @author argote
 */
public class Factura {

    int id;
    int id_cliente;
    int id_empleado;
    Date fecha_venta;
    double total_venta;
    
    public Factura(){}
    
    public Factura(int id, int id_cliente, int id_empleado, Date fecha_venta, double total_venta) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

}
