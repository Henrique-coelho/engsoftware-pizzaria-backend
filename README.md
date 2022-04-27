# Laboratório de Engenharia de Software I - Grupo 4 - Trabalho 1 BACKEND
Neste trabalho prático, o grupo deverá criar uma aplicação Web para realizar a
entrega de pedidos para uma pizzaria. Utilizaremos em nossa aplicação Spring Boot Java 11 para backend, React para frontend e MySQL para o banco de dados.

## Instalação

Use o seguinte comando para importar o backend à sua máquina:

```bash
git clone https://github.com/Henrique-coelho/engsoftware-pizzaria-backend.git
```

E o seguinte comando para importar o frontend à sua máquina:

```bash
git clone https://github.com/MyLittleFoxxie/engsoftware-pizzaria-frontend.git
```

Lembre de realizar a instalação do JDK 11 e node.js em sua máquina!

Para instalar o banco de dados MySQL que utilizaremos, siga os seguintes passos:
1. Baixe e instale o software [XAMPP](https://www.apachefriends.org/download.html).
2. Inicie os módulos de Apache e MySQL.
3. Clique em "Admin" para abir o banco de dados em seu navegador.
3. Ao lado esquerdo da página do navegador, crie um novo banco de dados denominado "engenhariasoftware".
4. Pronto!

O projeto não compilará caso não suba o banco de dados MySQL.

## Startup

1. Suba o banco de dados MySQL pelo software XAMPP. 
2. Suba o backend Java pelo Maven.
3. Suba o frontend pelo comando "npm start".


## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        +id: Long
        +email: String
        +senha: String
    }
    class Cliente {
        +id: Long
        +nome: String
        +cpf: String 
        +telefone: String
        +endereco_id: int
        +usuario_id: int
    }
    class Endereco {
        +id: Long
        +rua: String
        +rua_numero: Long
		+bairro: Bairro
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
        +id: Long
        +preco: Long
    }
    class Bebida {
        +sabor_bebida: SaborBebida
        +produto_id: int
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
        +produto_id: int
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


## Contribuição
Pull requests são bem-vindas.

