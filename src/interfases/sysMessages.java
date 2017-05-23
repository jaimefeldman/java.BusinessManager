package interfases;

public interface sysMessages {
	
	public enum mensajes 	{START, STOP, SLEEP, KILL, QUIT, RESTART, WAKEUP};
	public enum respuestas  {OCUPADO, CORRIENDO, DURMIENDO, DETENIDO};
	
	public respuestas start();
	public respuestas stop();
	public respuestas sleep();
	public respuestas quit();
	public respuestas kill();
	public respuestas restart();
	public respuestas wakeup();
		
}
