public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");;
        }else {
            System.out.println("Amplie sue plano para este conteúdo");
        }
        
        int notaDoFilme1 = 6; 
        
        switch (notaDoFilme1) {
            case 1:
                // código a ser executado se a expressão for igual a valor1
                System.out.println("Valor menor que 5");
                break;
            case 2:
                // código a ser executado se a expressão for igual a valor2
                System.out.println("Valor maior que 5");
                break;
            case 6:
                // código a ser executado se a expressão for igual a valor3
                System.out.println("Valor igual a 6");
                break;
            default:
                System.out.println("Valor não se enquadra na expressão");
                break;
        }
    }

}
