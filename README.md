# Laboratório de Engenharia de Software I - Grupo 4 - Trabalho 1 BACKEND
Neste trabalho prático, o grupo deverá criar uma aplicação Web para realizar a
entrega de pedidos para uma pizzaria. Utilizaremos em nossa aplicação Spring Boot Java 11 para backend, React para frontend e MySQL para o banco de dados.

## Startup

Primeiramente, suba o banco de dados MySQL pelo software XAMPP, sua instalação está descrita na próxima seção. Segundamente, suba o backend Java pelo Maven.
Finalmente, suba o front-end pelo comando "npm start".

## Instalação

Use o seguinte comando para importar o back-end à sua máquina:

```bash
git clone https://github.com/Henrique-coelho/engsoftware-pizzaria-backend.git
```

E o seguinte comando para importar o front-end à sua máquina:

```bash
git clone https://github.com/MyLittleFoxxie/engsoftware-pizzaria-frontend.git
```

Para instalar o banco de dados que utilizaremos, faça o download do software XAMPP. Após sua instalação inicie os módulos de Apache e MySQL, clique em "Admin" para abir o banco de dados em seu browser e crie um novo banco de dados denominado "engenhariasoftware". Agora suba sua aplicação Java que todas as tabelas necesárias serão criadas automaticamente.

O projeto não compilará caso não suba o banco de dados MySQL.

## URL

[URL do site gerado](http://localhost:3000/)


## Flowchart

```mermaid
flowchart
    A[Página inicial] --> B[Fazer pedido]
    B --> C{Usuário ja possui conta?}

    C --> |Sim| D[Autenticar]
    D --> E{Dados de acesso corretos?}

    E --> |Sim| G[Usuário logado]
    E --> |Não| C
    C --> |Não| F[Página cadastro]
    
    F --> Z[Cadastrar]
    Z --> G
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

