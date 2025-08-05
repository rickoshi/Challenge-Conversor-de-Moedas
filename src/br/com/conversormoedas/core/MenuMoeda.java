package br.com.conversormoedas.core;

import java.util.Scanner;

public class MenuMoeda {

    public static void imprimeInformacoesMoedas() {
        System.out.println(Constantes.OPCAO_HISTORICO + ") Ver histórico de conversões");
        System.out.println(Constantes.ARS_INTEGER + ") ARS - Peso argentino");
        System.out.println(Constantes.BOB_INTEGER + ") BOB - Boliviano");
        System.out.println(Constantes.BRL_INTEGER + ") BRL - Real brasileiro");
        System.out.println(Constantes.CLP_INTEGER + ") CLP - Peso chileno");
        System.out.println(Constantes.COP_INTEGER + ") COP - Peso colombiano");
        System.out.println(Constantes.USD_INTEGER + ") USD - Dólar americano");
        System.out.println(Constantes.CAD_INTEGER + ") CAD - Dólar Canadense");
        System.out.println(Constantes.CNY_INTEGER + ") CNY - Renminbi (Yuan)");
        System.out.println(Constantes.EUR_INTEGER + ") EUR - Euro");
        System.out.println(Constantes.GBP_INTEGER + ") GBP - Libra Esterlina");
        System.out.println(Constantes.JPY_INTEGER + ") JPY - Iene");
        System.out.println(Constantes.KRW_INTEGER + ") KRW - Won Sul-Coreano");
        System.out.println(Constantes.OPCAO_SAIDA + ") Sair");
        System.out.println("******************************");
    }

    public static void imprimeMensagemPrimeiraMoeda() {
        System.out.println();
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
