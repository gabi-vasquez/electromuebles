
package gabi.electromuebles.modelo;

public class Producto_mueble extends Producto{
    
    private String dimensiones;
    private String material;

    public Producto_mueble(){
    }
    
    public Producto_mueble(int id, String nombre, String descripcion, int cantidad, double precio, String url_imagen, String tipo, String dimensiones, String material) {
        super(id, nombre, descripcion, cantidad, precio, url_imagen, tipo);
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
