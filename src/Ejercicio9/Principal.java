package Ejercicio9;

import Ejercicio1.ClaseUsuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Apellido="Montaño";
		String Nombre="Ignacio";
		String Mail="nachitojm24@gmail.com";
		int edad=28;
		int ingresomensuales=18500;
		int gastosmensuales=25000;
		System.out.println("DATOS DEL INDIVIDUO");
		System.out.println("APELLIDO: "+Apellido);
		System.out.println("NOMBRE: "+Nombre);
		System.out.println("MAIL: "+Mail);
		System.out.println("EDAD: "+edad);
		System.out.println("INGRESO MENSUAL: "+ingresomensuales);
		System.out.println("SALARIO MENSUAL: "+gastosmensuales);


		ClaseUsuario esmayoromenor = new ClaseUsuario();
		ClaseUsuario situacion = new ClaseUsuario();
		
		esmayoromenor.setApellido(Apellido);
		esmayoromenor.setEdad(edad);
		esmayoromenor.setNombre(Nombre);
		esmayoromenor.MayoroMenor();
		situacion.getApellido();
		situacion.getNombre();
		situacion.getGastosmensuales();
		situacion.getIngresomensuales();
		situacion.SituacionEconomica();
	}

}
