/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class BusquedaBinariaDP {

    // Atributos
    private Ordenamiento ordenamiento = new Ordenamiento();
    private File archivo;
    public int[] numerosArchivo;
    private int numeroBuscar;
    private int iteraciones;
    private boolean encontrado;
    private BusquedaBinariaMD bbinariaMD;
    private String resultado;

    // Constructor
    public BusquedaBinariaDP() throws SQLException, IOException {
        archivo = null;;
        numeroBuscar = -1;
        iteraciones = 0;
        encontrado = false;
        bbinariaMD = new BusquedaBinariaMD(this);
        resultado = "";
    }

    // Metodos
    public void guardarDP() {
        try {
            bbinariaMD.insertar();
        } catch (SQLException e) {

        }
    }

    public void guardarEnArray(String contenido) {
        String[] temp = contenido.split(",", -1);
        numerosArchivo = new int[1000];
        for (int i = 0; i < temp.length; i++) {
            numerosArchivo[i] = Integer.parseInt(temp[i]);
        }

        numerosArchivo = ordenamiento.odenarInsercion(numerosArchivo);
    }

    // Si no lanza alguna de las excepciones significa que el archivo es correcto
    // pero no necesariamente contiene numeros validos. Cargar archivo se 
    // encarga de validar el contenido
    public void verificarArchivo(String direccion) throws FileNotFoundException, IOException, Exception {
        System.out.println("setResultado check");

        archivo = new File(direccion);
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        String st = br.readLine();

        guardarEnArray(st.trim());
    }

    // El primer número indica si se encontró el número. Si es mayor o igual que
    // 0 significa que lo encontró. El segundo número indica el número de 
    // iteraciones que se completaron para encontrar el número.
    public void buscarNumero() throws NullPointerException {
        iteraciones = 0;

        encontrado = busquedaBinaria(numerosArchivo, 0, numerosArchivo.length - 1, numeroBuscar);
        setResultado();
        guardarDP();

    }

    public boolean busquedaBinaria(int numerosArchivo[], int izq, int der, int numero) {
        if (der >= izq) {
            this.iteraciones++;
            int mitad = izq + (der - izq) / 2;

            // Si el numero se encuentra en la mitad retorna el indice en el que se encuentra
            if (numerosArchivo[mitad] == numero) {
                return true;
            }

            // Si el elemento es menor que mitad, entonces solo puede estar presente en el arreglo de la izquierda
            if (numerosArchivo[mitad] > numero) {
                return busquedaBinaria(numerosArchivo, izq, mitad - 1, numero);
            }

            // De lo contrario solo puede estar en el arreglo de la derecha
            return busquedaBinaria(numerosArchivo, mitad + 1, der, numero);
        }

        // Si el numero no esta presente en el arreglo (paso base)
        return false;
    }

    public void setResultado() {
        resultado = encontrado
                ? "Se encontró el número. Iteraciones: " + iteraciones
                : "No se encontró el número. Iteraciones: " + iteraciones;
    }

    public String getResultado() {
        return resultado;
    }

    public void eliminarArchivo() {
        archivo = null;
        numerosArchivo = null;
    }

    public int[] getArregloNums() {
        return numerosArchivo;
    }

    public int getNumero() {
        return numeroBuscar;
    }

    public void setNumeroBuscar(int numero) {
        numeroBuscar = numero;
    }
}
