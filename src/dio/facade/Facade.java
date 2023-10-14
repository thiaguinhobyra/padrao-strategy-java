package dio.facade;

import dio.subsistema1.CrmService;
import dio.subsistema2.CepService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade =  CepService.getCepService().getCidade(cep);
        String estado =  CepService.getCepService().getEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
