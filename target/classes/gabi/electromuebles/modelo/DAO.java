
package gabi.electromuebles.modelo;

import gabi.electromuebles.controlador.MySqlConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {
    
    protected Connection con;
    protected PreparedStatement ps;
    protected ResultSet rs;
    
    public DAO(){
        MySqlConexion cn = new MySqlConexion();
        this.con = cn.getConexion();
    }
    
}
