
package gabi.electromuebles.modelo;


public class Producto_electronico extends Producto{
    
    private String marca;
    
    public Producto_electronico(int id, String nombre, String descripcion, int cantidad, double precio, String url_imagen, String tipo, String marca) {
        super(id, nombre, descripcion, cantidad, precio, url_imagen, tipo);
        this.marca = marca;
        
    }
    public Producto_electronico(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void verificar_garantia(){}
}
