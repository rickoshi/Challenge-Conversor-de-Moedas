import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Create ArrayList to store conversion history
    // final prevents the list from being reassigned
    private static final List<HistoricoConversao> historicoConversao = new ArrayList<>();

    private static void exibeHistorico() {
        if (historicoConversao.isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Sem histórico de conversões");
            System.out.println("---------------------------------------------");
            System.out.println();
            return;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Histórico das conversões");
        for (HistoricoConversao itemHistorico : historicoConversao) {
            System.out.println(itemHistorico);
        }
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the object to convert Moeda
        // The object can convert and print Moeda, return the value of Moeda, and return the String of Moeda
        ConverteMoeda converteMoeda = new ConverteMoeda();

        // Create variable that stores user option. It changes through the program
        int opcaoUsuario;

        while (true) {
            // Initial message: "Digite o número para converter a partir de: "
            MenuMoeda.imprimeMensagemPrimeiraMoeda();
            // Call static method from MenuMoeda that prints available currencies
            MenuMoeda.imprimeInformacoesMoedas();

            try {
                // Validate user input among the options available
                opcaoUsuario = MenuMoeda.retornaOpcaoValida(scanner);

                // Break if user inputs 7 (constant in MenuMoeda class)
                if (MenuMoeda.isOpcaoSair(opcaoUsuario)) {
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

                // Print message for second currency
                System.out.println("Digite o número para converter a partir de " +
                        converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial) + " para: ");
                MenuMoeda.imprimeInformacoesMoedas();

                opcaoUsuario = MenuMoeda.retornaOpcaoValida(scanner);

                if (MenuMoeda.isOpcaoSair(opcaoUsuario)) {
                    break;
                }

                // Create variable to store user's second input
                int codigoMoedaFinal = opcaoUsuario;
                System.out.println();

                System.out.println("Digite o valor para ser convertido: ");
                int valorUsuario = scanner.nextInt();

                if (valorUsuario <= 0) {
                    System.out.println("Erro. O valor deve ser positivo");
                    System.out.println();
                    continue;
                }

                System.out.println("A moeda inicial é: ");
                System.out.println(converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial));
                System.out.println();
                double valorConvertido = converteMoeda.converteMoeda(novaMoeda, codigoMoedaFinal, valorUsuario);

                // Create object of conversion history
                // Since the userInput is an integer, convert and use it as parameter
                HistoricoConversao historico = new HistoricoConversao(converteMoeda.retornaCodigoMoedaString(codigoMoedaInicial),
                        converteMoeda.retornaCodigoMoedaString(codigoMoedaFinal),
                        valorUsuario,
                        valorConvertido);

                // Store object in List
                historicoConversao.add(historico);

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números inteiros");
                System.out.println();
                // Clear the buffer so that the next input can be correctly read. Without it, an infinite loop occurs
                scanner.next();
            }
        }
        System.out.println();
        exibeHistorico();
        System.out.println("Fim do programa");
    }
}
