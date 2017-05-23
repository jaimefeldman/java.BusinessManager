package system;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import console.DetectOS;
import mac.MacApplicationKernel;

/*
 *   Clase raiz que mantiene el hilo principal de la aplicación.
 *   es la unica clase inmutalbe.
 *   de tipo singleton.
 *   asi que init para instanciarse solo puede hacerlo de manera estatica.
 *   
 */


/*
 * 	Clase principal init sigleton.
 */
public class Init {
	
	private Thread coreThrad;
	
	public Init() {
		System.out.println("Iniciando la clase [Init] de arranque y determinado el Aplication Kernel.");
		if(DetectOS.isMac()) {
			runMacintohKernel();

		}else if(DetectOS.isWindows()) {
			runWindowsKernel();

		}else if(DetectOS.isUnix()) {
			runUnixKernel();

		}else {
			exit();
		}
	}

	
	private void runMacintohKernel() {
		MacApplicationKernel macCore = new MacApplicationKernel();
		this.coreThrad = macCore.getThread();

		try {
			System.out.println("esperando 6sec. anted de enviarle stop signal al hilo: " + coreThrad.getName());
			TimeUnit.SECONDS.sleep(25);
			macCore.stop();
		}catch (InterruptedException e) {
			System.err.println("intrrumpido");
		}
	}
	
	private void runWindowsKernel() {
		
	}
	
	private void runUnixKernel() {
		
	}
	
	private void exit() {
		JOptionPane.showMessageDialog(null, "Sistema operativo no compatible", "Error", JOptionPane.ERROR_MESSAGE);
		System.exit(1);
	}
	
	
	/*
	 *  Hilo Main.
	 */
	public static void main(String[] args) {

		Init init = new Init();
	}
}	


	


