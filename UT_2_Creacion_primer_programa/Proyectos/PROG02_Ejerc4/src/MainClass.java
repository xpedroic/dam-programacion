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
        
        // introducir datos
        System.out.print("Introduce la edad de la persona: ");
        int edad = scanner.nextInt();
        
        // como no podemos utilizar if usamos el operador condicional ?
        String mensaje = (edad >= 18) ? "La persona es MAYOR de edad.":"La persona es MENOR de edad.";
        System.out.println(mensaje);
    }
    
}
