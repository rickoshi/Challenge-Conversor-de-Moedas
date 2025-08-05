import java.util.Scanner;

public class GerenciadorAPI {

    public static String getChaveApi() {
        System.out.println("É necessario uma chave de API para executar esse programa");
        System.out.println("A chave será usada apenas nesta sessão");
        System.out.println("Obtenha uma API key gratuita em: https://www.exchangerate-api.com");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insira a API key: ");
            String chaveApi = scanner.nextLine().trim();

            if (isChaveApiValida(chaveApi)) {
                return chaveApi;
            }

            System.out.println();
            System.out.println("Formato inválido");
            System.out.println("A chave deve ter entre 20-40 caracteres alfanuméricos");
            System.out.println("Consulte https://www.exchangerate-api.com para mais informações");
        }
    }

    private static boolean isChaveApiValida(String chaveApi) {
        return chaveApi != null && chaveApi.matches("^[a-zA-Z0-9]{20,40}$");
    }
}
