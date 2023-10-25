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
        // definicion de variables
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j = (int) (i * x); // conversion explicita porque multiplicamos un int y un float
        System.out.println("Producto de int por float: j= i*x = "+ j);
        
        double dx = 2.0d;
        double dz = dx * y; //multiplicamos float por double
        System.out.println("Producto de float por double: dz=dx * y = " + dz);     
        
        System.out.println("\n------- Operaciones con byte -------");
        
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by); // conversion explicita, resta de dos variables tipo byte
        System.out.println("byte: " + bx +" - " + by + " = " + bz);
        
        bx = -128;
        by = 1;
        bz = (byte) (bx - by); // resultado tipo byte
        System.out.println("byte: " + bx +" - " + by + " = " + bz);
        
        int resultadoInt = (bx - by); // resta de dos bytes almacenado en variable int
        System.out.println("(int)(" + bx + " - " + by +") = " + resultadoInt);
        
        System.out.println("\n------- Operaciones con short -------");
        
        short sx = 5;
        short sy = 2;
        short sz = (short) (sx - sy);
        System.out.println("short: " + sx + " - " + sy + " = " + sz);
        
        sx = 32767; //cambio de valor de variables short
        sy = 1;
        sz = (short) (sx + sy);
        System.out.println("short: " + sx + " + " + sy + " = " + sz);
        
        System.out.println("\n------- Operaciones con char -------");
        
        char cx = '\u000F';
        char cy = '\u0001';
        int z = cx - cy; // resta de dos chars almacenada en una variable int
        System.out.println("char: " + cx + " - " + cy + " = " + z);
        
        z = cx - 1; //resta dde un char y un int
        System.out.println("char: " + cx + " - 1 = " + z);
        
        cx = '\uFFFF'; // cambio de valor de cx
        z = cx; //conversion de char a int
        System.out.println("(int)("+ cx + ") = " + z);
        
        sx = (short) cx; // conversion de char a short
        System.out.println("(short)("+ cx + ") = " + sx );
        
        sx = -32768;// cambio de valor de la variable short y conversión a char y luego a int
        cx = (char) sx;
        z = cx;
        System.out.println(sx + " short-char-int = " + z);
        
        sx = -1;// cambio de valor de la variable short y conversión a char y luego a int
        cx = (char) sx;
        z = cx;
        System.out.println(sx + " short-char-int = " + z); 
 
    }
    
}
