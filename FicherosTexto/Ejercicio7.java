/*Crea un programa en Java que reciba tres argumentos desde la línea de 
comandos: los nombres de dos ficheros origen y el nombre de un fichero destino. 
El programa debe leer los dos ficheros origen y mezclar sus contenidos en el 
fichero destino, de tal forma que en el fichero resultante aparezcan las líneas de los 
primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, 
la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, 
etc. Además, el programa debe mostrar por pantalla un mensaje indicando que el 
archivo destino ha sido creado satisfactoriamente o, en caso de producirse algún 
error de lectura/escritura, un mensaje de error con la descripción del problema. 
Recuerda que trabajaremos en la carpeta prueba. El fichero1, debe tener el texto 
“Hola” y el fichero2 el texto “mundo”
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\Fichero1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\Fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\Desktop\\Mezcla.txt"));

            String linea1 = "";
            String linea2 = "";
            while ((linea1 != null) || (linea2 != null)) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();
                if (linea1 != null) {
                    bw.write(linea1 + "\n");
                }
                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
            
            System.out.println("Archivo mezcla.txt creado satisfactoriamente.");
        } catch (IOException ioe) {
                System.out.println("Se ha producido un error de lectura/escritura");
                System.err.println(ioe.getMessage());
        }
    }
}