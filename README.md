# 🧮 Calculadora em Java com Enum e Métodos Estáticos

Este projeto é uma calculadora de linha de comando desenvolvida em Java, com foco em boas práticas de programação orientada a objetos. Ela permite que o usuário realize operações básicas como **soma, subtração, multiplicação e divisão**, utilizando **símbolos matemáticos** como entrada (`+`, `-`, `*`, `/`).

---

## 📁 Estrutura do Projeto

```bash
src/
├── Calculadora.java             # Classe principal: entrada, saída e controle do fluxo
├── Operacao.java                # Enum que representa e interpreta os operadores matemáticos
└── OperacoesMatematicas.java   # Classe com métodos estáticos para cálculos matemáticos
```
## 🚀 **Como Executar**
1. Clone o repositório:

```bash
git clone https://github.com/alexandresp15/calculadora-java-enum.git
cd calculadora-java-enum/src
```
2. **Compile os arquivos:**

```bash
javac Calculadora.java Operacao.java OperacoesMatematicas.java
```

3. **Execute o programa:**

```bash
java Calculadora
```
---

## 🧠 **Funcionalidades**
- Entrada de operador por símbolo: +, -, *, /

- Mensagens amigáveis de erro

- Tratamento de exceções (ex: divisão por zero)

- Operações com double

- Estrutura modularizada em três classes

---

## 💻 **Exemplo de Uso**
```rust
Calculadora em Java
Operações disponíveis:
SOMA -> +
SUBTRACAO -> -
MULTIPLICACAO -> *
DIVISAO -> /

Digite o operador (+, -, *, /): *
Entre com o primeiro número: 10
Entre com o segundo número: 2

Resultado: 10.00 * 2.00 = 20.00
```

---

## 📘 **Conceitos Aplicados**
- Enumerações (enum) com atributos e métodos

- Métodos estáticos (static)

- Programação defensiva com try-catch

- Separação de responsabilidades em classes distintas

- switch moderno com yield

---

## 🤝 **Contribuições**
Contribuições são bem-vindas! Abra uma Issue ou envie um Pull Request com melhorias ou sugestões.
