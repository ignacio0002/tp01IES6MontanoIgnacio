package Ejercicio1;

public class ClaseUsuario {

	private String Apellido;
	private String Nombre;
	
	public String ApellidoyNombre() {
		
		String resultado= Apellido+" "+Nombre;
		
		return resultado;
		
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	//Ejercicio 9
	private int edad;
	private int ingresomensuales;
	private int gastosmensuales;
	
	public int MayoroMenor() {
		if(edad>=18) {
			System.out.println(Apellido+" "+Nombre+" es mayor de edad tiene "+edad);
			return edad;
		}else {
			System.out.println(Apellido+" "+Nombre+" es menor de edad tiene "+edad);
			return edad;
		}
	}
	public int SituacionEconomica(){
		if(ingresomensuales>=gastosmensuales) {
			System.out.println("Su Situacion economica le permite ahorrar.");
		}else {
			System.out.println("Su Situacion economica no le permite ahorrar.");

		}
		
		return gastosmensuales;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getIngresomensuales() {
		return ingresomensuales;
	}
	public void setIngresomensuales(int ingresomensuales) {
		this.ingresomensuales = ingresomensuales;
	}
	public int getGastosmensuales() {
		return gastosmensuales;
	}
	public void setGastosmensuales(int gastosmensuales) {
		this.gastosmensuales = gastosmensuales;
	}
	
	
	
}
