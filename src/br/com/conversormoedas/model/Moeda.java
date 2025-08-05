package br.com.conversormoedas.model;

public record Moeda(String base_code, MoedaTaxaConversao conversion_rates) {
}
