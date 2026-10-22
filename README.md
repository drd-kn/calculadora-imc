# Calculadora de IMC em Java ☕
Uma aplicação de console simples e eficiente desenvolvida em Java para calcular o **Índice de Massa Corporal (IMC)** a partir do peso e da altura informados pelo usuário, exibindo a pontuação formatada e sua respectiva classificação de saúde.
---

## 📌 Funcionalidades
- **Configuração de Localidade Internacional (`Locale.US`):** Permite a digitação de números decimais com ponto (ex: `70.5` e `1.75`), evitando erros comuns de compatibilidade em sistemas em português (`InputMismatchException`).
- **Entrada Interativa:** Captura dos dados diretamente pelo terminal via `Scanner`.
- **Cálculo Automático:** Aplicação da fórmula matemática padrão do IMC.
- **Saída Formatada:** Exibição do resultado arredondado para duas casas decimais (`%.2f`).
- **Classificação por Faixas:** Identificação automática da categoria de peso conforme os padrões da OMS.
---

## 🧮 Tabela de Classificação do IMC
| Faixa de IMC | Classificação |
| :--- | :--- |
| **Menor que 18.5** | Abaixo do peso |
| **18.5 a 24.8** | Peso normal |
| **24.9 a 29.8** | Sobrepeso |
| **29.9 a 34.8** | Obesidade Grau I |
| **34.9 a 39.8** | Obesidade Grau II |
| **39.9 ou mais** | Obesidade Grau III (Mórbida) |
---

## 🛠️ Tecnologias e Conceitos Utilizados
- **Linguagem:** Java (compatível com Java 8+)
- **Bibliotecas Padrão:**
  - `java.util.Scanner`: Leitura de fluxos de entrada do usuário via console.
  - `java.util.Locale`: Padronização de separadores numéricos.
- **Conceitos de Programação:**
  - Variáveis primitivas de ponto flutuante (`float`).
  - Formatação de saída com `printf`.
  - Estrutura condicional encadeada (`if - else if - else`).
  - Gerenciamento de recursos (`scanner.close()`).
---

## 🚀 Como Executar em Outra Máquina
### Pré-requisitos
A máquina precisa ter o **JDK (Java Development Kit)** instalado. Para verificar se está instalado, abra o terminal e digite:
```bash
javac -version
java -version
```
---

### Executando pelo Terminal (Prompt de Comando, PowerShell ou Bash)
1. **Baixe ou clone o repositório:**
   ```bash
   git clone https://github.com/SEU_USUARIO/calculadora-imc-java.git
   cd calculadora-imc
   ```
2. **Compile o código-fonte:**
   ```bash
   javac Main.java
   ```
   *Isso criará o arquivo compilado `Main.class` na mesma pasta.*
3. **Execute a aplicação:**
   ```bash
   java Main
   ```
4. **Exemplo de uso no terminal:**
   ```text
   === CALCULADORA DE IMC ===
   Digite sua peso em kg (ex: 70.5): 78.5
   Digite sua altura em metros (ex: 1.75): 1.78
   -------------------------
   Seu IMC: 24.78
   Peso normal
   ```
---

### Executando por uma IDE (IntelliJ IDEA, VS Code ou Eclipse)
1. Abra a IDE de sua preferência.
2. Crie um novo projeto Java ou abra a pasta deste repositório.
3. Certifique-se de que o arquivo `Main.java` esteja dentro da pasta de fontes (`src`).
4. Clique no botão **Run** (ícone de play verde) na classe `Main`.
5. Digite os valores no console integrado da IDE.
---

## 👤 Autor
Desenvolvido por **Elias** durante os estudos práticos no Bootcamp Itaú na **[DIO](https://web.dio.me/home)**.
