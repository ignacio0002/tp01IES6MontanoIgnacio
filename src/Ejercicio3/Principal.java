package Ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena= "Hola Munbdo";
		System.out.println(cadena.charAt(0));
		//metodo para mostar la posicion de cada vocal

		System.out.println(cadena.concat("Gustavo"));
		//Metodo parar Agregar alguna palabra 

		System.out.println(cadena.length());
		//metodo para mostar la cantidad de letras

		System.out.println(cadena.replace('o', 'x'));
		//metodo para cambiar las letras por otras
		
		char caracter='n';
		
		CalculadoradeCadenas calcu = new CalculadoradeCadenas();
		System.out.println(calcu.determinarLaExistenciaDeUnCaracterEnLaCadena(cadena, caracter));
	}

}
