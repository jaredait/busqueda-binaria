/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class BBinaria {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws SQLException, IOException {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        miVentanaPrincipal.setVisible(true);
    }
    
}
