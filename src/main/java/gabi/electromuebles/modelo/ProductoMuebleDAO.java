
package gabi.electromuebles.modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductoMuebleDAO extends DAO{
    
     
    public ProductoMueble buscarProductoMueble(String nombre) {
        
        ProductoMueble pm = new ProductoMueble();
        String sql = "SELECT * FROM ProductosMuebles WHERE nombre = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                pm.setId(rs.getInt("id"));
                pm.setNombre(rs.getString("nombre"));
                pm.setDescripcion(rs.getString("descripcion"));
                pm.setCantidad(rs.getInt("cantidad"));
                pm.setPrecio(rs.getDouble("precio"));
                pm.setTipo(rs.getString("tipo"));
                pm.setDimensiones(rs.getString("dimensiones"));
                pm.setMaterial(rs.getString("material"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar Producto");
        }
        return pm;
    }
    
    public ProductoMueble crearProductoMueble(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String dimensiones, String material){
        
        ProductoMueble pm = new ProductoMueble();
        String sql = "INSERT INTO ProductosMuebles (id, nombre,descripcion, cantidad, precio,tipo, dimensiones, material) VALUES (?,?,?,?,?,?,?,?)))";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setDouble(5, precio);
            ps.setString(6, tipo);
            ps.setString(7,dimensiones);
            ps.setString(8, material);
            
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Producto agregado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al agregar el producto");
        }
        return pm;
    }
    
    public ProductoMueble actualizarProductoMueble(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String dimensiones, String material){
        
        ProductoMueble pm = new ProductoMueble();
        String sql = "INSERT INTO ProductosMuebles (id, nombre,descripcion, cantidad, precio,tipo, dimensiones, material) VALUES (?,?,?,?,?,?,?,?)))";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setDouble(5, precio);
            ps.setString(6, tipo);
            ps.setString(7,dimensiones);
            ps.setString(8, material);
            
            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0){
                JOptionPane.showMessageDialog(null, "Producto actualizado con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
        }
        return pm;
    }
    
    public ProductoMueble eliminarProductoMueble(int id){
        
        ProductoMueble pm = new ProductoMueble();
        String sql = "DELETE FROM ProductosMuebles (id = ?)";
        
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
        return pm;
    }
}
