/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gabi.electromuebles;

import gabi.electromuebles.controlador.MySqlConexion;
import gabi.electromuebles.vista.Vista_login;

/**
 *
 * @author argote
 */
public class Electromuebles {

    public static void main(String args[]) {
        MySqlConexion conexion = new MySqlConexion();
        conexion.getConexion(); 
        
        Vista_login login = new Vista_login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
