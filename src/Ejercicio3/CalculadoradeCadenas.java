package Ejercicio3;

public class CalculadoradeCadenas {

		public String determinarLaExistenciaDeUnCaracterEnLaCadena(String cadena, char caracter ){
			
			String resultado="";
			int c=0;
			cadena=cadena.toLowerCase();
			for(int i=0;i<cadena.length();i++) {
				
				if (caracter == cadena.charAt(i)) {
					resultado="el caracter si esta en la cadena";
				}else {
					resultado="el caracter no esta en la cadena";
				}
				
				if(cadena.charAt(i)=='a'|| cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u') {
					c=c+1;
					//System.out.println("La cantidad de Vocales de la Frase es: "+c);
				}else {
					//System.out.println("No se encontro ninguna vocal");
				}
				
				
			}
			System.out.println("La cantidad de Vocales de la Frase es: "+c);

			return resultado;
		}
}
