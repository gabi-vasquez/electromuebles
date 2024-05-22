
package gabi.electromuebles.modelo;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncriptarContraseñaMd5 {
    
     public String getMd5(String contrasena){
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            //Covertir contraseña en una arreglo de bits, el metodo digest aplica el algoritmo
            //md5 al arreglo de bytes y este resultado se almacena en messageDigest
            byte[] messageDigest = md.digest(contrasena.getBytes());
 
            //El biginteger facilita la manipulacion y representacion del valor hash
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Conviertir el mensaje en una representacion hexaecimal para que sea mas legible
            String hashtext = no.toString(16);
            //Se hace este bucle para llenar el hastext creado de ceros porque el hash es de 32
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}