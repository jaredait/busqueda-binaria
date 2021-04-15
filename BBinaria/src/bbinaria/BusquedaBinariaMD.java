/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;

import java.sql.*;

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
    public BusquedaBinariaMD(BusquedaBinariaDP bbinariaDP) throws SQLException{
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/testdb");
        stmt = con.createStatement();
        System.out.println("conexion establecida");
        
        this.bbinariaDP = bbinariaDP;
    }
    
    // Metodos
    public void insertar(int iteraciones, String resultado){
        cadena = "insert into resultados values('" + iteraciones + "'" + ",'" + resultado + "')";
    }
    
    public String consultar(){
        
        return "";
    }
    
    public void modificar(){
        
    }
    
    public void eliminar(){
        
    }
    
    public boolean verificarMD(){
        
        return false;
    }
}
