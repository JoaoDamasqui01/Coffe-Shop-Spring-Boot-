# ☕ Sistema de Gerenciamento de Estoque (API Spring Boot)

A API foi desenvolvida utilizando o **Spring Boot**, que acelerou a criação de endpoints robustos e eficientes para o gerenciamento de recursos, como ingredientes. O framework forneceu a estrutura essencial para a camada de persistência (**Spring Data JPA**) e a definição de **controllers RESTful**, garantindo a organização do projeto e o cumprimento das boas práticas de desenvolvimento backend. Todo o ciclo de desenvolvimento foi gerenciado com o **Git**, permitindo a implementação de novas funcionalidades e a correção de bugs de mapeamento (como a conversão de `camelCase` para `snake_case` do Hibernate). O domínio de comandos Git foi fundamental para o **controle de versão**, permitindo a integração segura de código e a resolução de conflitos (`merge conflicts`) de forma colaborativa, assegurando a rastreabilidade e a estabilidade da base de código finalizada.


## 🚀 Passos para Executar a API Localmente

Siga os passos seguintes para executar a API em sua máquina local.

### 1. Configuração do Banco de Dados (SGBD)

Execute o script para a criação do schema e tabela do banco de dados no SGBD (Sistema de Gerenciamento de Banco de Dados) de sua preferência:

```sql
CREATE SCHEMA IF NOT EXISTS coffe_shop_system;
USE coffe_shop_system; 

CREATE TABLE IF NOT EXISTS coffe_shop_system.ingredientes (
    idIngrediente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    fornecedor VARCHAR(100) NULL DEFAULT NULL,
    unidade_medida ENUM('KG', 'LITROS', 'UNIDADE', 'PACOTE') NOT NULL,
    preco_custo DECIMAL(10,2) NULL DEFAULT NULL,
    ponto_pedido INT NULL DEFAULT NULL,
    quantidade DECIMAL(10,3) NOT NULL DEFAULT '0.000',
    localizacao ENUM('ARMÁRIO', 'GELADEIRA', 'FRIZZER') NULL DEFAULT NULL
);
````

### 2. Clonar Repositório

Execute o comando do Git para clonar o repositório na pasta específica:

```bash
git clone [https://github.com/JoaoDamasqui01/Coffe-Shop-Spring-Boot-] (https://github.com/JoaoDamasqui01/Coffe-Shop-Spring-Boot-) 
```

### 3. Abrir o Código e Mudar de Branch

1.  Abra o código na **IDE** de sua preferência.
2.  Abra um novo terminal (**Git Bash**)  e realize os seguintes comandos:
      * `git branch -r`: Irá trazer todas as *branchs* (versões existentes no GitHub).
      * `git checkout correcao`: Irá fazer você entrar na versão de correção, que é a versão final com a API funcional.

### 4. Inicialização da Aplicação

1.  Abra a seguinte estrutura de pastas: `coffeShop > src > main > java > com.senac.CoffeShopp`.
2.  Dentro de `"com.senac.CoffeShopp"`, abra o arquivo `"CoffeShopApplication"`.
3.  Dentro do arquivo, está a chamada para rodar a aplicação.

### 5. Configuração de Conexão (application.properties)

Na pasta `resources > application.properties`, mude as configurações para permitir a conexão com o banco de dados.

| Propriedade | Descrição | Configuração (Ajuste) |
| :--- | :--- | :--- |
| `spring.datasource.url` | Direciona a porta e a base de dados correta. | `jdbc:mysql://localhost:3307/coffe_shop_system` |
| `spring.datasource.username` | Credencial de usuário do banco. | `"USER LOCAL"` |
| `spring.datasource.password` | Credencial de senha do banco. | `"SENHA LOCAL"` |
| `server.port` | Define a porta de inicialização da aplicação. | `8080` |

### 6. Teste com Requisições (CRUD)

Faça o download do **Postman** (ou similar) para realizar as requisições HTTP e testar o **CRUD** (Create, Read, Update, Delete):

#### ➡️ CREATE (Criar)

  * **Método:** `POST`
  * **URL:** `http://localhost:8080/Ingredientes`
  * **Body (JSON):**
    ````json
    {
        "nome": "Café em Prem",
        "fornecedor": "Torrefação Aroma Forte",
        "unidadeMedida": "KG",
        "precoCusto": 65.00,
        "pontoPedido": 10,
        "quantidade": 25,
        "localizacao": "ARMÁRIO"
    }
    ``` 

    ````

#### ⬅️ READ (Ler)

  * **Método:** `GET`
  * **URL:** `http://localhost:8080/Ingredientes`

#### 🔄 UPDATE (Atualizar)

  * **Método:** `PUT`
  * **URL:** `http://localhost:8080/Ingredientes/19` (Informar um ID)
  * **Body (JSON):**
    ````json
    {
        "nome": "Asafrão",
        "fornecedor": "Ingredientes"
    }``` 

    ````

#### 🗑️ DELETE (Excluir)

  * **Método:** `DELETE`
  * **URL:** `http://localhost:8080/Ingredientes/4` (informar um ID) 

-----

🎉 Dentro desses passos é capaz de realizar todas as aplicação inteira






