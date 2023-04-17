//9º Elabora una actividad de escritura de uno o más ficheros que tu elijas.

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\Desktop\\TextoPrueba.txt"));
                bw.write("Hola, esto es una prueba de escritura en archivos de texto.");
                bw.close();
        } catch (IOException ioe) {
            System.out.println("Error.");
        }
            System.out.println("Archivo creado.");
    }
}
