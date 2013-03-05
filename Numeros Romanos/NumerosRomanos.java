import java.io.*;

public class NumerosRomanos extends OperacionesRomanas{

    public static void main(String args[])throws IOException {  
        
        BufferedReader en = new BufferedReader (new InputStreamReader(System.in));
    	int opcion;        	
    	
            do {
                System.out.println("CONVERSOR ROMANO-ARABICO");
                System.out.println("Elige una opcion:");
                System.out.println("1. Arabico-Romano");
                System.out.println("2. Romano-Arabico");
                System.out.println("3. Salir");                
                opcion = Integer.parseInt(en.readLine());  

                switch(opcion){

                    case 1:
                        convertirARomano();
                    break;
                    case 2:
                        convertirAArabico();
                    break;
                }
            }while (opcion != 3);
    }
}