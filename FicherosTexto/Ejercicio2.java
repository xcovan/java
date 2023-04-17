package FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
        BufferedWriter bw = new BufferedWriter(new
        FileWriter("C:\\Users\\Hp EliteDesk\\Desktop\\prueba\\clientes.txt"));
    
        bw.write("Alberto\n");
        bw.write("Eva\n");
        bw.write("Laura\n");
        bw.write("Antonio\n");
        System.out.println("Fichero creado");
        bw.close();
        } catch (IOException ioe) {
        System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
