
import java.io.*;
        
public class OperacionesRomanas{

    public static String leerEntrada() {
        String salida = "";
       try{
            // Definimos un flujo de caracteres de entrada: leerEntrada
            BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));
            salida = leerEntrada.readLine();
            // Leemos la entrada, finaliza al pulsar la tecla Entrar
        } catch( IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
            return salida; // Devuelve el dato tecleado
    }
    
    public static int leerNumero() {
        int numero = 0;
       try{
            // Definimos un flujo de caracteres de entrada: leerEntrada
            BufferedReader leerNumero = new BufferedReader(new InputStreamReader(System.in));
            numero = Integer.parseInt(leerNumero.readLine());
            // Leemos la entrada, finaliza al pulsar la tecla Entrar
        } catch( IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
            return numero; // Devuelve el dato tecleado
    }
    
    public static void convertirARomano(){
        
        System.out.println("Escribe el número Arabico (1,2,3...):");
        
        int numero;
        OperacionesRomanas leerNumero = new OperacionesRomanas();
        numero = leerNumero.leerNumero();
               
    }
    
    public static void convertirAArabico(){
     
        System.out.print("Escribe el numero Romano (I,V,X...):");
        
        String numeroArabico;
        String numeroRomano="I V X L C D M";
        OperacionesRomanas leerEntrada = new OperacionesRomanas();
        numeroArabico = leerEntrada.leerEntrada(); 
        
        if (numeroArabico.equals(numeroRomano)){      
            System.out.println("1 Si es número Romano");
        }else{
            System.out.println("No es numero Romano");
        }

    }
   
}