/**
José Gerardo Balderas Monroy 
Programa que imprime los numeros pares de la serie de Fibonacci,
sin pasar de 4,000,000. 
**/

public class OperacionesFibonacci{

static final String titulo = "Serie de Fibonacci";

    public static void generarSerieFibonacci(){
		
            int numeroAnterior = 0;
            int numeroSiguiente = 0;
            int suma=1;
            int total=0;
            int residuo=0;
	
            for( int e= 0; e<=50; ++e){
				
            numeroAnterior= numeroSiguiente;
            numeroSiguiente = suma;
            suma = numeroAnterior + numeroSiguiente;
				
                if(suma%2 ==0){
                    total+=suma;
                    residuo = suma;
                    System.out.println(suma);
                    
                    if(total>=4000000){                        
                        break;
                    }
                }  
            }
            System.out.println("Suma Total:" + (total-residuo));
    }
}	