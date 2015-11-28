package Tarea4_Hilos;

/**
 * 
 * @author José Augusto Camacho Fernández
 *
 */
import java.util.Scanner;

public class  Main_menu extends Thread {
	int n = 0;

	public static void main(String[] args) throws InterruptedException {

		Scanner in = new Scanner(System.in);
		int numero_menu = 0;
		while (true) {
			System.out.println("Seleccione Ejercicio que quiere ");
			System.out.println("1.Ejercicio Fibonacci \t 2.Cuenta atras \t 3.Controlador descontrolado \t 4.salir");
			numero_menu  = in.nextInt();
			switch (numero_menu ) {
			case 1:
				Ejercicio1();
				break;
			case 2:
				Ejercicio2();
				break;	
			case 3:
				Ejercicio3();
				break;
			case 4:
				System.exit(0);
				break;
				
			default:
				break;
			}
		}

	}

	public static void Ejercicio1() {
		new Fibonacci_1(5).run();
		new Fibonacci_2(5).run();
	}



	public static void Ejercicio2() {
		new Cuenta_atras().run();
	}


	
	public static void Ejercicio3() throws InterruptedException {
		System.out.println("Empieza del contador descontrolado");
		
		Thread t = new Contador_descontrolado();
		t.start();
		sleep(1000);
		t.interrupt();
		System.out.println("El contador descontrolado a llegado al final");
	}
}


	

