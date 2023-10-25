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
        
        System.out.print("Introduce el número de segundos: ");
        long segundosTotales = scanner.nextLong();
        
        // convertimos segundos a minutos, horas y días
        long minutos = segundosTotales / 60;
        long segundosRestantes = segundosTotales % 60;
        long horas = minutos / 60;
        minutos = minutos % 60;
        long dias = horas / 24;
        horas = horas % 24;
        
        // mostrar resultados
        System.out.println(segundosTotales + " segundos equivale a: " + dias + " Día/s " + horas + " Hora/s " + minutos + " Minuto/s " + segundosRestantes + " Segundo/s ");
        
    }
    
}
