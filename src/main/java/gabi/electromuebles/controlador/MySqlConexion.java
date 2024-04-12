package gabi.electromuebles.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConexion {

    String url = "jdbc:mysql://localhost:3306/Electro";
    String user = "root";
    String password = "";
    Connection conn = null;
    Statement st;
    ResultSet rs;

    public Connection getConexion() {

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conn != null) {
            System.out.println("Connected to the database");
        }
        return conn;

    }

    public void peticionIngreso() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO Empleado VALUES(2,'Gabriela','prueba','3128064541','1061709097')");
            rs = st.executeQuery("SELECT * FROM Empleado");
            rs.next();
            do {
                System.out.println(rs.getString("cedula"));
            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
