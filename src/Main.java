// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*// Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/
        String teste;
        teste = """
                    Um teste legal 
                            da String teste 
                                 usando text blocks!
                            """;
        String texto = "texto string";
        System.out.println(String.format("""
              Este é um %s 
                  Este é um decimal %d 
                      E este é um float %f
                      """, texto, 10, 12.2));

        int classificacao;

        double media = 8.3333;
        classificacao = (int) (media/2); //isto é um casting explicito de double em int.
        System.out.println(String.format("Ä média é: %d pontos", classificacao));

        double temperatura = 46.54;

        double fahrenheit = (temperatura* 1.8) + 32;
        int fahrenheitCasting = (int) (temperatura* 1.8) + 32;
        System.out.println(String.format("Este é o resultado sem o casting, que dá exatamente %f graus Farenheit.", fahrenheit));
        System.out.println(String.format("Este é o resultado fazendo casting de double para integer que dá aproximadamente %dC", fahrenheitCasting));
    }

   /* public class DesafioTemperatura {

        public static void main(String[] args) {
            double temperaturaEmCelsius = 30.4;
            double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

            String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

            System.out.println(mensagem);

            int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
            System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

        }*/

    }