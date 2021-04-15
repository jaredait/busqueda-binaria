/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;

import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class BBinaria {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        miVentanaPrincipal.setVisible(true);
    }
    
}
