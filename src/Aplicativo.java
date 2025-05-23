//Trabalho feito para Matéria de Modelagem e Desenvolvimento orientado a Objetos
//Fernando Santos Barreto | RA: 923115435
//Kauan Lemos de Souza | RA: 2221202235
//Lucas Guimarães da Silva | RA: 2221202304
//Diagrama da concessionaria está inclusa nos arquivos

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolhaUsuario;

        do {
            System.out.println("Olá!");
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1. Adicionar um automóvel");
            System.out.println("2. Adicionar um cliente(PF/PJ)");
            System.out.println("3. Atualizar um automóvel");
            System.out.println("4. Atualizar um cliente");
            System.out.println("5. Remover um automóvel");
            System.out.println("6. Remover um cliente");
            System.out.println("7. Ver cadastros de automóveis");
            System.out.println("8. Ver cadastros de clientes");
            System.out.println("9. Sair do aplicativo");

            escolhaUsuario = entrada.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    Metodos.adicionarAutomovel();
                    break;
                case 2:
                    Metodos.adicionarCliente();
                    break;
                case 3:
                    Metodos.atualizarAutomovel();
                    break;
                case 4:
                    Metodos.atualizarCliente();
                    break;
                case 5:
                    Metodos.removerAutomovel();
                    break;
                case 6:
                    Metodos.removerCliente();
                    break;
                case 7:
                    Metodos.mostrarAutomoveis();
                    break;
                case 8:
                    Metodos.mostrarClientes();
                    break;
                case 9:
                    System.out.println("Saindo do aplicativo...");
                    break;
            }
        } while (escolhaUsuario != 9);
    }
}
