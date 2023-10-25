/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROG02_Ejerc1;

/**
 *
 * @author Laboratorio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // valor máximo no modificable: 5000
        final int VALOR_MAX = 5000; // Usamos final para valores constantes y int porque el numero introducido es un entero
        
        // tiene carnet de conducir true o false
        boolean tieneCarnetConducir = true; //para condiciones con valor verdadero o falso se utiliza boolean
        
        // mes del año formato númerico (int) y como cadena (string)
        int mesNumero = 9; // int es utilizado para representrar enteros
        String mesNombre = "Septiembre";// String es usado en cadenas de texto
        
        // nombre y apellidos alumno
        String nombreCompleto = "Pedro Izquierdo"; // String es usado en cadenas de texto
        
        // sexo con dos valores posibles V o M
        char sexo= 'V'; // como los valores posibles solo son dos carácteres utilizo char
        
        // milisegundos desde el 01/01/1970 hasta hoy
        long milisegundosHastaHoy = System.currentTimeMillis(); // al ser un numero muy largo utilizo long
        
        // saldo cuenta bancaria
        double totalCuenta = 45675.67; //utilizamos double para poder introducir decimales
        
        // distancia tierra - jupiter en km
        double distanciaTierraJupiter = 597000000; // utilizo dobule por que podria contener decimales al ser una distacia
        
        System.out.print(VALOR_MAX + "\n" +
                tieneCarnetConducir + "\n" +
                mesNumero + "\n" +
                mesNombre + "\n" +
                nombreCompleto + "\n" +
                sexo + "\n" +
                milisegundosHastaHoy + "\n" +
                totalCuenta + "\n" +
                distanciaTierraJupiter + "\n");
        
    }
    
}
