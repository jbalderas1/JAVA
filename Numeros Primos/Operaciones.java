/**
José Gerardo Balderas Monroy 

Se Optimiza el método para Generar los números primos. 
**/
import java.lang.Math;

public class Operaciones {

static final String titulo = "Ola Numeros Primos";

	public static void generarPrimo(){

		int numero=2;
		boolean primo=false;
		int contador=0;
		int id= 1;
		
		while (id<=10001){	
			
			for(int i=(int)Math.sqrt(numero); i>=1; i--){
				
				if (numero%i==0){
					contador++;
				}		
						
				if (contador ==1){
					primo=true;		
				}else{primo= false;}	
							
			}	
			
			if(contador==1){			
				System.out.println(id + ":" + numero);			
				id = id +1;	
			}
	
			numero = numero + 1;		
			contador = 0;	
								
		}
	}
}	