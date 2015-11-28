package Tarea4_Hilos;
/**
 * 
 * @author José Augusto Camacho Fernández
 *
 */

public class Contador_descontrolado extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		int i=1;
		
		while(!Thread.currentThread().isInterrupted()){
			System.out.println(i);
			i++;
			
		}
	}
	

}
