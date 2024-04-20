
package gabi.electromuebles.modelo;


public class ProductoElectronico extends Producto {
    
    private final double iva = 0.14;
    private String marca;
    
    public ProductoElectronico(){
    }
    
    public ProductoElectronico(int id, String nombre, String descripcion,double precio, int cantidad, String tipo, String marca) {
        super(id, nombre, descripcion, cantidad, tipo, precio);
        this.marca = marca;
    }
    
    public ProductoElectronico(double precio) {
        super.precio = precio;
    }
 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void verificarGarantia(){}

    @Override
    public double calcularPrecio() {
        return (precio * iva)+ precio;
    }
    
}
