package br.com.conversormoedas.core;

import br.com.conversormoedas.model.Moeda;
import br.com.conversormoedas.model.MoedaTaxaConversao;

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
            case Constantes.ARS_INTEGER -> moedaTaxaConversao.ARS();
            case Constantes.BOB_INTEGER -> moedaTaxaConversao.BOB();
            case Constantes.BRL_INTEGER -> moedaTaxaConversao.BRL();
            case Constantes.CLP_INTEGER -> moedaTaxaConversao.CLP();
            case Constantes.COP_INTEGER -> moedaTaxaConversao.COP();
            case Constantes.USD_INTEGER -> moedaTaxaConversao.USD();
            case Constantes.CAD_INTEGER -> moedaTaxaConversao.CAD();
            case Constantes.CNY_INTEGER -> moedaTaxaConversao.CNY();
            case Constantes.EUR_INTEGER -> moedaTaxaConversao.EUR();
            case Constantes.GBP_INTEGER -> moedaTaxaConversao.GBP();
            case Constantes.JPY_INTEGER -> moedaTaxaConversao.JPY();
            case Constantes.KRW_INTEGER -> moedaTaxaConversao.KRW();
            default -> -1;
        };
    }

    public String retornaCodigoMoedaString(int codigoMoeda) {
        return switch (codigoMoeda) {
            case Constantes.ARS_INTEGER -> Constantes.ARS_STRING;
            case Constantes.BOB_INTEGER -> Constantes.BOB_STRING;
            case Constantes.BRL_INTEGER -> Constantes.BRL_STRING;
            case Constantes.CLP_INTEGER -> Constantes.CLP_STRING;
            case Constantes.COP_INTEGER -> Constantes.COP_STRING;
            case Constantes.USD_INTEGER -> Constantes.USD_STRING;
            case Constantes.CAD_INTEGER -> Constantes.CAD_STRING;
            case Constantes.CNY_INTEGER -> Constantes.CNY_STRING;
            case Constantes.EUR_INTEGER -> Constantes.EUR_STRING;
            case Constantes.GBP_INTEGER -> Constantes.GBP_STRING;
            case Constantes.JPY_INTEGER -> Constantes.JPY_STRING;
            case Constantes.KRW_INTEGER -> Constantes.KRW_STRING;
            default -> "";
        };
    }
}