package mac;

import java.util.concurrent.TimeUnit;

public class MacApplicationKernel implements Runnable {
	
	private Thread hilo; 
	private volatile Boolean running;

	
	
	public MacApplicationKernel() {
		hilo 		= new Thread(this, "MacKernel-Thread");
		this.running 	= true;

		hilo.start();
		System.out.println("Mac application kernel started... en: " + this.hilo.getName());
	}	
	
	public void stop() {
		System.out.println(this.hilo.getName() + ": stop signal..!");
		hilo.interrupt();
		this.running = false;
	}
	
	public Thread getThread(){
		return this.hilo;
	}
	
	
	@Override
	public void run() {
		while(this.running) {
			try {
				System.out.println(this.hilo.getName() + " durmindo...");
				TimeUnit.SECONDS.sleep(30);
				System.out.println(this.hilo.getName() + " despertando y revisando..");
			} catch (InterruptedException e) {
				System.out.println(hilo.getName() + " interrumpido..");
			}
		}
		System.out.println("Mac application kernel termianted...");
	}
	
	/*
	 *  Chequeo de estructura de directorios.
	 */
	
	
	/*
	 *  Interface Grafica de bienvenida.
	 */
	
	
	
}
