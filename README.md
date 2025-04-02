# Singleton Patterns - Bootcamp DIO

Este repositório contém exemplos de implementação do padrão de projeto Singleton em Java. O projeto faz parte do Bootcamp da Digital Innovation One (DIO) e demonstra diferentes abordagens para implementar Singleton: Lazy, Eager e Lazy Holder.

## Tecnologias Utilizadas
- Java
- IntelliJ IDEA ou Eclipse
- Git/GitHub

## Padrões Implementados

### Singleton Lazy
Implementação "preguiçosa" do Singleton, onde a instância é criada apenas quando solicitada.
```java
public class SingletonLazy {
    private static SingletonLazy instancia;
    
    private SingletonLazy() {}
    
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
```

### Singleton Eager
A instância é criada no momento do carregamento da classe, garantindo que sempre haverá uma instância disponível.
```java
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    
    private SingletonEager() {}
    
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
```

### Singleton Lazy Holder
Utiliza uma classe interna para garantir a inicialização segura e eficiente da instância Singleton.
```java
public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder() {}
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
```

## Testando as Implementações
O projeto inclui um arquivo `Test.java` para validar o funcionamento das classes Singleton.
```java
public class Test {
    public static void main(String[] args) {
        System.out.println(SingletonLazy.getInstancia());
        System.out.println(SingletonEager.getInstancia());
        System.out.println(SingletonLazyHolder.getInstancia());
    }
}
```

## Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Abra o projeto em uma IDE de sua escolha (Eclipse, IntelliJ IDEA, VS Code, etc.).
3. Compile e execute `Test.java` para verificar a saída.

## Autor
Este projeto foi desenvolvido como parte do Bootcamp da Digital Innovation One (DIO).

