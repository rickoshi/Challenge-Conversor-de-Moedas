public class ConverteMoeda {

    // Method prints information and returns a value
    public double converteMoeda(Moeda moeda, int codigoMoeda, double valor) {
        System.out.println("A moeda será convertida para: ");
        System.out.println(retornaCodigoMoedaString(codigoMoeda));
        System.out.println();

        double valorMoedaConvertida = retornaValorMoeda(moeda.conversion_rates(), codigoMoeda) * valor;
        System.out.println("Taxa de conversão: ");
        System.out.println(valorMoedaConvertida);
        System.out.println();

        return valorMoedaConvertida;
    }

    public double retornaValorMoeda(MoedaTaxaConversao moedaTaxaConversao, int codigoMoeda) {
        return switch (codigoMoeda) {
            case Constantes.ARS -> moedaTaxaConversao.ARS();
            case Constantes.BOB -> moedaTaxaConversao.BOB();
            case Constantes.BRL -> moedaTaxaConversao.BRL();
            case Constantes.CLP -> moedaTaxaConversao.CLP();
            case Constantes.COP -> moedaTaxaConversao.COP();
            case Constantes.USD -> moedaTaxaConversao.USD();
            default -> -1;
        };
    }

    public String retornaCodigoMoedaString(int codigoMoeda) {
        return switch (codigoMoeda) {
            case Constantes.ARS -> "ARS";
            case Constantes.BOB -> "BOB";
            case Constantes.BRL -> "BRL";
            case Constantes.CLP -> "CLP";
            case Constantes.COP -> "COP";
            case Constantes.USD -> "USD";
            default -> "";
        };
    }
}