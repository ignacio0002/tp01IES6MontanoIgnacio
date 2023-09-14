package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Apellido="Montaño";
		String Nombre="Ignacio";
		
		ClaseUsuario AP=new ClaseUsuario();
		
		AP.setApellido(Apellido);
		AP.setNombre(Nombre);
		System.out.println("2° Año de Informatica");
		System.out.println("Alumno: "+ AP.ApellidoyNombre());
	}

}
