
package gabi.electromuebles.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpleadoDAO extends DAO{
    
    public ArrayList<Empleado> todosEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        String sql = "SELECT * FROM Empleados";
        try {
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setId(rs.getInt("id"));
                em.setNombreCompleto(rs.getString("nombreCompleto"));
                em.setCedula(rs.getLong("cedula"));
                em.setTelefono(rs.getLong("telefono"));
                em.setActivo(rs.getBoolean("activo"));
                empleados.add(em);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  cargar empleados");
        }
        return empleados;
    }
    
    public Empleado buscarEmpleadoPorNombre(String nombre) {
        Empleado em = new Empleado();
        String sql = "SELECT * FROM Empleados WHERE nombreCompleto = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                em.setId(rs.getInt("id"));
                em.setNombreCompleto(rs.getString("nombreCompleto"));
                em.setCedula(rs.getLong("cedula"));
                em.setTelefono(rs.getLong("telefono"));
                em.setActivo(rs.getBoolean("activo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar empleado");
        }
        return em;
    }
    
    public Empleado buscarEmpleado(long cedula) {
        Empleado em = new Empleado();
        String sql = "SELECT * FROM Empleados WHERE cedula = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, cedula);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                em.setId(rs.getInt("id"));
                em.setNombreCompleto(rs.getString("nombreCompleto"));
                em.setCedula(rs.getLong("cedula"));
                em.setTelefono(rs.getLong("telefono"));
                em.setActivo(rs.getBoolean("activo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar empleado");
        }
        return em;
    }
    
    public Empleado crearEmpleado( String nombreCompleto, long cedula, long telefono){
        Empleado em = new  Empleado();
        String sql = "INSERT INTO Empleados ( nombreCompleto,cedula,telefono,activo) VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setLong(2, cedula);
            ps.setLong(3, telefono);
            ps.setBoolean(4, true);
            
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Empledo agregado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al agregar el empleado");
            System.out.println(e.getMessage());
        }
        return em;
    }
    
    public Empleado actualizarEmpleado(int id, String nombreCompleto, long cedula, long telefono, boolean activo){
        
        Empleado em = new  Empleado();
        String sql = "UPDATE Empleados SET nombreCompleto = ?, cedula = ?, telefono = ?, activo = ? where id = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setLong(2, cedula);
            ps.setLong(3, telefono);
            ps.setBoolean(4, activo);
            ps.setInt(5, id);
            
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0){
                ResultSet keyset = ps.getGeneratedKeys();
            if (keyset.next()) {
                int idGenerado = keyset.getInt(1);
                em.setId(idGenerado);
            }
                JOptionPane.showMessageDialog(null, "Empleado actualizado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar el empleado");
        }
        return em;
    }
    
    public Empleado eliminarEmpleado(long cedula){
        Empleado em = new Empleado();
        String sql = "DELETE FROM Empleados where cedula = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setLong(1, cedula);
            
            int rowsDeleted = ps.executeUpdate();
            if(rowsDeleted > 0){
                JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el empleado");
            System.out.println(e.getMessage());
        }
        return em;
    }
}
