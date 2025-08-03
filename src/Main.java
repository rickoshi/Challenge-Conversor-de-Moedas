import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the object to convert Moeda
        // The object can convert and print Moeda, return the value of Moeda, and return the String of Moeda
        ConverteMoeda converteMoeda = new ConverteMoeda();

        System.out.println("Digite o número para converter a partir de: ");
        System.out.println("1) ARS");
        System.out.println("2) BOB");
        System.out.println("3) BRL");
        System.out.println("4) CLP");
        System.out.println("5) COP");
        System.out.println("6) USD");
        int codigoMoedaInicial = scanner.nextInt();
        System.out.println();

        // The base currency is set in the second to last parameter and the target currency is set in the last parameter
        String endereco = "https://v6.exchangerate-api.com/v6/6b46ad142b98f85a3b33e80b/latest/" +
                converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial);

        // Create the object to request and return Moeda
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Moeda novaMoeda = consultaMoeda.consultaMoeda(endereco);

        System.out.println("Digite o número para converter a partir de " +
                converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial) + " para: ");
        System.out.println("1) ARS");
        System.out.println("2) BOB");
        System.out.println("3) BRL");
        System.out.println("4) CLP");
        System.out.println("5) COP");
        System.out.println("6) USD");
        int codigoMoedaFinal = scanner.nextInt();
        System.out.println();

        System.out.println("Digite o valor para ser convertido: ");
        int valorUsuario = scanner.nextInt();
        System.out.println();

        System.out.println("A moeda inicial é: ");
        System.out.println(converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial));
        System.out.println();
        converteMoeda.converteMoeda(novaMoeda, codigoMoedaFinal, valorUsuario);
    }
}
