package FicherosTexto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;   
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Hp EliteDesk\\Desktop\\prueba\\fruta.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        }   catch (FileNotFoundException fnfe) {
            System.out.println("No se encuentra el fichero fruta.txt");
        }   catch (IOException ioe) {
            System.out.println("No se puede leer el fichero fruta.txt");
        }
    }
}
