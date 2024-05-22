
package gabi.electromuebles.modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DetallesFacturaDAO extends DAO{
    
    public DetallesFactura obtenerInformacionDetallesFactura(int id, int idFactura, int cantidad, double precioUnitario, int idProducto) {
        
        DetallesFactura df = new DetallesFactura();
        String sql = "SELECT * FROM DetallesFactura WHERE id, idFactura, cantidad, precioUnitario,idProducto) VALUES (?,?,?,?,?,) ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, idFactura);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precioUnitario);
            ps.setInt(5, idProducto);

            
            rs = ps.executeQuery();
            if (rs.next()) {
                df.setId(rs.getInt("id"));
                df.setIdFactura(rs.getInt("idFactura"));
                df.setCantidad(rs.getInt("cantidad"));
                df.setPrecioUnitario(rs.getDouble("precioUnitario"));
                df.setIdProducto(rs.getInt("idProducto"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error obtener informacion de los detalles de la factura");
        }
        return df;
    }
    
    public DetallesFactura crearDetallesFactura(int idFactura, int cantidad, double precioUnitario, int idProducto){
       
        DetallesFactura df = new DetallesFactura();
        String sql = "INSERT INTO DetallesFactura (idFactura, cantidad, precioUnitario, idProducto) VALUES (?,?,?,?) ";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFactura);
            ps.setInt(2, cantidad);
            ps.setDouble(3, precioUnitario);
            ps.setInt(4, idProducto);
            
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Detalles de la factura agregadas con exito");
            }

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al agregar los detalles de la factura");
            System.out.println(e.getMessage());
        }
        return df;
    }

    
}
