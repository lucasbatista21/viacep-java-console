package br.com.lucas.viacep.controller;

public class CepController {
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

    }

}
