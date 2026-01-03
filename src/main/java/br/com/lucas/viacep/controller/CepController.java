package br.com.lucas.viacep.controller;

import br.com.lucas.viacep.service.CepService;

public class CepController {
    private final CepService service = new CepService();

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

    }

    public void searchCep(String cep) {
        if (!service.isValidCep(cep)) {
            System.out.println("DIGITE UM CEP VÁLIDO!");
        } else {
            // Ainda falta configuramos a API para exibir as infos
        }
    }

}
