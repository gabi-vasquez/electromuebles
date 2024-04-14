/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabi.electromuebles.modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author argote
 */
public class ProductoElectronicoDAO extends DAO{
    
    public ProductoElectronico buscarProductoElectronico(String nombre) {
        
        ProductoElectronico pe = new ProductoElectronico();
        String sql = "SELECT * FROM ProductosElectronicos WHERE nombre = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                pe.setId(rs.getInt("id"));
                pe.setNombre(rs.getString("nombre"));
                pe.setDescripcion(rs.getString("descripcion"));
                pe.setCantidad(rs.getInt("cantidad"));
                pe.setPrecio(rs.getDouble("precio"));
                pe.setTipo(rs.getString("tipo"));
                pe.setMarca(rs.getString("marca"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar Producto");
        }
        return pe;
    }
    
    public ProductoElectronico crearProductoElectronico(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String marca){
        
        ProductoElectronico pe = new ProductoElectronico();
        String sql = "INSERT INTO ProductosElectronicos (id, nombre,descripcion, cantidad, precio,tipo, marca) VALUES (?,?,?,?,?,?,?)))";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setDouble(5, precio);
            ps.setString(6, tipo);
            ps.setString(7,marca);
            
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Producto agregado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al agregar el producto");
        }
        return pe;
    }
    
    public ProductoElectronico actualizarProductoElectronico(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String marca){
        
        ProductoElectronico pe = new ProductoElectronico();
        String sql = "INSERT INTO ProductosElectronicos (id, nombre,descripcion, cantidad, precio,tipo, marca) VALUES (?,?,?,?,?,?,?)))";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setDouble(5, precio);
            ps.setString(6, tipo);
            ps.setString(7,marca);
            
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0){
                JOptionPane.showMessageDialog(null, "Producto actualizado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
        }
        return pe;
    }
    
    public ProductoElectronico eliminarProductoElectronico(int id){
        
        ProductoElectronico pe = new ProductoElectronico();
        String sql = "DELETE FROM ProductosElectronicos (id = ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int rowsDeleted = ps.executeUpdate();
            if(rowsDeleted > 0){
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
        }
        return pe;
    }
}
