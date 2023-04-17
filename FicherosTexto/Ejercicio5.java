/*Escribe un programa en Java que genere un fichero llamado "pares.txt" y guarde en él los 
números pares del 1 al 100. El programa debe mostrar por pantalla un mensaje indicando 
que se ha creado el fichero y otro mensaje indicando el número total de pares guardados en 
el fichero.
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Ejercicio5 {
    public static void main(String[] args) {
        try {
                BufferedWriter bw = new BufferedWriter ( new FileWriter("C:\\Users\\Usuario\\Desktop\\Pares.txt"));
                int count = 0;
                for (int i = 2; i<100; i+=2) {
                    bw.write(Integer.toString(i) + "\n");
                    count++;
                }
                bw.close();
                System.out.println("Se ha creado el fichero.");
                System.out.println("Se ha guardado " + count + " números pares");                
        }   catch (IOException ioe) {
                System.out.println("No se ha podido escribir en el fichero");
        }
    }
}