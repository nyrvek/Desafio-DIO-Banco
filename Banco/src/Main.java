import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banc banc = new Banc();

        while (true){
            System.out.println("\nBem-vindo ao Banco! Selecione uma opção:");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Exibir todas as contas");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 6){
                break;
            }
            switch (opcao){
                case 1:
                    System.out.println("Nome do Cliente:");
                    String nome = scanner.nextLine();
                    System.out.println("CPF do Cliente:");
                    String cpf = scanner.nextLine();
                    ClienteBanco cliente = new ClienteBanco(nome, cpf);
                    ContaBanco conta = banc.creatAcount(cliente);
                    System.out.println("Conta criada com sucesso! Número da conta: " + conta.getAcountNumber());
                    break;

                case 2:
                    System.out.println("Número da conta:");
                    int numeroConta = scanner.nextInt();
                    ContaBanco contaParaDeposito = banc.searchAcount(numeroConta);
                    if (contaParaDeposito != null) {
                        System.out.println("Valor a depositar:");
                        double valorDeposito = scanner.nextDouble();
                        contaParaDeposito.deposit(valorDeposito);
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Número da conta:");
                    numeroConta = scanner.nextInt();
                    ContaBanco contaParaSaque = banc.searchAcount(numeroConta);
                    if (contaParaSaque != null) {
                        System.out.println("Valor a sacar:");
                        double valorSaque = scanner.nextDouble();
                        contaParaSaque.witdraw(valorSaque);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Número da conta:");
                    numeroConta = scanner.nextInt();
                    ContaBanco contaParaConsulta = banc.searchAcount(numeroConta);
                    if (contaParaConsulta != null) {
                        System.out.println("Saldo atual: " + contaParaConsulta.getBalance());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    banc.showAllAcounts();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
