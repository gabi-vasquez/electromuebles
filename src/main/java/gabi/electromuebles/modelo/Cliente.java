
package gabi.electromuebles.modelo;

public class Cliente extends Persona {

    private String direccion;
    
    public Cliente(){
    }

    public Cliente(int id, String nombreCompleto, long cedula, long telefono, String direccion) {
        super(id, nombreCompleto,cedula, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
