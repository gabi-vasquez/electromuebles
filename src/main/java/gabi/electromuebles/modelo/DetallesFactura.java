
package gabi.electromuebles.modelo;

public class DetallesFactura {

    int id;
    int idFactura;
    int cantidad;
    double precioUnitario;
    double subtotal;
    int idProducto;
    
    public DetallesFactura(){      
    }
    
    public DetallesFactura(int id, int idProducto, int cantidad, double precioUnitario, double subtotal) {
        this.id = id;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcularSubtotal(double precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }

}
