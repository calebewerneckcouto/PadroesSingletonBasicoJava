package one.digitalinnovation.gof;

/*
 * 
 * Singleton "apressado" 
 * 
 * 
 */

public class SingletonEager {
	private static SingletonEager instancia;

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {

		return instancia;
	}
}
