public class Bucles07 {

    public static void main (String[] args) {
        int intentos =4;
        int combinacion;
        boolean acertado = false;

        do 
        {System.out.print("Introducir clave: ");
        combinacion = Integer.parseInt(System.console().readLine());
    
        if (combinacion == 6666)
        {acertado = true;}
        else 
        {System.out.println("clave incorrecta");}
    
        intentos--;}

        while ((intentos>0) && (!acertado));

        if (acertado) 
        {System.out.println("Caja fuerte abierta");}
        else 
        {System.out.println("Caja fuerte bloqueada.");
    }
    }
    
}
    

