package subsitema2.cep;

public class CepApi {
	
	private static final CepApi instancia = new CepApi();

    // Construtor privado impede instanciamento externo
    private CepApi() {
        super();
    }

    // Método público para obter a única instância da classe
    public static CepApi getInstancia() {
        return instancia;
    }
    
    public String recuperarCidade(String cep) {
    	
    	return "Lagoa Santa";
		
	}
    
 public String recuperarEstado(String estado) {
    	
    	return "Minas Gerais";
		
	}


}
