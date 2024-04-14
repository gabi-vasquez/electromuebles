
package gabi.electromuebles.modelo;

public class ProductoMueble extends Producto{
    
    private String dimensiones;
    private String material;

    public ProductoMueble(){
    }
    
    public ProductoMueble(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String dimensiones, String material) {
        super(id, nombre, descripcion, cantidad, precio, tipo);
        this.dimensiones = dimensiones;
        this.material = material;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
