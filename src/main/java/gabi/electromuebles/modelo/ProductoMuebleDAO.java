package gabi.electromuebles.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoMuebleDAO extends DAO {

    public ArrayList<ProductoMueble> todosProductosMuebles() {
        ArrayList<ProductoMueble> muebles = new ArrayList<>();
        String sql = "SELECT * FROM ProductosMuebles";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductoMueble pm = new ProductoMueble();
                pm.setId(rs.getInt("id"));
                pm.setNombre(rs.getString("nombre"));
                pm.setDescripcion(rs.getString("descripcion"));
                pm.setCantidad(rs.getInt("cantidad"));
                pm.setPrecio(rs.getDouble("precio"));
                pm.setTipo(rs.getString("tipo"));
                pm.setDimensiones(rs.getString("dimensiones"));
                pm.setMaterial(rs.getString("material"));
                muebles.add(pm);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar muebles");
        }
        return muebles;
    }

    public ArrayList<ProductoMueble> buscarProductoMueble(String nombre) {
        ArrayList<ProductoMueble> muebles = new ArrayList<>();

        
        String sql = "SELECT * FROM ProductosMuebles WHERE nombre = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            rs = ps.executeQuery();
            if (rs.next()) {
                ProductoMueble pm = new ProductoMueble();
                pm.setId(rs.getInt("id"));
                pm.setNombre(rs.getString("nombre"));
                pm.setDescripcion(rs.getString("descripcion"));
                pm.setCantidad(rs.getInt("cantidad"));
                pm.setPrecio(rs.getDouble("precio"));
                pm.setTipo(rs.getString("tipo"));
                pm.setDimensiones(rs.getString("dimensiones"));
                pm.setMaterial(rs.getString("material"));
                muebles.add(pm);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al  buscar Producto");
        }
        return muebles;
    }

    public ProductoMueble crearProductoMueble(String nombre, String descripcion, int cantidad, double precio, String tipo, String dimensiones, String material) {

        ProductoMueble pm = new ProductoMueble();
        String sql = "INSERT INTO ProductosMuebles (nombre,descripcion, cantidad, precio,tipo, dimensiones, material) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precio);
            ps.setString(5, tipo);
            ps.setString(6, dimensiones);
            ps.setString(7, material);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Producto agregado con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el producto mueble en base");
            System.out.println(e.getMessage());
        }
        return pm;
    }

    public ProductoMueble actualizarProductoMueble(int id, String nombre, String descripcion, int cantidad, double precio, String tipo, String dimensiones, String material) {

        ProductoMueble pm = new ProductoMueble();
        String sql = "UPDATE ProductosMuebles SET id=?, nombre=?,descripcion=?, cantidad=?, precio=?,tipo=?, dimensiones=?, material=? WHERE id= ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, cantidad);
            ps.setDouble(5, precio);
            ps.setString(6, tipo);
            ps.setString(7, dimensiones);
            ps.setString(8, material);
            ps.setInt(9,id);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Producto actualizado con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
            System.out.println(e);
        }
        return pm;
    }

    public ProductoMueble eliminarProductoMueble(int id) {

        ProductoMueble pm = new ProductoMueble();
        String sql = "DELETE FROM ProductosMuebles WHERE (id = ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
        }
        return pm;
    }
}
