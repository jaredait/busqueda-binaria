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

/**
 *
 * @author ASUS
 */
public class BusquedaBinariaDP {
    // Atributos
    //Private Ordenamiento ordenamiento = new Ordenamiento();
    private File archivo;
    public int[] numerosArchivo;
    private int numeroBuscar;
    private int iteraciones;
    
    // Constructor
    public BusquedaBinariaDP(){
        numerosArchivo = new int[1000];
        numeroBuscar = -1;
        iteraciones = 0;
    }
    
    // Metodos
    public void guardarDP(){
        
    }
    
    public void guardarEnArray(String contenido){
        String[] temp = contenido.split(",", -1);
        for(int i = 0; i < temp.length; i++)
            numerosArchivo[i] = Integer.parseInt(temp[i]);
    }
    
    public boolean verificarNumero(String numero){
        try{
            numeroBuscar = Integer.parseInt(numero);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    
    
    // Si no lanza alguna de las excepciones significa que el archivo es correcto
    // pero no necesariamente contiene numeros validos. Cargar archivo se 
    // encarga de validar el contenido
    public void verificarArchivo(String direccion) throws FileNotFoundException, IOException, Exception{
        archivo = new File(direccion);
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        String st = br.readLine();
        
        guardarEnArray(st.trim());
    }
    
    // El primer número indica si se encontró el número. Si es mayor o igual que
    // 0 significa que lo encontró. El segundo número indica el número de 
    // iteraciones que se completaron para encontrar el número.
    public int[] buscarNumero(){
        iteraciones = 0;
        int numEncontrado = busquedaBinaria(numerosArchivo, 0, numerosArchivo.length - 1, numeroBuscar, iteraciones);
        return new int[]{numEncontrado, iteraciones};
    }
    
    public int busquedaBinaria(int numerosArchivo[], int izq, int der, int numero, int iter){
        if (der >= izq) {
            int medio = izq + (der - izq) / 2;
  
            // Si el numero se encuentra en la mitad
            if (numerosArchivo[medio] == numero)
                return medio;
  
            // Si el elemento es menor que medio, entonces solo puede estar presente en el arreglo de la izquierda
            if (numerosArchivo[medio] > numero)
                return busquedaBinaria(numerosArchivo, izq, medio - 1, numero, iter++);
  
            // De lo contrario solo puede estar en el arreglo de la derecha
            return busquedaBinaria(numerosArchivo, medio + 1, der, numero, iter++);
        }
  
        // Si el numero no esta presente en el arreglo (paso base)
        return -1;
    }
    
    public void eliminarArchivo(){
        archivo = null;
    }
    
    public int[] getArregloNums(){
        return numerosArchivo;
    }
    
    public int getNumero(){
        return numeroBuscar;
    }
}
