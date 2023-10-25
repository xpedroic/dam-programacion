/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicialización de coeficientes
        double C1 = 5.0;
        double C2 = 10.0;
        
        // Verificamos si C1 es diferente de 0 para evitar la division
        if (C1 != 0){
            double x = -C2 / C1;
            System.out.printf("El valor de x es: %.4f\n", x);
        } else{
            if (C2 == 0){
                System.out.println("La ecuación es tiene infinitas soluciones");
            } else{
                System.out.println("La ecuación no tiene solución.");
            }
        }
    }
    
}
