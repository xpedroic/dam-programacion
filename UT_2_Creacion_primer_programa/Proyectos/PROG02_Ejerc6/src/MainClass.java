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
    // definicion del tipo enumerado RazasPerro
    public enum RazasPerro{
            MASTIN, TERRIER, BULLDOG, PEKINES, CANICHE, GALGO
        }
    
    public static void main(String[] args) {
        //  creación de las variables var1 y var2, y asignamos un valor
        RazasPerro var1 = RazasPerro.BULLDOG;
        RazasPerro var2 = RazasPerro.GALGO;
        
        // comparamos variables
        if (var1 == var2){
            System.out.println("Las dos razas son iguales");
           }
        else{
            System.out.println("Las dos razas son distintas");
        }
        
        // mostrar por pantalla la el resultado de la comparación y con el metodo ordinal() devolver la posición
        System.out.println("La posicion de " + var1 + " en tipo numerado es " + var1.ordinal() + " y la de " + var2 + " es " + var2.ordinal());
        //// values() devuelve un array con yodos los valores y con la propiedad length averiguamos la cantidad de valores
        System.out.println("La cantidad total de valores es: " + RazasPerro.values().length);
        
        
    }
    
}
