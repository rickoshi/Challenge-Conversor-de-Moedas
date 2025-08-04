# Challenge: Conversor de Moedas

Neste desafio de programação, desenvolvi uma aplicação de Conversor de moedas para praticar Java. O projeto foi desenvolvido como parte do curso **"Praticando Java: Challenge Conversor de Moedas"** da [Alura](https://www.alura.com.br/).

O conversor oferece interação textual (via console) onde o usuário pode selecionar as opções de moedas distintas (pelo menos seis) que deseja converter. Um menu de informações mostra as opções disponíveis e o usuário pode selecionar a moeda inicial e a moeda final. O usuário então digita o valor que deseja converter e a aplicação exibe os resultados no console.



## 🔍 Visão Geral

A aplicação:

- Realiza conversões entre diferentes moedas em tempo real
- Utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/)
- Possui interface textual interativa via terminal
- Permite conversão entre pelo menos **6 moedas**:
  - ARS (Peso Argentino)  
  - BOB (Boliviano)  
  - BRL (Real Brasileiro)  
  - CLP (Peso Chileno)  
  - COP (Peso Colombiano)  
  - USD (Dólar Americano)



## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Consumo de APIs REST
- Manipulação de JSON com GSON
- Uso de Java Records (DTOs)
- Validação de entradas
- Tratamento de exceções
- Lógica de programação
- Interação com o usuário via console



## ⚙️ Funcionalidades

- Menu interativo com moedas pré-definidas
- Conversão dinâmica usando dados atualizados da API
- Validação de entradas:
  - ❌ Rejeita valores negativos  
  - ❌ Rejeita entradas não numéricas



## 📋 Etapas do Desenvolvimento

1. Configuração do projeto Java
2. Integração da biblioteca GSON
3. Construção do Cliente, da Requisição e da Resposta
4. Consumo da API e tratamento da resposta JSON
5. Implementação da lógica de filtragem e conversão
6. Desenvolvimento do menu e interação com o usuário



## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **IntelliJ IDEA**
- **GSON (Google JSON Library)**
- **Postman** (para testes com a API)



## 🚀 Como Executar


### 1. Baixar e extrair o projeto

- Baixe o repositório como `.zip` e extraia o conteúdo

### 2. Compilar o projeto (Windows)

Abra o **Prompt de Comando (cmd)**, navegue até o diretório raiz do projeto e execute:

```bash
javac -cp dependencies/gson-2.13.1.jar -d out src/*.java
```

### 3. Executar a aplicação (Windows)
Ainda no terminal, execute:

```bash
java -cp out;dependencies/gson-2.13.1.jar Main
```

> Obs: No Linux/Mac, substitua ; por : no classpath.
