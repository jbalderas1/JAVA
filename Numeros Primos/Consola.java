/**
José Gerardo Balderas Monroy 
		Compilar solo esta clase. 
**/

public class Consola extends Operaciones{	
	
	public static void main (String[] args){
	
		System.out.println(titulo);
		long tiempoInicio = System.currentTimeMillis();
		generarPrimo();
		long totalTiempo = System.currentTimeMillis() - tiempoInicio;
		System.out.println("Tiempo de ejecuci\u00f3n:" + totalTiempo + " miliseg");
	
	}
}	