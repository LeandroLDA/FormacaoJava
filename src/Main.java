import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nome = "Leandro LDA";
    String conta = "123456";
    String tipoConta = "Corrente";
    double saldo = 1500;
    int opcao = 0;

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
      System.out.println(menu);
      opcao = scanner.nextInt();
       switch (opcao) {
         case 1:
           System.out.println("Escolhida opção 1.");
          break;
         case 2:
           System.out.println("Escolhida opção 2.");
          break;
         case 3:
           System.out.println("Escolhida opção 3.");
          break;
       }
    }
  }
}
