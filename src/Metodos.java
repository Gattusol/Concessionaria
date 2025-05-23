import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    static ArrayList<Automoveis> listaAutomoveis = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Clientes> listaClientes = new ArrayList<>();

    static void adicionarAutomovel() {
        //entrada.nextLine();
        System.out.println("Digite o modelo do automóvel:");
        String modelo = entrada.nextLine();

        System.out.println("Digite o fabricante do automóvel:");
        String fabricante = entrada.nextLine();

        System.out.println("Digite o ano de lançamento:");
        int ano = Integer.parseInt(entrada.nextLine());

        if (ano > 2025) {
            System.out.println("ano de fabricação não pode ser superior a 2025\n");
            return;
        }

        System.out.println("Digite o valor (com centavos):");
        float valor = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("Digite o tipo de automóvel (carro, moto, utilitário):");
        String tipo = entrada.nextLine();

        System.out.println("Digite o status do automóvel (disponível/vendido):");
        String status = entrada.nextLine();

        int novoId = listaAutomoveis.size() + 1;
        Automoveis novoAutomovel = new Automoveis(modelo, novoId, ano, valor, fabricante, tipo, status);
        listaAutomoveis.add(novoAutomovel);

        System.out.println("Automóvel adicionado com sucesso!\n");
    }

    static void adicionarCliente() {
        System.out.println("Digite o nome do cliente:");
        String nome = entrada.nextLine();

        System.out.println("Digite o número de telefone:");
        String telefone = entrada.nextLine();

        System.out.println("Digite o número do CPF/CNPJ (sem pontos):");
        String cpfoucnpj = entrada.nextLine();

        if (cpfoucnpj.length() != 11 && cpfoucnpj.length() != 14) {
            System.out.println("o CPF precisa ter 11 números e CNPJ 14!\n");
            return;
        }

        int novoId = listaClientes.size() + 1;
        Clientes novoCliente = new Clientes(nome, novoId, telefone, cpfoucnpj);
        listaClientes.add(novoCliente);

        System.out.println("Cliente adicionado com sucesso!\n");
    }

    static void removerAutomovel() {
        System.out.println("Deseja realmente remover um automóvel?");
        System.out.println("Digite o número do automóvel ou 'cancelar' para voltar:");

        String resposta = entrada.next();

        if (resposta.equalsIgnoreCase("cancelar")) {
            return;
        }

        try {
            int indice = Integer.parseInt(resposta) - 1;

            if (indice >= 0 && indice < listaAutomoveis.size()) {
                listaAutomoveis.remove(indice);

                for (int i = 0; i < listaAutomoveis.size(); i++) {
                    listaAutomoveis.get(i).setId(i + 1);
                }

                System.out.println("Automóvel removido com sucesso.\n");
            } else {
                System.out.println("Número inválido.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.\n");
        }
    }

    static void removerCliente() {
        System.out.println("Deseja realmente remover um cliente?");
        System.out.println("Digite o número do cliente ou 'cancelar' para voltar:");

        String resposta2 = entrada.next();

        if (resposta2.equalsIgnoreCase("cancelar")) {
            return;
        }

        try {
            int indice2 = Integer.parseInt(resposta2) - 1;

            if (indice2 >= 0 && indice2 < listaClientes.size()) {
                listaClientes.remove(indice2);

                for (int i = 0; i < listaClientes.size(); i++) {
                    listaClientes.get(i).setId2(i + 1);
                }

                System.out.println("Cliente removido com sucesso.\n");
            } else {
                System.out.println("Número inválido.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.\n");
        }
    }

    static void atualizarAutomovel() {
        System.out.println("Digite o número do automóvel que deseja atualizar:");
        int indice = entrada.nextInt() - 1;

        if (indice < 0 || indice >= listaAutomoveis.size()) {
            System.out.println("Automóvel não encontrado.\n");
            return;
        }

        Automoveis automovel = listaAutomoveis.get(indice);

        System.out.println("Oque deseja atualizar?");
        System.out.println("1. Modelo");
        System.out.println("2. Fabricante");
        System.out.println("3. Ano");
        System.out.println("4. Valor");
        System.out.println("5. Tipo");
        System.out.println("6. Status");
        System.out.println("7. Cancelar");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo modelo:");
                String novoModelo = entrada.nextLine();
                automovel.setModelo(novoModelo);
                System.out.println("Modelo atualizado.\n");
                break;
            case 2:
                System.out.println("Digite o novo fabricante:");
                String novoFabricante = entrada.next();
                automovel.setFabricante(novoFabricante);
                System.out.println("Fabricante atualizado.\n");
                break;
            case 3:
                System.out.println("Digite o novo ano:");
                int novoAno = entrada.nextInt();
                automovel.setAno(novoAno);
                System.out.println("Ano atualizado.\n");
                break;
            case 4:
                System.out.println("Digite o novo valor:");
                float novoValor = entrada.nextFloat();
                automovel.setValor(novoValor);
                System.out.println("Valor atualizado.\n");
                break;
            case 5:
                System.out.println("Digite o novo tipo:");
                String novoTipo = entrada.next();
                automovel.setTipo(novoTipo);
                System.out.println("Tipo atualizado.\n");
                break;
            case 6:
                System.out.println("Digite o novo valor:");
                String novoStatus = entrada.next();
                automovel.setStatus(novoStatus);
                System.out.println("Status atualizado.\n");
                break;
            case 7:
                System.out.println("Atualização cancelada.\n");
                break;
            default:
                System.out.println("Opção inválida.\n");
        }
    }

    static void atualizarCliente() {
        System.out.println("Digite o número do cliente que deseja atualizar:");
        int indice = entrada.nextInt() - 1;

        if (indice < 0 || indice >= listaClientes.size()) {
            System.out.println("Cliente não encontrado.\n");
            return;
        }

        Clientes cliente = listaClientes.get(indice);

        System.out.println("O que deseja atualizar?");
        System.out.println("1. Nome");
        System.out.println("2. Telefone");
        System.out.println("3. CPF/CNPJ");
        System.out.println("4. Cancelar");

        int opcao2 = entrada.nextInt();

        switch (opcao2) {
            case 1:
                System.out.println("Digite o novo nome:");
                String novoNome = entrada.nextLine();
                cliente.setNome(novoNome);
                System.out.println("Nome atualizado.\n");
                break;
            case 2:
                System.out.println("Digite o novo telefone:");
                String novoTelefone = entrada.next();
                cliente.setTelefone(novoTelefone);
                System.out.println("Telefone atualizado.\n");
                break;
            case 3:
                System.out.println("Digite o novo CPF/CNPJ:");
                String novoCPFOUCNPJ = entrada.next();
                cliente.setCPFOUCNPJ(novoCPFOUCNPJ);
                System.out.println("CPF/CNPJ atualizado.\n");
                break;
            case 4:
                System.out.println("Atualização cancelada.\n");
                break;
            default:
                System.out.println("Opção inválida.\n");
        }
    }

    static void mostrarAutomoveis() {
        if (listaAutomoveis.isEmpty()) {
            System.out.println("Nenhum automóvel cadastrado.\n");
        } else {
            for (Automoveis a : listaAutomoveis) {
                System.out.println(a);
            }
        }
    }

    static void mostrarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.\n");
        } else {
            for (Clientes a : listaClientes) {
                System.out.println(a);
            }
        }
    }
}