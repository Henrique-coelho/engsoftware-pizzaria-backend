# Grupo 4 - Trabalho 1 – Laboratório de Engenharia de Software I

Neste trabalho prático, o grupo deverá criar uma aplicação Web para realizar a
entrega de pedidos para uma pizzaria. Utilizaremos em nossa aplicação Spring Boot Java 18 para backend, React para frontend e MySQL para o banco de dados.

## Instalação

Use o seguinte comando para importar o projeto a sua maquina:

```bash
git clone https://github.com/Henrique-coelho/engsoftware-pizzaria-backend.git
```

## URL

[URL do site gerado](https://www.google.com/search?q=oi&rlz=1C1FCXM_pt-PTBR997BR997&oq=oi&aqs=chrome..69i57j46i199i291i512j0i67l2j0i512l6.368j0j7&sourceid=chrome&ie=UTF-8)


## Flowchart

```mermaid
flowchart
    A[Página inicial] --> B
    B[Fazer pedido] --> C

    C{Usuário ja possui conta?} --> |Sim| D[Autenticar]
    D --> E{Dados de acesso corretos?}

    E --> |Sim| G[Usuário logado]
    E --> |Não| C
    C --> |Não| F[Página cadastro]
    
    F --> Z
    Z[Cadastrar] --> G
    G --> H[Página pizzas/sabores]
    H --> I[Montar pedido]
    I --> J[Página endereço]

    J --> O{Endereço em BH?}
    O --> |Sim| L[Página pagamento]
    O --> |Não| J

    L --> Y{Pagamento realizado com sucesso?}

    Y --> |Sim| M[Página conclusão]
    Y --> |Não| L
```

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        +id: Int
        +email: String
        +senha: String
    }
    class Cliente {
        +name: String
        +cpf: String 
        +telefone: String
        +endereco: Endereco
    }
    class Endereco {
        +id: Int
        +bairro: Bairro
        +rua: String
        +rua_numero: Int
        +cidade: Cidade
        +complemento: String
    }
    class Cidade {
        <<enumeration>>
        BELO HORIZONTE
    }
    class Bairro {
        <<enumeration>>
        BELVEDERE
        SION
        SAVASSI
        LOURDES
        FUNCIONARIOS
        MANGABEIRAS
    }
    Endereco *-- Bairro
    Endereco *-- Cidade
    Cliente *-- Endereco
    Usuario <|-- Cliente

    class Produto {
        +id: Int
        +preco: Int
    }
    class Bebida {
        +sabor_bebida: SaborBebida
    }
    class SaborBebida {
        <<enumeration>>
        GUARANA
        COCA-COLA
        SPRITE
    }
    class Pizza {
        +sabor_pizza: SaborPizza
        +tamanho: Tamanho 
    }
    class SaborPizza {
        <<enumeration>>
        PORTUGUESA
        CALABRESA
        ITALIANA
        4 QUEIJOS
        FRANGO COM CATUPIRY
        PAO DE ALHO
        MARGUERITA
        A MODA
        CARNE SECA
        MILHO E BACON
    }
    class Tamanho {
        <<enumeration>>
        GIGANTE
        GRANDE
        MEDIA
        PEQUENA
    }
    Produto <|-- Bebida
    Bebida *-- SaborBebida
    Produto <|-- Pizza
    Pizza *-- SaborPizza
    Pizza *-- Tamanho

    

```


## Contribuição
Pull requests são bem-vindas.

