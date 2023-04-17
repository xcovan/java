/*Escribe un programa que lea el contenido de los tres ficheros creados en la actividad 
anterior y los muestre por pantalla.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\Fichero1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\Fichero2.txt"));
            BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\Mezcla.txt"));
            String linea = "";
            System.out.println("Contenido del fichero fichero1.txt");
                while ((linea = br1.readLine()) != null) {
                    System.out.println(linea);
                }
                System.out.println("Contenido del fichero fichero2.txt");
                while ((linea = br2.readLine()) != null) {
                    System.out.println(linea);
                }
                System.out.println("Contenido del fichero mezcla.txt");
                while ((linea = br3.readLine()) != null) {
                    System.out.println(linea);
                }
                br1.close();
                br2.close();
                br3.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido ejecutar.");
        }
    }
}