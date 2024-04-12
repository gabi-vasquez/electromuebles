
package gabi.electromuebles.modelo;

import gabi.electromuebles.controlador.MySqlConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    MySqlConexion cn = new MySqlConexion();
    
    public Login log(String usuario, String contrasena){
        Login l = new Login();
        //consulta
        String sql = "SELECT * FROM Usuarios WHERE usuario = ? AND contrasena = ?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            if(rs.next()){
                l.setId(rs.getInt("id"));
                l.setUsuario(rs.getString("usuario"));
                l.setContrasena(rs.getString("contrasena"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        return l;
    }
}
