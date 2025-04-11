# 💱 Conversor de Moedas em Java

Este é um projeto simples em Java que utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para consultar cotações de moedas em tempo real e converter valores entre diferentes moedas.

## 🚀 Funcionalidades

- Consulta de taxas de câmbio em tempo real
- Conversão entre:
  - Dólar Americano (USD) ↔ Peso Argentino (ARS)
  - Dólar Americano (USD) ↔ Real Brasileiro (BRL)
  - Dólar Americano (USD) ↔ Peso Colombiano (COP)
  - Dólar Americano (USD) ↔ Boliviano da Bolívia (BOB)
  - Dólar Americano (USD) ↔ Peso Chileno (CLP)
- Interface de terminal simples via `Scanner`
- Suporte para múltiplas moedas em um menu interativo

---

## 🧩 Estrutura do Projeto

```
src/
├── principal/
│   └── ConversorDeMoeda.java       # Menu principal e controle da lógica de conversão
├── api/
│   └── ConectaApi.java             # Responsável por conectar à ExchangeRate-API
└── moeda/
    ├── ApiResponse.java            # Representa a resposta da API
    └── ConversionRates.java        # Contém as taxas de conversão entre as moedas
```

---

## 🔧 Como executar

1. Clone ou baixe este repositório
2. Instale a biblioteca [Gson](https://github.com/google/gson) (ou adicione ao classpath)
3. Compile os arquivos Java
4. Execute `ConversorDeMoeda.java`

### Exemplo com terminal:
```bash
javac -cp gson-2.10.1.jar src/**/*.java
java -cp ".:gson-2.10.1.jar:src" br.com.alura.conversormoeda.principal.ConversorDeMoeda
```

---

## 🗝️ Dependências

- Java 11+
- Biblioteca [Gson](https://github.com/google/gson) para manipulação de JSON
- Acesso à internet para conectar à ExchangeRate-API

---

## 📌 Observações

- A chave da API usada neste projeto é de exemplo. Recomenda-se registrar sua própria chave gratuita em [exchangerate-api.com](https://www.exchangerate-api.com/).
- As taxas são baseadas na moeda de origem (ex: `USD`) e atualizadas em tempo real conforme o servidor da API.

---

## ✨ Futuras melhorias

- Tornar o conversor totalmente dinâmico, permitindo digitar qualquer par de moedas
- Adicionar interface gráfica (GUI) com JavaFX ou Swing
- Permitir conversões em lote (vários valores de uma vez)

---

## 🧑‍💻 Autor

Desenvolvido por Mauro Abreu Cruz durante um desafio de aprendizado. 🚀
