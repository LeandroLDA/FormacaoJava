import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nome = "Leandro LDA";
    String conta = "123456";
    String tipoConta = "Corrente";
      double saldo = 1500;
      int opcao = 0;
      double valor;

      String menu = """
        ************************************************
        Bem vindo ao Banco Boa vida!!

        %s, é um prazer tê lo cono nosso cliente.
        Sua conta é do tipo conta %s
        Este é o seu saldo atual: RS %f.

        Escolha abaixo o que deseja fazer.

        1 - Saldo
        2 - Transferir
        3 - Depositar
        4 - Sair
        ************************************************
        """;

      Scanner scanner = new Scanner(System.in);

      while (opcao != 4) {
        System.out.println(String.format(menu,nome,tipoConta,saldo));
        opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Seu saldo é: RS " + saldo);
            }else if (opcao == 2) {
               System.out.println("Quanto deseja transferir? ");
               valor = scanner.nextDouble();
            if (saldo < valor) {
                System.out.println("Saldo insuficiente para a operação");
            } else
                saldo -= valor;
                System.out.println("Seu saldo atualizado é: RS " + saldo);
            }else if (opcao == 3){
               System.out.println("Quanto deseja depositar? ");
                valor = scanner.nextDouble();
               saldo += valor;
               System.out.println("Seu saldo atualizado é: RS " + saldo);
        }
      }
    }
  }