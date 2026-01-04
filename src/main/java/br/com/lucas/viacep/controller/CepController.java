package br.com.lucas.viacep.controller;

import br.com.lucas.viacep.history.CepHistory;
import br.com.lucas.viacep.model.Cep;
import br.com.lucas.viacep.service.CepService;

public class CepController {
    private final CepService service = new CepService();
    private final CepHistory history = new CepHistory();

    public void initialMenu() {
        System.out.printf("""
                    1 - BUSCAR CEP
                    2 - EXIBIR HISTÓRICO DE BUSCA
                    3 - ENCERRAR PROGRAMA 
                    DIGITE AQUI A ESCOLHA: """);
    }

    public void closeProgram() {
        System.out.println("ENCERRANDO PROGRAMA...");
        System.exit(0);
    }

    public void displayHistory() {
        System.out.println("EXIBINDO HISTÓRICO...");
        if (history.isEmpty()) {
            System.out.println("Nenhuma busca realizada ainda.");
            return;
        }

        System.out.println("\n=== HISTÓRICO DE BUSCAS ===");

        for (Cep cep : history.listar()) {
            System.out.println(
                    cep.cep() + " - " +
                            cep.localidade() + "/" +
                            cep.uf()
            );
        }

        System.out.println();
    }

    private void exibirResultado(Cep cep) {
        System.out.println("\n=== RESULTADO ===");
        System.out.println("CEP: " + cep.cep());
        System.out.println("Logradouro: " + cep.logradouro());
        System.out.println("Bairro: " + cep.bairro());
        System.out.println("Cidade: " + cep.localidade());
        System.out.println("UF: " + cep.uf());
        System.out.println();
    }

    public void searchCep(String cep) {

        try {
            Cep resultado = service.searchCepService(cep);
            history.adicionar(resultado);
            exibirResultado(resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
