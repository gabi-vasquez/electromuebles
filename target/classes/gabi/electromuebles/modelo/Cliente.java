
package gabi.electromuebles.modelo;

public class Cliente extends Persona {

    private String direccion;
    private String tipoCliente;
    
    
    public Cliente(){
    }

    public Cliente(int id, String nombreCompleto, long cedula, long telefono, String direccion,String tipoCliente) {
        super(id, nombreCompleto,cedula, telefono);
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
