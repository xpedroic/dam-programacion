/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Laboratorio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un año: ");
        int year = scanner.nextInt();
        
        // verificar si el año es bisiesto
        boolean esBisiesto = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        
        if (esBisiesto){
            System.out.println("El año " + year + " es bisiesto");
        } else{
            System.out.println("El año " + year + " NO es bisiesto");
        }
    }
    
}
