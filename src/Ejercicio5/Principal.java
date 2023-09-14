package Ejercicio5;

import Ejercicio1.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=9;
		System.out.println("Factoreal de un numero entre 0 y 10 ");
		System.out.println("El numero es: "+num);
		Calculadora facto=new Calculadora();
		facto.factoreal(num);
	}

}
