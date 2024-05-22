package gabi.electromuebles.modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO extends DAO {

    public Usuario buscarUsuario(String usuario, String contrasena) {
        Usuario u = new Usuario();
        //consulta
        String sql = "SELECT * FROM Usuarios WHERE usuario = ? AND contrasena = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setUsuario(rs.getString("usuario"));
                u.setContrasena(rs.getString("contrasena"));
                u.setRol(rs.getString("rol"));
                u.setPalabraClave("palabraClave");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        return u;
    }

    public Usuario crearUsuario(String usuario, String contrasena, String rol, String palabraClave) {
        Usuario usu = new Usuario();
        String sql = "INSERT INTO Usuarios (usuario, contrasena,rol,palabraClave) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            ps.setString(3, rol);
            ps.setString(4, palabraClave);

            int rowInserted = ps.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(null, "Usuario agregado en bd");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al agregar el usuario en bd");
        }
        return null;
    }

    public Usuario actualizarUsuario(int id, String usuario, String contrasena, String rol, String palabraClave) {
        Usuario usu = new Usuario();
        String sql = "UPDATE usuarios SET id=?, usuario=?,contrasena=?,rol=?,palabraClave=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, usuario);
            ps.setString(3, contrasena);
            ps.setString(4, rol);
            ps.setString(5, palabraClave);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado en bd");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar en bd");
        }
        return usu;

    }

    public int obtenerId(String usuario) {
        String sql = "SELECT id FROM Usuarios WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);

            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return -1;
    }

    public boolean verificarUsuarioPalabra(String usuario, String palabraClave) {
        String sql = "SELECT id FROM Usuarios WHERE usuario = ? AND palabraClave =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, palabraClave);
            
            rs = ps.executeQuery();
            return rs.next();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean actualizarContrasena(String usuario, String nuevaContrasena) {
        try {
            int idUsuario = obtenerId(usuario);
            if (idUsuario != -1) {
                String sql = "UPDATE Usuarios SET contrasena = ? WHERE id = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, nuevaContrasena);
                ps.setInt(2, idUsuario);

                int rowsUpdated = ps.executeUpdate();
                if (rowsUpdated > 0) {
                    return true;
                }
            }
        }catch(SQLException e){
            System.out.println("ActualizarContrasena-> "+ e.getMessage());
        }
        return false;
    }

}
