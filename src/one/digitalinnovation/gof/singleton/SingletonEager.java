package one.digitalinnovation.gof.singleton;

/*
 * Singleton "apressado" (Eager)
 */
public class SingletonEager {
    // Instância única criada no momento da declaração
    private static final SingletonEager instancia = new SingletonEager();

    // Construtor privado impede instanciamento externo
    private SingletonEager() {
        super();
    }

    // Método público para obter a única instância da classe
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
