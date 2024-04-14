
package gabi.electromuebles.modelo;

public class DetallesFactura {

    int id;
    int idFactura;
    int idProductoElectronico;
    int idProductoMueble;
    int cantidad;
    double precioUnitario;
    double subtotal;
    
    public DetallesFactura(){      
    }
    
    public DetallesFactura(int id, int idFactura, int idProductoElectronico,int idProductoMueble, int cantidad, double precioUnitario, double subtotal) {
        this.id = id;
        this.idFactura = idFactura;
        this.idProductoElectronico = idProductoElectronico;
        this.idProductoMueble = idProductoMueble;
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

    public int getIdProductoElectronico() {
        return idProductoElectronico;
    }

    public void setIdProductoElectronico(int idProductoElectronico) {
        this.idProductoElectronico = idProductoElectronico;
    }

    public int getIdProductoMueble() {
        return idProductoMueble;
    }

    public void setIdProductoMueble(int idProductoMueble) {
        this.idProductoMueble = idProductoMueble;
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
