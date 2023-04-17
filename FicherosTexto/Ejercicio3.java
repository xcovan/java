package FicherosTexto;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter (new FileWriter("C:\\Users\\Hp EliteDesk\\Desktop\\prueba\\asignatura.txt"));
            bw.write("Programación\n");
            bw.write("Bases de datos\n");
            bw.write("Entornos de desarrollo\n");
            bw.write("Lenguaje de marcas\n");
            bw.write("Sistemas informaticos\n");
            bw.close();
            System.out.println("El archivo ha sido creado correctamente");
        }   catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
