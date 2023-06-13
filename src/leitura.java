import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito.");
        String filme = leitura.nextLine();
        System.out.println(filme);
        Scanner lancamento = new Scanner(System.in);
        System.out.println("Em que ano este filme foi lançado?");
        int anoLancado = lancamento.nextInt();
        System.out.println(String.format("Este filme foi lancado em %d", anoLancado));
        System.out.println("Digite a data por extenso");
        Scanner dataLancamento = new Scanner(System.in);
        String data = dataLancamento.nextLine();
        System.out.println(String.format("Este filme é de %s."));
    }
}
