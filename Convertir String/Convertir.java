
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	/**
José Gerardo Balderas Monroy. 
**/

public class Convertir implements Solucion{

    public static void main (String[] args){
	
        System.out.println("Sustitucion de Caracteres");      
        System.out.println("Escribe la cadena a convertir: ");
        
        String cadena;
        Convertir cadenaConvertir = new Convertir();
        cadena = cadenaConvertir.convertir("Argumento");
        System.out.println("Me regresa: " + cadena);
       
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
          
        String longitud= Integer.toString(entrada.length());
        String palabra[]=entrada.split("");
        StringBuffer cadenafinal = new StringBuffer();
        String antes,despues;
        String cadena="";
        char c= (char)120;
        int contador=1;
       
        for(int e =0; e<= entrada.length();e++){
           
            if(palabra[e].indexOf("o")!=-1){
                contador++;
                palabra[e] = "x";
            } 
            
            cadenafinal = cadenafinal.append(palabra[e]);
            cadena = palabra[e];
            System.out.println(cadena + contador);
            
        }
            System.out.println(cadenafinal);
            antes = entrada.substring(0,entrada.indexOf("o"));
            despues = entrada.substring(entrada.indexOf("o")+1,entrada.length());
            
            cadena =  longitud +  ":" + antes + "x" + despues;
            
	return cadena;
    }
}