package Tarea4_Hilos;
/**
 * 
 * @author José Augusto Camacho Fernández
 *
 */

public class Cuenta_atras  extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	System.out.println("Empieza la cuenta atras :");
	
	for (int i = 10; i > 0; i--) {
		System.out.println(i);
		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		  }
		}
	
	System.out.println("La cuenta atras a llegado a su fin ");
	}
		
}

