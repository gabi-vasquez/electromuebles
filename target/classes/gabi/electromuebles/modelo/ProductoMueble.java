
package gabi.electromuebles.modelo;

public class ProductoMueble extends Producto {
    
    private String dimensiones;
    private String material;
    private double manoObra;
    private double ganancia;

    public ProductoMueble(){
    }
    
    public ProductoMueble(double manoObra, double ganancia, double precioMateriales){
        this.manoObra = manoObra;
        this.ganancia = ganancia;
        this.precio = precioMateriales;
    }
    public ProductoMueble(int id, String nombre, String descripcion, int cantidad, double precio, double manoObra, double ganancia, String tipo, String dimensiones, String material) {
        super(id, nombre, descripcion, cantidad, tipo , precio);
        this.dimensiones = dimensiones;
        this.material = material;
        this.manoObra = manoObra;
        this.ganancia = ganancia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
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

    @Override
    public double calcularPrecio() {
        return precio+manoObra+ganancia;
    }
    
}
