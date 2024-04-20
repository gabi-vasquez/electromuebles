/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabi.electromuebles.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author argote
 */
public class ProductoElectronicoDAO extends DAO{
    
     public ArrayList<ProductoElectronico> todosProductosElectronicos() {
        ArrayList<ProductoElectronico> electronicos = new ArrayList<>();
        String sql = "SELECT * FROM ProductosElectronicos";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductoElectronico pe = new ProductoElectronico();
                pe.setId(rs.getInt("id"));
                pe.setNombre(rs.getString("nombre"));
                pe.setDescripcion(rs.getString("descripcion"));
                pe.setCantidad(rs.getInt("cantidad"));
                pe.setPrecio(rs.getDouble("precio"));
                pe.setTipo(rs.getString("tipo"));
                pe.setMarca(rs.getString("marca"));
              
                electronicos.add(pe);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar electronicos");
        }
        return electronicos;
    }
     
    public ArrayList<ProductoElectronico> buscarProductoElectronico(String nombre) {
        ArrayList<ProductoElectronico> electronicos = new ArrayList<>();
        
        String sql = "SELECT * FROM ProductosElectronicos WHERE nombre = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductoElectronico pe = new ProductoElectronico();
                pe.setId(rs.getInt("id"));
                pe.setNombre(rs.getString("nombre"));
                pe.setDescripcion(rs.getString("descripcion"));
                pe.setCantidad(rs.getInt("cantidad"));
                pe.setPrecio(rs.getDouble("precio"));
                pe.setTipo(rs.getString("tipo"));
                pe.setMarca(rs.getString("marca"));
                electronicos.add(pe);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar Producto");
        }
        return electronicos;
    }
    
    public ProductoElectronico crearProductoElectronico(String nombre, String descripcion, int cantidad, double precio, String tipo, String marca){
        
        ProductoElectronico pe = new ProductoElectronico();
        String sql = "INSERT INTO ProductosElectronicos (nombre,descripcion,cantidad, precio,tipo,marca) VALUES (?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precio);
            ps.setString(5, tipo);
            ps.setString(6,marca);
            
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Producto agregado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al agregar el producto a base de datos");
            System.out.println(e.getMessage());
        }
        return pe;
    }
    
    public ProductoElectronico actualizarProductoElectronico(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String marca){
        
        ProductoElectronico pe = new ProductoElectronico();
        String sql = "UPDATE ProductosElectronicos SET id= ?, nombre= ?,descripcion=?, cantidad=?, precio=?,tipo=?, marca=? WHERE id = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            System.out.println(nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setDouble(5, precio);
            ps.setString(6, tipo);
            ps.setString(7,marca);
            ps.setInt(8, id);
            
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0){
                JOptionPane.showMessageDialog(null, "Producto actualizado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
            System.out.println(e);
        }
        return pe;
    }
    
//    public ProductoElectronico eliminarProductoElectronico(int id){
//        
//        ProductoElectronico pe = new ProductoElectronico();
//        String sql = "DELETE FROM ProductosElectronicos (id = ?)";
//        
//        try{
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            
//            int rowsDeleted = ps.executeUpdate();
//            if(rowsDeleted > 0){
//                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
//            }
//
//        } catch(SQLException e){
//            JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
//        }
//        return pe;
//    }
}
