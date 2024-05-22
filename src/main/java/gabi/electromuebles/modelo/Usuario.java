
package gabi.electromuebles.modelo;

public class Usuario {
    
    private int id;
    private String usuario;
    private String contrasena;
    private String rol;
    private String palabraClave;

    public Usuario(int id,String usuario, String contrasena, String rol,String palabraClave) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.palabraClave = palabraClave;
    }
    
    public Usuario(){  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public String getPalabraClave(){
        return palabraClave;
    }
    
    public void setPalabraClave(String palabraClave){
        this.palabraClave = palabraClave;
    }
    
    
}
