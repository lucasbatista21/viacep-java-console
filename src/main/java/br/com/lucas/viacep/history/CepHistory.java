package br.com.lucas.viacep.history;

import br.com.lucas.viacep.model.Cep;

import java.util.ArrayList;
import java.util.List;

public class CepHistory {

    private final List<Cep> historico = new ArrayList<>();

    public void adicionar(Cep cep) {
        historico.add(cep);
    }

    public List<Cep> listar() {
        return historico;
    }

    public boolean isEmpty() {
        return historico.isEmpty();
    }
}
