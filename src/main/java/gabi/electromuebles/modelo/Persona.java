/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabi.electromuebles.modelo;

/**
 *
 * @author argote
 */
public class Persona {

    private int id;
    private int cedula;
    private String nombre_completo;
    private int numero_telefono;
    
    public Persona(){
    }
    
    public Persona(int id, int cedula, String nombre_completo, int numero_telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        this.numero_telefono = numero_telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

}
