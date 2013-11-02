/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sophia;

import sophia.login.inicioSesion;

/**
 *
 * @author Anibal
 */
public class SOPHIA {

    /**
     * @param args the command line arguments
     */
    
    public static String servidor = "localhost", nombreBase = "sophia", puerto = "3306", nombreUsuario = "root", passUsuario = "";
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new inicioSesion();
            }
        }
                );
    }
}
