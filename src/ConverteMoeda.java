public class ConverteMoeda {

    public void converteMoeda(Moeda moeda, int codigoMoeda, double valor) {
        System.out.println("A moeda será convertida para: ");
        System.out.println(retornaCodigoMoedaString(codigoMoeda));
        System.out.println();

        double valorMoedaConvertida = retornaValorMoeda(moeda.conversion_rates(), codigoMoeda) * valor;
        System.out.println("Taxa de conversão: ");
        System.out.println(valorMoedaConvertida);
        System.out.println();
    }

    public double retornaValorMoeda(MoedaTaxaConversao moedaTaxaConversao, int codigoMoeda) {
        return switch (codigoMoeda) {
            case 1 -> moedaTaxaConversao.ARS();
            case 2 -> moedaTaxaConversao.BOB();
            case 3 -> moedaTaxaConversao.BRL();
            case 4 -> moedaTaxaConversao.CLP();
            case 5 -> moedaTaxaConversao.COP();
            case 6 -> moedaTaxaConversao.USD();
            default -> -1;
        };
    }

    public String retornaCodigoMoedaString(int codigoMoeda) {
        return switch (codigoMoeda) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> "";
        };
    }
}