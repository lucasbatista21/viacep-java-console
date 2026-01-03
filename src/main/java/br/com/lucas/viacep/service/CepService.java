package br.com.lucas.viacep.service;

import br.com.lucas.viacep.api.ViaCepClient;
import br.com.lucas.viacep.model.Cep;

public class CepService {

    public boolean isValidCep(String cep) {

        if (cep == null) {
            return false;
        }

        return cep.matches("^\\d{8}$");
    }

    public Cep searchCepService(String cep) {
        if (!isValidCep(cep)) {
            throw new IllegalArgumentException("CEP inválido");
        }

        ViaCepClient client = new ViaCepClient();
        return client.searchCepClient(cep);
    }

}
