# Projeto Padrões de Projeto - Bootcamp DIO

Este projeto demonstra a implementação dos padrões de projeto **Singleton**, **Strategy** e **Facade** em Java. O código faz parte do Bootcamp da **Digital Innovation One (DIO)** e exemplifica o uso de padrões de design para melhorar a estrutura e manutenção do software.

## 📌 Tecnologias Utilizadas
- Java
- Padrão de projeto Singleton
- Padrão de projeto Strategy
- Padrão de projeto Facade

## 🌜 Descrição dos Padrões Implementados

### 🏩 Singleton
O padrão **Singleton** garante que uma classe tenha apenas uma única instância e fornece um ponto global de acesso a ela.

Três variações do Singleton foram implementadas:
1. **SingletonLazy**: Instância criada apenas quando solicitada (Lazy Initialization).
2. **SingletonEager**: Instância criada no momento do carregamento da classe (Eager Initialization).
3. **SingletonLazyHolder**: Usa a abordagem "Holder" para garantir inicialização segura e eficiente.

### 🕹 Strategy
O padrão **Strategy** permite selecionar dinamicamente um comportamento em tempo de execução, promovendo a flexibilidade e reutilização de código.

No projeto, um robô pode se mover de diferentes formas:
- **ComportamentoNormal**: Movimento padrão.
- **ComportamentoDefensivo**: Movimento defensivo.
- **ComportamentoAgressivo**: Movimento agressivo.

### 🔐 Facade
O padrão **Facade** simplifica a interação com subsistemas complexos, oferecendo uma interface única para acessá-los.

No projeto, a classe `Facade` abstrai a interação entre dois subsistemas:
- **CrmService**: Simula um sistema de CRM.
- **CepApi**: Simula um serviço de consulta de endereços.

A `Facade` permite migrar um cliente para um novo sistema sem expor a complexidade da interação entre esses subsistemas.

## 💂🏼‍♂️ Estrutura do Projeto
```
📆 one.digitalinnovation.gof
 ┣ 📂 singleton
 ┃ ┣ 📄 SingletonLazy.java
 ┃ ┣ 📄 SingletonEager.java
 ┃ ┗ 📄 SingletonLazyHolder.java
 ┣ 📂 strategy
 ┃ ┣ 📄 Comportamento.java
 ┃ ┣ 📄 ComportamentoNormal.java
 ┃ ┣ 📄 ComportamentoDefensivo.java
 ┃ ┣ 📄 ComportamentoAgressivo.java
 ┃ ┗ 📄 Robo.java
 ┣ 📂 facade
 ┃ ┗ 📄 Facade.java
 ┣ 📂 subsistema1.crm
 ┃ ┗ 📄 CrmService.java
 ┣ 📂 subsistema2.cep
 ┃ ┗ 📄 CepApi.java
 ┗ 📄 Test.java
```

## 🚀 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/calebewerneckcouto/PadroesSingletonBasicoJava.git
   ```
2. Abra o projeto em uma IDE como **Eclipse** ou **IntelliJ IDEA**.
3. Compile e execute a classe `Test.java`.
4. Veja os resultados no console.

## 🎯 Objetivo do Projeto
O objetivo deste projeto é reforçar o aprendizado sobre **padrões de projeto** e boas práticas no desenvolvimento Java, utilizando conceitos fundamentais como encapsulamento, polimorfismo e injeção de dependência.

---
Feito com ❤️ para o Bootcamp DIO 🚀

