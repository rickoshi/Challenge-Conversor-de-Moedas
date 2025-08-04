import java.util.Scanner;

public class MenuMoeda {
    // Declare constant for minimum currency option
    public static final int OPCAO_MOEDA_MINIMA = 1;
    // Declare constant for the exit option
    public static final int OPCAO_SAIDA = 7;

    public static void imprimeInformacoesMoedas() {
        System.out.println("1) ARS - Peso argentino");
        System.out.println("2) BOB - Boliviano boliviano");
        System.out.println("3) BRL - Real brasileiro");
        System.out.println("4) CLP - Peso chileno");
        System.out.println("5) COP - Peso colombiano");
        System.out.println("6) USD - Dólar americano");
        System.out.println(OPCAO_SAIDA + ") Sair");
        System.out.println("******************************");
    }

    public static void imprimeMensagemPrimeiraMoeda() {
        System.out.println("Digite o número para converter a partir de: ");
    }

    public static boolean isOpcaoInvalida(int opcao) {
        return (opcao < OPCAO_MOEDA_MINIMA || opcao > OPCAO_SAIDA);
    }

    public static boolean isOpcaoSair(int opcao) {
        return opcao == OPCAO_SAIDA;
    }

    // Validate user input among the options available
    public static int retornaOpcaoValida(Scanner scanner) {
        while (true) {
            int opcaoUsuario = scanner.nextInt();
            if (isOpcaoInvalida(opcaoUsuario)) {
                System.out.println("Erro: Digite um número válido");
                System.out.println("Digite um número entre " + OPCAO_MOEDA_MINIMA + " e " + OPCAO_SAIDA);
                System.out.println();
                imprimeInformacoesMoedas();
            } else {
                return opcaoUsuario;
            }
        }
    }
}
