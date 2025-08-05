package br.com.conversormoedas.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistoricoConversao {
    private final String moedaInicial;
    private final String moedaFinal;
    private final double valorInicial;
    private final double valorFinal;
    private final LocalDateTime data;

    public HistoricoConversao(String moedaInicial, String moedaFinal, double valorInicial, double valorFinal) {
        this.moedaInicial = moedaInicial;
        this.moedaFinal = moedaFinal;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("[%s] %.2f %s → %.2f %s",
                data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                valorInicial, moedaInicial, valorFinal, moedaFinal);
    }
}
