package gabi.electromuebles.modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO extends DAO {

    public Cliente buscarCliente(long cedula) {
        Cliente c = new Cliente();
        String sql = "SELECT * FROM Clientes WHERE cedula = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, cedula);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNombreCompleto(rs.getString("nombreCompleto"));
                c.setCedula(rs.getLong("cedula"));
                c.setTelefono(rs.getLong("telefono"));
                c.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar cliente");
        }
        return c;
    }
    
    public Cliente crearCliente(String nombreCompleto, long cedula, long telefono, String direccion){
        Cliente c = new  Cliente();
        String sql = "INSERT INTO Clientes ( nombreCompleto,cedula,telefono,direccion) VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setLong(2, cedula);
            ps.setLong(3, telefono);
            ps.setString(4, direccion);
            
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente");
        }
        return c;
    }
    
    public Cliente actualizarCliente( String nombreCompleto, long cedula, long telefono, String direccion){
        Cliente c = new  Cliente();
        String sql = "UPDATE Clientes (nombreCompleto,cedula,telefono,direccion) VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setLong(2, cedula);
            ps.setLong(3, telefono);
            ps.setString(4, direccion);
            
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0){
                JOptionPane.showMessageDialog(null, "Cliente actualizado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
        }
        return c;
    }
    
    public Cliente eliminarCliente(long cedula){
        Cliente c = new  Cliente();
        String sql = "DELETE FROM Clientes (cedula = ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setLong(1, cedula);
            
            int rowsDeleted = ps.executeUpdate();
            if(rowsDeleted > 0){
                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
        }
        return c;
    }
}
