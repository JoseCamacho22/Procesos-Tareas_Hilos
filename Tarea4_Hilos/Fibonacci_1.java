package Tarea4_Hilos;

/**
 * 
 * @author José Augusto Camacho Fernández
 *
 */
//creamos la clase Fibo dentro de nuestra clase fibonacci
public class Fibonacci_1 extends Thread {

	int numero;

	//creamos el constructor con un int y un String
	public Fibonacci_1 (int numeros) {

		this.numero = numeros;
	}

	
	
	public void run() {
		System.out.println("Primer hilo que hemos creado extendiendo Thread");
		int num1 = 1;
		int num2 = 1;
		int nx=0;
		
		System.out.print(num1 + "\n"+num2);
		for (int i = 0; i <= numero; i++) {
			
			nx=num1+num2;
			num1 = num2;
			num2 =nx;
			System.out.println(nx);
	}
	
	}
	
	
}





