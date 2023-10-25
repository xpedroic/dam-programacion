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
        // declaramos las variables de los alumnos matriculados
        
        int alumnosProgramacion = 30;
        int alumnosEntornos = 50;
        int alumnosBasesDatos = 20;
        
        // calculamos los alumnos totales
        int totalAlumnos = alumnosProgramacion + alumnosEntornos + alumnosBasesDatos;
        
        // calculamos el porcentaje de cada modulo
        double porcentajeProgramacion = (double) alumnosProgramacion / totalAlumnos * 100;
        double porcentajeEntornos = (double) alumnosEntornos / totalAlumnos * 100;
        double porcentajeBasesDatos = (double) alumnosBasesDatos / totalAlumnos * 100;
        
        //mostramos los porcentajes con 1 decimal
        
        System.out.printf("Porcentaje de alumnos de Programación: %.1f%%\n", porcentajeProgramacion);
        System.out.printf("Porcentaje de alumnos de Entornos: %.1f%%\n", porcentajeEntornos);
        System.out.printf("Porcentaje de alumnos de Bases de Datos: %.1f%%\n", porcentajeBasesDatos);
    }
    
}
