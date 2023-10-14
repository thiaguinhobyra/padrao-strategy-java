package dio.subsistema2;

public class CepService {
    private static CepService instancia = new CepService();
    
    private CepService() {
        super();
    }

    public static CepService getCepService() {
        return instancia;
    }

    public String getCidade(String cep) {
        return "Codó";
    }

    public String getEstado(String cep) {
        return "MA";
    }
}
