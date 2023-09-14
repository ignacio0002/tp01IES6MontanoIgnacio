package Ejercicio1;

public class Calculadora {
//Suma
	private int numA;
	private int numB;
	
	public int sumar() {
		int resultado= numA + numB;
		return resultado;
	}

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}
	
	//Resta
	
	public int Restar() {
		int resultado= numB - numA;
		return resultado;
	}
	
	//Multiplicacion
	public int Multiplicar(){
		int resultado= (numA*numB);
		return resultado;
	}
	//Division
	public double Dividir() {
		
		double resultado= (numB / numA);
		
		return resultado;
	}
	

	//Ejercicio 4 Metodo
	public int paroimpar(int num) {

		System.out.println("El numero es: "+num);
		
		if (num % 2 == 0) {
			System.out.println("El numero es par ");
			num = num*3;
			System.out.println("El triple del numero es: "+ num);
		}else {
			System.out.println("El numero es impar "+ num);
			num = num*2;
			System.out.println("El doble del numero es: "+ num);
		}
		
		return num;
		
	}
	//Ejercicio 5 
	public int factoreal(int num){
		int aux=1;
		

		if (num<0 || num>10) {
			
			System.out.println("RECUERDE INGRESAR UN NUMERO DENTRO DEL RANGO");
			return num;
			
		}else{
			
			for (int i=1; i<=num;i++) {
				aux=aux*i;
			}
			System.out.println("El factoreal del numero es: "+aux);
			return aux;
			
		}
		
	}
	//Ejercicio 6
	

		public void cuentaAtrasFor(){
		
			
			for (int i=320; i>=160 ; i-=20){
				
			System.out.println(i);
			

			}
			
		}
	//Ejercicio 7
		
		public void cuentaAtrasWhile() {
			int numero320=320;
			while(numero320>160) {
				
				numero320-=20;
				System.out.println(numero320);
				
			}
		}
		//Ejercicio8
		public void cuentaAtrasDoWhile() {
			int numero320=320;
			do {
				numero320-=20;
				System.out.println(numero320);
			}while(numero320>160);
			
		}
	
}
