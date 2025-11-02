# 🎬 Sistema de Ingressos de Cinema ( Herança)

Este projeto foi desenvolvido como exercício de **conceitos de herança, abstração e polimorfismo em Java**, utilizando também **recursos modernos** da linguagem, como **`sealed classes`** e **`pattern matching` no `switch`**.

O sistema simula diferentes **tipos de ingressos** comercializados em um cinema, com regras específicas de cálculo para cada tipo.

---

## 🧱 Estrutura do Projeto
DioConceitoHerençaExercicio/

├── Ingresso.java # Classe abstrata base (selada)

├── Meia.java # Classe final para meia-entrada

├── Inteira.java # Classe final para ingresso inteiro (com desconto família)

└── Main.java # Classe principal para execução do programa


---

## 🎟️ Descrição das Classes

### 🧩 `Ingresso` (classe abstrata)
- Define os atributos básicos de qualquer ingresso:
  - `valor` (padrão: R$95,00)
  - `nomeDoFilme`
  - `informacao` (ex: "Dublado", "Legendado")
- É uma **classe selada (`sealed`)**, permitindo herança apenas das classes `Meia` e `Inteira`.

### 🎫 `Meia`
- Representa ingressos com **meia entrada**.
- O valor real é **metade do valor base**.
- Possui um **código identificador** (`codIngressoMeia`).

### 👨‍👩‍👧‍👦 `Inteira`
- Representa ingressos inteiros e ingressos **familiares**.
- O preço total é calculado com base na **quantidade de pessoas**.
- Aplica **desconto de 5%** quando há **3 ou mais pessoas**.
- Possui um **código identificador** (`codIngressoInt`).

---


### 🧩 `Saída esperada no console:`

`======= Meia =======`

- Código: 4

- Filme: La Casa de Papel

- Valor da meia entrada: R$ 47.5

- Informação: Dublado

`======= Inteira =======`
- Código: 7

- Filme: Fênix

- Valor total: R$ 361.0

- Informação: Dublado às 19h ou Legendado às 20:45

--- 



### 💡 Cálculo do ingresso família:

**Valor base: R$ 95,00**

**4 pessoas → 95 × 4 = 380**

**Desconto de 5% → 380 − 19 = R$ 361,00**

---

### 🧠 Conceitos Envolvidos Herança (extends)

Classes abstratas e seladas (sealed, permits)

- Polimorfismo

- Encapsulamento

- Pattern Matching no switch (Java 17+)

- Sobrescrita de métodos

- Boas práticas com getters e construtores

---

### ✨ Autor

**Deryck22**
- 📚 Estudante de Desenvolvimento Java
- 💡 Projeto criado como exercício de Herança e Polimorfismo na linguagem Java.
