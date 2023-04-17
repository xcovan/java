//10º Elabora una actividad de lectura del o los ficheros que hayas creado previamente
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\TextoPrueba.txt"));
            String texto = "";
            if (texto != null) {
                texto = br.readLine();
            }
            System.out.println(texto);
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }

    }
}