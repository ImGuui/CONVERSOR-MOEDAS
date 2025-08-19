
🧩 Desafio: Conversor de Moedas — Alura

Este projeto é uma solução para o desafio proposto pela Alura, que consiste em criar um **conversor de moedas em Java**, utilizando uma API externa para obter taxas de câmbio em tempo real.

📁 Estrutura do Projeto

src/
 ├── Main.java                 // Interface principal com menu interativo
 ├── CurrencyConverter.java   // Lógica de conversão entre moedas
 └── ExchangeRateService.java // Comunicação com a ExchangeRate-API
 
🔹 `Main.java`

-   Exibe um menu interativo no terminal
-   Recebe entrada do usuário via `Scanner`
-   Chama o conversor com os parâmetros escolhidos

🔹 `CurrencyConverter.java`

-   Calcula o valor convertido com base na taxa de câmbio
-   Utiliza a `ExchangeRateService` para obter a taxa

🔹 `ExchangeRateService.java`

-   Faz requisição HTTP com `HttpClient`
-   Lê e interpreta o JSON com `Gson`
-   Retorna a taxa de câmbio entre duas moedas

🛠️ Tecnologias e Conceitos Usados

-   Java moderno (HttpClient, switch expressions)
-   Gson para leitura de JSON
-   Scanner para entrada interativa
-   Organização modular e boas práticas de encapsulamento
-   Integração com API pública (ExchangeRate-API)
