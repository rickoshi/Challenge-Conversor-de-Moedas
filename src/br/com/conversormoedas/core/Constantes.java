package br.com.conversormoedas.core;

public class Constantes {

    // Declare constant for conversion history
    public static final int OPCAO_HISTORICO = 0;

    // Currency options
    // To add a currency, the following must be modified:
    // br.com.conversormoedas.model.MoedaTaxaConversao
    // Constants.OPCAO_SAIDA
    // br.com.conversormoedas.core.MenuMoeda.imprimeInformacoesMoedas()
    // br.com.conversormoedas.core.ConverteMoeda.retornaValorMoeda()
    // br.com.conversormoedas.core.ConverteMoeda.retornaCodigoMoedaString()

    // Currency number options
    public static final int ARS_INTEGER = 1;
    public static final int BOB_INTEGER = 2;
    public static final int BRL_INTEGER = 3;
    public static final int CLP_INTEGER = 4;
    public static final int COP_INTEGER = 5;
    public static final int USD_INTEGER = 6;
    public static final int CAD_INTEGER = 7;
    public static final int CNY_INTEGER = 8;
    public static final int EUR_INTEGER = 9;
    public static final int GBP_INTEGER = 10;
    public static final int JPY_INTEGER = 11;
    public static final int KRW_INTEGER = 12;

    // Currency code options
    public static final String ARS_STRING = "ARS";
    public static final String BOB_STRING = "BOB";
    public static final String BRL_STRING = "BRL";
    public static final String CLP_STRING = "CLP";
    public static final String COP_STRING = "COP";
    public static final String USD_STRING = "USD";
    public static final String CAD_STRING = "CAD";
    public static final String CNY_STRING = "CNY";
    public static final String EUR_STRING = "EUR";
    public static final String GBP_STRING = "GBP";
    public static final String JPY_STRING = "JPY";
    public static final String KRW_STRING = "KRW";

    // Declare constant for the exit option
    public static final int OPCAO_SAIDA = 13;
}
