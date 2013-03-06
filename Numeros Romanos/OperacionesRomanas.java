import java.io.*;
        
public class OperacionesRomanas{

    public static String leerEntrada() {
        String salida = "";
       try{
            // Definimos un flujo de caracteres de entrada: leerEntrada
            BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));
            salida = leerEntrada.readLine();
        } catch( IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
            return salida; // Devuelve el string
    }
    
    public static void convertirARomano(){
        System.out.println("Escribe el numero Arabico (1,2,3...):");
        
        //Map<Object,String> mp= new HashMap<Object, String>();
        //mp.put(new Integer(1), "I");
        String arabico;
        OperacionesRomanas leerNumero = new OperacionesRomanas();
        arabico = leerNumero.leerEntrada();
        Integer numeroArabico = Integer.parseInt(arabico);
        
        if (numeroArabico>=1 && numeroArabico<=3888){
            
            String remplazaNumero[]=new String[4];
            String numeroEntrada[] = arabico.split("");
            
            if(arabico.length()==1){
                remplazaNumero[0]="0";
                remplazaNumero[1]="0";
                remplazaNumero[2]="0";
                remplazaNumero[3]=numeroEntrada[1];
            }
            
            if(arabico.length()==2){
                remplazaNumero[0]="0";
                remplazaNumero[1]="0";
                remplazaNumero[2]=numeroEntrada[1];
                remplazaNumero[3]=numeroEntrada[2];
            }
            
            if(arabico.length()==3){
                remplazaNumero[0]="0";
                remplazaNumero[1]=numeroEntrada[1];
                remplazaNumero[2]=numeroEntrada[2];
                remplazaNumero[3]=numeroEntrada[3];
            }
            
            if(arabico.length()==4){
                remplazaNumero[0]=numeroEntrada[1];
                remplazaNumero[1]=numeroEntrada[2];
                remplazaNumero[2]=numeroEntrada[3];
                remplazaNumero[3]=numeroEntrada[4];
            }
            
            /**Ciclo de prueba
            for(int i= 0; i< vectorEntrada.length; i++){
                System.out.println(i + ":" + vectorEntrada[i]);                     
            }**/
            
            if(remplazaNumero.length==4){
                String miles="";
                String centenas="";
                String decenas="";
                String unidad="";
                
                if(remplazaNumero[0].equals("1")){
                    miles = "M";
                }if(remplazaNumero[0].equals("2")){
                    miles = "MM";
                }if(remplazaNumero[0].equals("3")){
                    miles = "MMM";
                }if(remplazaNumero[1].equals("1")){
                    centenas = "C";
                }if(remplazaNumero[1].equals("2")){
                    centenas = "CC";
                }if(remplazaNumero[1].equals("3")){
                    centenas = "CCC";
                }if(remplazaNumero[1].equals("4")){
                    centenas = "CD";
                }if(remplazaNumero[1].equals("5")){
                    centenas = "D";
                }if(remplazaNumero[1].equals("6")){
                    centenas = "DC";                
                }if(remplazaNumero[1].equals("7")){
                    centenas = "DCC";
                }if(remplazaNumero[1].equals("8")){
                    centenas = "DCCC";
                }if(remplazaNumero[1].equals("9")){
                    centenas = "CM";                
                }if(remplazaNumero[2].equals("1")){
                    decenas = "X";
                }if(remplazaNumero[2].equals("2")){
                    decenas = "XX";
                }if(remplazaNumero[2].equals("3")){
                    decenas = "XXX";
                }if(remplazaNumero[2].equals("4")){
                    decenas = "XL";
                }if(remplazaNumero[2].equals("5")){
                    decenas = "L";
                }if(remplazaNumero[2].equals("6")){
                    decenas = "LX";                
                }if(remplazaNumero[2].equals("7")){
                    decenas = "LXX";
                }if(remplazaNumero[2].equals("8")){
                    decenas = "LXXX";
                }if(remplazaNumero[2].equals("9")){
                    decenas = "XC";                
                }if(remplazaNumero[3].equals("1")){
                    unidad = "I";
                }if(remplazaNumero[3].equals("2")){
                    unidad = "II";
                }if(remplazaNumero[3].equals("3")){
                    unidad = "III";
                }if(remplazaNumero[3].equals("4")){
                    unidad = "IV";
                }if(remplazaNumero[3].equals("5")){
                    unidad = "V";
                }if(remplazaNumero[3].equals("6")){
                    unidad = "VI";                
                }if(remplazaNumero[3].equals("7")){
                    unidad = "VII";
                }if(remplazaNumero[3].equals("8")){
                    unidad = "VIII";
                }if(remplazaNumero[3].equals("9")){
                    unidad = "IX";                
                } 
            System.out.println(miles+centenas+decenas+unidad+"\n");   
            }              
              
        }else{
            System.out.println("Numero fuera de rango\n");
        }
    }
    
    public static void convertirAArabico(){
     
        System.out.print("Escribe el numero Romano (I,V,X...):");
        
        String numeroRomano;
        String caracterRomano= "I V X L C D M";
        OperacionesRomanas leerEntrada = new OperacionesRomanas();
        numeroRomano = leerEntrada.leerEntrada(); 
        
        String vectorDefinido[]=caracterRomano.split(" ");
        String vectorEntrada[]=numeroRomano.split("");
        
            for(int i= 0; i< vectorDefinido.length; i++){
                System.out.println("LetraDefinida: " + i + vectorDefinido[i]);       
            }
        
            for(int i= 0; i< vectorEntrada.length; i++){
                
                if(vectorEntrada[i].equals(vectorDefinido[i])){
                    System.out.println("LetraEntrada: " + i + vectorEntrada[i]);
                }else {
                    System.out.println("Que pex");
                }
                     
            }
             
        }

    }