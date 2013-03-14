import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
José Gerardo Balderas Monroy. 
Clase que contiene el método Main, asi como un método que lee un dato de entrada de teclado
* El método de Convertir trata la cadena de entrada para sustituir el caracter "o" por "x". 
**/

public class Convertir implements Solucion{

    public static void main (String[] args){
	
        System.out.println("Sustitucion de Caracteres");      
        System.out.println("Escribe la cadena a convertir: ");
        
        String cadena;
        Convertir cadenaConvertir = new Convertir();
        cadena = cadenaConvertir.convertir("Argumento");
        System.out.println("Cadena convertida: " + cadena);
       
    }
	
    public String leerEntrada() {
        String salida = "";
       try{
            BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));
            salida = leerEntrada.readLine();
        } catch( IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
            return salida; // Devuelve el string
    }	

    public String convertir(String entrada){	
         //length(), indexOf(), substring()
        
        Convertir leerString = new Convertir();
        entrada = leerString.leerEntrada();	
          
        String palabra[]=entrada.split("");
        StringBuffer cadenafinal = new StringBuffer();
        String cadena;
        int contador=0;
       
        for(int e =1; e<= entrada.length();e++){
           
            if(palabra[e].indexOf("o")!=-1){
                
                contador++;
            
                for(int i = 0; i<=contador;i++){
                    String remplazo = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
                            + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
                    palabra[e] = remplazo.substring(0,i);
                }            
            } 
            
            cadenafinal = cadenafinal.append(palabra[e]);
            cadena = palabra[e];
            //System.out.println(cadena + contador);
 
        }
            
	return cadenafinal.toString();
    }
}