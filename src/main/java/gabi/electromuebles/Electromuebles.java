
package gabi.electromuebles;

import gabi.electromuebles.controlador.MySqlConexion;
import gabi.electromuebles.vista.VistaLogin;

public class Electromuebles {

    public static void main(String args[]) {
        MySqlConexion conexion = new MySqlConexion();
        conexion.getConexion(); 
        
        VistaLogin login = new VistaLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
