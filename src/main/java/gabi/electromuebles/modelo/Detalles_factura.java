/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabi.electromuebles.modelo;

/**
 *
 * @author argote
 */
public class Detalles_factura {

    int id;
    int id_factura;
    int id_producto;
    int cantidad;
    double precio_unitario;
    double subtotal;
    
    public Detalles_factura(){      
    }
    
    public Detalles_factura(int id, int id_factura, int id_producto, int cantidad, double precio_unitario, double subtotal) {
        this.id = id;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_venta() {
        return id_factura;
    }

    public void setId_venta(int id_venta) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcular_subtotal(double precio_unitario, int cantidad) {
        return precio_unitario * cantidad;
    }

}
