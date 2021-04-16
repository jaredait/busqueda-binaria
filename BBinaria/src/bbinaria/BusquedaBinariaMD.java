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
