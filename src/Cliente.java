import java.util.Scanner;

public class Cliente {
    public static void main   (String[] Args){

    String nome;
    int conta = 0;
    int saldo = 0;
    int opcao = 0;

    Scanner scanner = new Scanner(System.in);
    while (opcao == 9)
       switch (opcao) {
           case 1:
               System.out.println("Selecionado Cadastro.");

               //   scanner nome = scanner.nextLine();
               break;

           case 2:
               System.out.println("Selecionado saldo.");
               break;

           case 3:
               System.out.println("Selecionado debito.");
               break;

           case 4:
               System.out.println("Selecionado credito.");
               break;

           default:
               System.out.println("opção inválida");

       }
    }
}
