
package gabi.electromuebles.modelo;

public class Empleado extends Persona {

    
    public Empleado(){}
    
    public Empleado(int id, String nombreCompleto,long cedula, long telefono) {
        super(id, nombreCompleto, cedula, telefono);
    }

    @Override
    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
