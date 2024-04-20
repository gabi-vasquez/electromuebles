package gabi.electromuebles.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO extends DAO {

    public ArrayList<Cliente> todosClientes() {

        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Clientes";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setNombreCompleto(rs.getString("nombreCompleto"));
                cl.setCedula(rs.getLong("cedula"));
                cl.setTelefono(rs.getLong("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setTipoCliente(rs.getString("tipoCliente"));
                clientes.add(cl);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar clientes");
        }
        return clientes;
    }

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
                c.setTipoCliente(rs.getString("tipoCliente"));
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar cliente");
        }
        return c;
    }

    public Cliente crearCliente(String nombreCompleto, long cedula, long telefono, String direccion, String tipoCliente) {
        Cliente c = new Cliente();
        String sql = "INSERT INTO Clientes ( nombreCompleto,cedula,telefono,direccion,tipoCliente) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setLong(2, cedula);
            ps.setLong(3, telefono);
            ps.setString(4, direccion);
            ps.setString(5, tipoCliente);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente");
        }
        return c;
    }

    public Cliente actualizarCliente(int id, String nombreCompleto, long cedula, long telefono, String direccion,String tipoCliente) {
        Cliente c = new Cliente();
        String sql = "UPDATE Clientes SET nombreCompleto = ?, cedula = ?, telefono = ?,direccion = ?, tipoCliente = ? WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setLong(2, cedula);
            ps.setLong(3, telefono);
            ps.setString(4, direccion);
            ps.setString(5, tipoCliente);
            ps.setInt(6, id);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
        }
        return c;
    }

    public Cliente eliminarCliente(long cedula){
        Cliente c = new  Cliente();
        String sql = "DELETE FROM Clientes WHERE cedula = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setLong(1, cedula);
            
            int rowsDeleted = ps.executeUpdate();
            if(rowsDeleted > 0){
                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se puede eliminar el cliente");
        }
        return c;
    }
}
