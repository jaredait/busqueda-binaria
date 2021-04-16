/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;

import com.sun.corba.se.spi.orb.PropertyParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author ASUS
 */
public class BusquedaBinariaMD {
    
    private BusquedaBinariaDP bbinariaDP = new BusquedaBinariaDP();
    
    Connection con;
    Statement stmt;
    ResultSet result;
    String cadena;
    
    // Constructor
    public BusquedaBinariaMD(BusquedaBinariaDP bbinariaDP) throws SQLException, FileNotFoundException, IOException{
        // Leer el arhivo dbderby.properties
        Properties props = new Properties();
        props.load(new FileInputStream("src/sql/dbderby.properties"));
        
        String miDbUrl = props.getProperty("dburl");
        
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        con = DriverManager.getConnection(miDbUrl);
        stmt = con.createStatement();
        
        this.bbinariaDP = bbinariaDP;
    }
    
    // Metodos
    public void insertar(int numero, String resultado) throws SQLException{
        PreparedStatement st = con.prepareStatement("insert into RESULTADO(numero, iteracion)values(?,?)");
        st.setInt(1, numero);
        st.setString(2, resultado);
        int a = st.executeUpdate();
        st.close();
    }
    
    public String[][] consultar() throws SQLException{
        // obtener el numero de filas para dimensionar el arreglo de retorno
        stmt = con.createStatement();
        result = stmt.executeQuery("SELECT COUNT(*) AS rowcount FROM RESULTADO");
        result.next();
        int count = result.getInt("rowcount");
       
        // obtener los datos de la tabla 
        cadena = "select numero, iteracion from RESULTADO";
        result = stmt.executeQuery(cadena);
        String[][] datos = new String[count][2];
        int i = 0;
        while(result.next()){
            String num = String.valueOf(result.getInt("numero"));
            String iter = result.getString("iteracion");
            datos[i][0] = num;
            datos[i][1] = iter;
            i++;
        }

        return datos;
    }
    
    public void modificar(){
        
    }
    
    public void eliminar() throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("delete from RESULTADO");
    }
    
    public boolean verificarMD(){
        
        return false;
    }
}
