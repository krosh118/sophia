/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sophia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Anibal
 */
public class Conexion {
    
    public static Connection getConection(){
        
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://" + SOPHIA.servidor + ":" + SOPHIA.puerto +  "/" + SOPHIA.nombreBase;
            conexion = (Connection) DriverManager.getConnection(servidor, SOPHIA.nombreUsuario, SOPHIA.passUsuario);
        }catch(  ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + ex.getMessage());
            conexion = null;
        }finally{
            return conexion;
        }
    }
    
}
