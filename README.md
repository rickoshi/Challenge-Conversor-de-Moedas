# 💱 Challenge: Conversor de Moedas

Neste desafio de programação, desenvolvi uma aplicação de Conversor de moedas para praticar Java. O projeto foi desenvolvido como parte do curso **"Praticando Java: Challenge Conversor de Moedas"** da [Alura](https://www.alura.com.br/).

O conversor oferece interação textual (via console) onde é possível converter valores entre várias moedas em tempo real. Um menu de informações mostra as opções disponíveis e o usuário pode selecionar a moeda inicial e a moeda final. O usuário então digita o valor que deseja converter e a aplicação exibe os resultados no console.

O usuário também pode visualizar o histórico de conversões feitas na mesma sessão e ao sair o programa irá gerar um arquivo de log com todos os registros.

![Badge-Conversor](https://github.com/rickoshi/Challenge-Conversor-de-Moedas/blob/media/Badge-Conversor.png?raw=true)

## 🎥 Demonstração

![Challenge-Conversor-de-Moedas-Demonstração](https://github.com/rickoshi/Challenge-Conversor-de-Moedas/blob/media/Challenge-Conversor-de-Moedas-Demonstra%C3%A7%C3%A3o.gif?raw=true)

## 🔍 Visão Geral

A aplicação:

- Converte valores entre **12 moedas** populares usando taxas de câmbio em tempo real
- Consome a API [ExchangeRate-API](https://www.exchangerate-api.com/) via `HttpClient`
- Interface interativa via terminal (menu numérico)
- Exibe histórico de conversões durante a execução e ao finalizar
- Gera um arquivo de log (LogConversoes.txt) com todos os registros de conversão

**Moedas suportadas:**

> ARS (Peso Argentino) • BOB (Boliviano) • BRL (Real Brasileiro) CLP (Peso Chileno) • COP (Peso Colombiano) • USD (Dólar Americano) CAD (Dólar Canadense) • CNY (Yuan Chinês) • EUR (Euro) GBP (Libra Esterlina) • JPY (Iene Japonês) • KRW (Won Sul-Coreano)



## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Consumo de APIs REST com `HttpClient`
- Manipulação de JSON com GSON
- Java Records para DTOs
- Validação de entradas
- Tratamento de exceções
- Lógica de programação
- Interação com o usuário via console
- Manipulação de datas e horas com `java.time`
- Boas práticas de manutenção com classe de constantes
- Estrutura de projeto em pacotes (`api`, `core`, `model`)
- Registro de logs e manipulação de arquivos



## ⚙️ Funcionalidades

- Menu interativo com **12 opções de moedas**
- Conversão dinâmica usando dados atualizados da API
- Validação de entradas:
  - ❌ Rejeita valores negativos  
  - ❌ Rejeita entradas não numéricas
- Gerenciamento seguro de credenciais de API
- Histórico de conversões acessível a qualquer momento na sessão
- Registro de logs de conversão em arquivo ao encerrar a aplicação



## 📋 Etapas do Desenvolvimento

1. Configuração do projeto Java
2. Integração da biblioteca GSON
3. Construção do Cliente, da Requisição e da Resposta
4. Consumo da API e tratamento da resposta JSON
5. Implementação da lógica de filtragem e conversão
6. Desenvolvimento do menu e interação com o usuário
7. Implementação do histórico de conversões via menu e ao sair
8. Introdução da classe Constantes para evitar literais espalhados
9. Adição de suporte a múltiplas moedas
10. Implementação de GerenciadorAPI para carregar a chave de forma segura
11. Organização em pacotes (api, core, model)
12. Geração de LogConversoes.txt com registro de todas as conversões



## 🔧 Estrutura do Projeto

```text
src/
└── br/
    └── com/
        └── conversormoedas/
            ├── api/							# Classe de consumo da API e gerenciador de chave
            │   ├── ConsultaMoeda.java
            │   └── GerenciadorAPI.java
            ├── core/							# Lógica de conversão, menu e constantes
            │   ├── Constantes.java
            │  	├── ConverteMoeda.java
            │   └── MenuMoeda.java
            ├── model/							# Modelos de dados e histórico
            │    ├── HistoricoConversao.java
            │    ├── Moeda.java
            │    └── MoedaTaxaConversao.java
            └── Main.java						# Ponto de entrada e fluxo principal
            
dependencies/
└── gson-2.13.1.jar

README.md
```



## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **IntelliJ IDEA**
- **GSON (Google JSON Library)**
- **Postman** (para testes com a API)



## 🚀 Como Executar


### Pré-requisitos
- Java JDK 21 ou superior instalado
- Chave de acesso (API Key) válida no ExchangeRate-API


### 1. Baixar e extrair o projeto

```bash
git clone <URL_DO_REPOSITORIO>
cd <nome-do-repositorio>
```

Ou baixe o ZIP e extraia localmente.


### 2. Compilar o projeto (Windows)

Abra o **Prompt de Comando (cmd)**, navegue até o diretório raiz do projeto e execute:

```bash
javac -cp dependencies\gson-2.13.1.jar -d out -sourcepath src src\br\com\conversormoedas\Main.java
```


### 3. Executar a aplicação (Windows)
Ainda no terminal, execute:

```bash
java -cp out;dependencies\gson-2.13.1.jar br.com.conversormoedas.Main
```

> Obs: No Linux/Mac, substitua ; por : no classpath.


### 4. Siga as instruções no terminal:

	> Na primeira execução, insira sua API key do ExchangeRate-API
	> Selecione as moedas e o valor para conversão
	> Consulte o histórico a qualquer momento (opção do menu)
	> Saia do programa a qualquer momento (opção do menu)
	> Ao sair, um arquivo LogConversoes.txt será gerado com o histórico completo

> **Atenção:** o arquivo de log é sobrescrito a cada execução. Renomeie-o manualmente para preservar históricos anteriores.



## 📝 Exemplo de Saída

```text
Registros de Logs
[05/08/2025 06:41:13] 534,00 ARS → 1618,71 COP
[05/08/2025 06:41:15] 423,00 CAD → 2105,02 BOB
[05/08/2025 06:41:20] 231,00 CLP → 0,24 USD
```


