/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabi.electromuebles.modelo;

/**
 *
 * @author argote
 */
public class Cliente extends Persona {

    private String direccion;
    
    public Cliente(){
    }

    public Cliente(int id, int cedula, String nombre_completo, int numero_telefono, String direccion) {
        super(id, cedula, nombre_completo, numero_telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
