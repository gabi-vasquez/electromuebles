
package gabi.electromuebles.modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DetallesFacturaDAO extends DAO{
    
    public DetallesFactura obtenerInformacionDetallesFactura(int id, int idFactura, int idProductoElectronico,int idProductoMueble, int cantidad, double precioUnitario,double subtotal) {
        
        DetallesFactura df = new DetallesFactura();
        String sql = "SELECT * FROM DetallesFactura WHERE id, idFactura, idProductoElectronico,idProductoMueble, cantidad, precioUnitario, subtotal) VALUES (?,?,?,?,?,?,?) ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, idFactura);
            ps.setInt(3, idProductoElectronico);
            ps.setInt(4, idProductoMueble);
            ps.setInt(5, cantidad);
            ps.setDouble(6, precioUnitario);
            ps.setDouble(7, subtotal);

            
            rs = ps.executeQuery();
            if (rs.next()) {
                df.setId(rs.getInt("id"));
                df.setIdFactura(rs.getInt("idFactura"));
                df.setIdProductoElectronico(rs.getInt("idProductoElectronico"));
                df.setIdProductoMueble(rs.getInt("idProductoMueble"));
                df.setCantidad(rs.getInt("cantidad"));
                df.setPrecioUnitario(rs.getDouble("precioUnitario"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error obtener informacion de los detalles de la factura");
        }
        return df;
    }
    
    public DetallesFactura crearDetallesFactura(int idFactura, int idProductoElectronico,int idProductoMueble,int cantidad, double precioUnitario, double subtotal){
       
        DetallesFactura df = new DetallesFactura();
        String sql = "INSERT INTO DetallesFactura (idFactura, idProductoElectronico, idProductoMueble, cantidad, precioUnitario, subtotal) VALUES (?,?,?,?,?,?) ";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFactura);
            if(idProductoElectronico == 0) {
                ps.setString(2, null);
            } else {
                ps.setInt(2, idProductoElectronico);
            }
            if(idProductoMueble == 0) {
                ps.setString(3, null);

            } else {
                ps.setInt(3, idProductoMueble);

            }
            ps.setInt(4, cantidad);
            ps.setDouble(5, precioUnitario);
            ps.setDouble(6, subtotal);
            
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
