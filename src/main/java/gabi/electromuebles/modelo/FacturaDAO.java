 package gabi.electromuebles.modelo;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class FacturaDAO extends DAO {

    public Factura crearFactura(int id, int idCliente, int idEmpleado, Date fecha, double total) {
        Factura fac = new Factura();
        String sql = "INSERT INTO Facturas (id, idCliente, idEmpleado, fecha, total) VALUES (?,?,?,?,?)";
        try {
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, idCliente);
            ps.setInt(3, idEmpleado);
            ps.setDate(4, sqlDate);
            ps.setDouble(5, total);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Factura agregada con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la factura");
        }
        return fac;

    }
}
