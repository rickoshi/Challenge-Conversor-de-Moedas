import java.util.Scanner;

public class MenuMoeda {

    public static void imprimeInformacoesMoedas() {
        System.out.println(Constantes.OPCAO_HISTORICO + ") Ver histórico de conversões");
        System.out.println(Constantes.ARS + ") ARS - Peso argentino");
        System.out.println(Constantes.BOB + ") BOB - Boliviano boliviano");
        System.out.println(Constantes.BRL + ") BRL - Real brasileiro");
        System.out.println(Constantes.CLP + ") CLP - Peso chileno");
        System.out.println(Constantes.COP + ") COP - Peso colombiano");
        System.out.println(Constantes.USD + ") USD - Dólar americano");
        System.out.println(Constantes.OPCAO_SAIDA + ") Sair");
        System.out.println("******************************");
    }

    public static void imprimeMensagemPrimeiraMoeda() {
        System.out.println("Digite o número para converter a partir de: ");
    }

    public static boolean isOpcaoHistorico(int opcao) {
        return opcao == Constantes.OPCAO_HISTORICO;
    }

    public static boolean isOpcaoInvalida(int opcao) {
        return (opcao < Constantes.OPCAO_HISTORICO || opcao > Constantes.OPCAO_SAIDA);
    }

    public static boolean isOpcaoSair(int opcao) {
        return opcao == Constantes.OPCAO_SAIDA;
    }

    // Validate user input among the options available
    public static int retornaOpcaoValida(Scanner scanner) {
        while (true) {
            int opcaoUsuario = scanner.nextInt();
            if (isOpcaoInvalida(opcaoUsuario)) {
                System.out.println("Erro: Digite um número válido");
                System.out.println("Digite um número entre " + Constantes.OPCAO_HISTORICO +
                        " e " + Constantes.OPCAO_SAIDA);
                System.out.println();
                imprimeInformacoesMoedas();
            } else {
                return opcaoUsuario;
            }
        }
    }
}
