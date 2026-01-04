package br.com.lucas.viacep.app;

import br.com.lucas.viacep.controller.CepController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean working = true;

        CepController controller = new CepController();

        while (working) {
            controller.initialMenu();
            int choice  = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("DIGITE O CEP: ");
                    String cep = sc.nextLine();
                    controller.searchCep(cep);
                    break;

                case 2:
                   controller.displayHistory();
                    break;

                case 3:
                    controller.closeProgram();

                default:
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");
                    break;
            }

        }

        sc.close();
    }
}