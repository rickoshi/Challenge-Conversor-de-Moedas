import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the object to convert Moeda
        // The object can convert and print Moeda, return the value of Moeda, and return the String of Moeda
        ConverteMoeda converteMoeda = new ConverteMoeda();

        // Create a variable that stores user option. It changes through the program
        int opcaoUsuario;

        while (true) {
            System.out.println("Digite o número para converter a partir de: ");
            // Call static method from MenuMoeda that prints available currencies
            MenuMoeda.imprimeInformacoesMoedas();
            opcaoUsuario = scanner.nextInt();

            // Break if user inputs 7 (constant in MenuMoeda class)
            if (opcaoUsuario == MenuMoeda.OPCAO_SAIDA) {
                break;
            }

            // Create variable to store user's first input
            int codigoMoedaInicial = opcaoUsuario;
            System.out.println();

            // The base currency is set in the second to last parameter and the target currency is set in the last parameter
            String endereco = "https://v6.exchangerate-api.com/v6/6b46ad142b98f85a3b33e80b/latest/" +
                    converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial);

            // Create the object to request and return Moeda
            ConsultaMoeda consultaMoeda = new ConsultaMoeda();
            Moeda novaMoeda = consultaMoeda.consultaMoeda(endereco);

            System.out.println("Digite o número para converter a partir de " +
                    converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial) + " para: ");
            MenuMoeda.imprimeInformacoesMoedas();
            opcaoUsuario = scanner.nextInt();

            if (opcaoUsuario == MenuMoeda.OPCAO_SAIDA) {
                break;
            }

            // Create variable to store user's second input
            int codigoMoedaFinal = opcaoUsuario;
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
}
