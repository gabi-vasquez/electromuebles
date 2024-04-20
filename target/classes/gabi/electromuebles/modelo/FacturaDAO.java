package gabi.electromuebles.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

public class FacturaDAO extends DAO {

    public Factura crearFactura(int idCliente, int idEmpleado, Date fecha, double total) {
        Factura fac = new Factura();
        String sql = "INSERT INTO Facturas (idCliente, idEmpleado, fecha, total) VALUES (?,?,?,?)";
        try {
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCliente);
            ps.setInt(2, idEmpleado);
            ps.setDate(3, sqlDate);
            ps.setDouble(4, total);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet keyset = ps.getGeneratedKeys();
                if (keyset.next()) {
                    int idGenerado = keyset.getInt(1);
                    fac.setId(idGenerado);
                }
                JOptionPane.showMessageDialog(null, "Factura agregada con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la factura -> Base datos");
            System.out.println(e.getMessage());
        }
        return fac;
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
                c.setCedula(rs.getLong("cedula"));
                c.setNombreCompleto(rs.getString("nombreCompleto"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getLong("telefono"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
        }
        return c;
    }

//    public Pr
}
