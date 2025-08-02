public class ConverteMoeda {

    public void converteMoeda(Moeda moeda, String codigoMoeda, double valor) {

        System.out.println("A moeda escolhida foi: ");
        System.out.println(codigoMoeda);
        System.out.println();

        double valorMoedaConvertida = escolheMoeda(moeda.conversion_rates(), codigoMoeda) * valor;
        System.out.println("Taxa de conversão: ");
        System.out.println(valorMoedaConvertida);
        System.out.println();
    }

    public double escolheMoeda(MoedaTaxaConversao moedaTaxaConversao, String codigoMoeda) {
        return switch (codigoMoeda) {
            case "ARS" -> moedaTaxaConversao.ARS();
            case "BOB" -> moedaTaxaConversao.BOB();
            case "BRL" -> moedaTaxaConversao.BRL();
            case "CLP" -> moedaTaxaConversao.CLP();
            case "COP" -> moedaTaxaConversao.COP();
            case "USD" -> moedaTaxaConversao.USD();
            default -> -1;
        };
    }
}
