package poo1.aula01_08.desafio4;

import java.util.Locale;
import java.util.Scanner;

public class SistemaBancario {

    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria José", "11122233344", 35);
        Conta contaPrincipal = new Conta(cliente1, "12345-6", 1500.00);

        Cliente cliente2 = new Cliente("Carlos Alberto", "55566677788", 42);
        Conta contaSecundaria = new Conta(cliente2, "98765-4", 800.00);

        int opcao;
        do {
            exibirMenu(contaPrincipal.getCliente());
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    operacaoDepositar(contaPrincipal);
                    break;
                case 2:
                    operacaoSacar(contaPrincipal);
                    break;
                case 3:
                    operacaoTransferir(contaPrincipal, contaSecundaria);
                    break;
                case 4:
                    operacaoPagar(contaPrincipal);
                    break;
                case 5:
                    operacaoRenderJuros(contaPrincipal);
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (opcao >= 1 && opcao <= 5) {
                mostrarSaldo(contaPrincipal);
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu(Cliente cliente) {
        System.out.printf("\n--- Olá!, %s ---\n", cliente.getNome().split(" ")[0]);
        System.out.println("--- MENU DE OPERAÇÕES --");
        System.out.println("1 Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. transferir");
        System.out.println("4. Pagar");
        System.out.println("5. render Juros"); // Nova opção
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void mostrarSaldo(Conta conta) {
        System.out.printf("Saldo atual de %s: R$ %.2f\n", conta.getCliente().getNome(), conta.getSaldo());
    }

    private static void operacaoDepositar(Conta conta) {
        System.out.print("Digite o valor para depositar: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        System.out.println("Depósito processado.");
    }

    private static void operacaoSacar(Conta conta) {
        System.out.print("Digite o valor para sacar: ");
        double valor = scanner.nextDouble();
        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.err.println("Não foi possível realizar o saque. Saldo insuficiente ou valor inválido.");
        }
    }

    private static void operacaoTransferir(Conta origem, Conta destino) {
        System.out.printf("Você está transferindo da conta de %s para %s.\n", origem.getCliente().getNome(), destino.getCliente().getNome());
        System.out.print("Digite o valor a ser transferido: ");
        double valor = scanner.nextDouble();
        if (origem.transferir(destino, valor)) {
            System.out.println("Transferência realizada com sucesso.");
            mostrarSaldo(destino);
        } else {
            System.err.println("Não foi possível realizar a transferência. Saldo insuficiente ou valor inválido.");
        }
    }

    private static void operacaoPagar(Conta conta) {
        System.out.print("Digite o valor da conta/boleto a pagar: ");
        double valor = scanner.nextDouble();
        if (conta.pagar(valor)) {
            System.out.println("Pagamento realizado com sucesso.");
        } else {
            System.err.println("Não foi possível realizar o pagamento. Saldo insuficiente ou valor inválido.");
        }
    }
    private static void operacaoRenderJuros(Conta conta) {
        System.out.print("Digite a taxa de juros a ser aplicada (ex: 0.1 para 10%): ");
        double taxa = scanner.nextDouble();
        conta.renderJuros(taxa);
        System.out.println("Juros aplicados com sucesso.");
    }
}