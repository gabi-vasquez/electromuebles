
package gabi.electromuebles.modelo;


public class ProductoElectronico extends Producto{
    
    private String marca;
    
    public ProductoElectronico(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String marca) {
        super(id, nombre, descripcion, cantidad, precio, tipo);
        this.marca = marca;
        
    }
    public ProductoElectronico(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void verificarGarantia(){}
}
