
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sara sara
 */
public class conexao {
    public static void teste(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conexão Sucedida");
            
        } catch (Exception ex) {
            System.out.println("Conexão Falhada\n Consulte o Apoio Técnico");
        }
    }
    
}
