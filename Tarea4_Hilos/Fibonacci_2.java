package Tarea4_Hilos;

public class Fibonacci_2 implements Runnable{
	
	/**
	 * 
	 * @author José Augusto Camacho Fernández
	 *
	 */
	
	int numero;
	
	
	public Fibonacci_2(int numeros){
		this.numero=numeros;
	}
	
	public void run() {
		int num1 = 1;
		int num2 = 1;
		int nx=0;
		System.out.println("Parte dos Fibonacci implementando Runnable: ");
		System.out.print(num1 + "\n"+num2);
		for (int i = 0; i <= numero; i++) {
			
			nx=num1+num2;
			num1 = num2;
			num2 =nx;
			System.out.println(nx);
	}
	
}	
}


