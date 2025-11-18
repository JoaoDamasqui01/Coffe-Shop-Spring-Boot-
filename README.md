Minhas sinceras desculpas\! Parece que houve um mal-entendido na entrega. Você está absolutamente correto, para que o texto seja utilizável no GitHub, **todo o conteúdo** deve estar dentro de um único bloco de código Markdown.

Vou fornecer o arquivo **inteiro** em um **único bloco de código** para que você possa copiar e colar diretamente no seu arquivo `README.md`.

````markdown
# ☕ Sistema de Gerenciamento de Estoque (API Spring Boot)

[cite_start]A API foi desenvolvida utilizando o **Spring Boot**, que acelerou a criação de endpoints robustos e eficientes para o gerenciamento de recursos, como ingredientes[cite: 2].

[cite_start]O framework forneceu a estrutura essencial para a camada de persistência (**Spring Data JPA**) e a definição de **controllers RESTful**, garantindo a organização do projeto e o cumprimento das boas práticas de desenvolvimento backend[cite: 3].

[cite_start]Todo o ciclo de desenvolvimento foi gerenciado com o **Git** [cite: 4][cite_start], permitindo a implementação de novas funcionalidades e a correção de bugs de mapeamento (como a conversão de `camelCase` para `snake_case` do Hibernate)[cite: 4]. [cite_start]O domínio de comandos Git foi fundamental para o **controle de versão**, permitindo a integração segura de código e a resolução de conflitos (`merge conflicts`) de forma colaborativa [cite: 5][cite_start], assegurando a rastreabilidade e a estabilidade da base de código finalizada[cite: 5].

---

## 🚀 Passos para Executar a API Localmente

[cite_start]Siga os passos seguintes para executar a API em sua máquina local[cite: 6].

### 1. Configuração do Banco de Dados (SGBD)

[cite_start]Execute o script para a criação do schema e tabela do banco de dados no SGBD (Sistema de Gerenciamento de Banco de Dados) de sua preferência[cite: 7]:

```sql
CREATE SCHEMA IF NOT EXISTS coffe_shop_system;
[cite_start]USE coffe_shop_system; [cite: 8]

CREATE TABLE IF NOT EXISTS coffe_shop_system.ingredientes (
    idIngrediente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    fornecedor VARCHAR(100) NULL DEFAULT NULL,
    unidade_medida ENUM('KG', 'LITROS', 'UNIDADE', 'PACOTE') NOT NULL,
    preco_custo DECIMAL(10,2) NULL DEFAULT NULL,
    ponto_pedido INT NULL DEFAULT NULL,
    quantidade DECIMAL(10,3) NOT NULL DEFAULT '0.000',
    localizacao ENUM('ARMÁRIO', 'GELADEIRA', 'FRIZZER') NULL DEFAULT NULL
[cite_start]); [cite: 9]
````

### 2\. Clonar Repositório

[cite\_start]Execute o comando do Git para clonar o repositório na pasta específica[cite: 10]:

```bash
[cite_start]git clone [https://github.com/JoaoDamasqui01/Coffe-Shop-Spring-Boot-](https://github.com/JoaoDamasqui01/Coffe-Shop-Spring-Boot-) [cite: 10]
```

### 3\. Abrir o Código e Mudar de Branch

1.  [cite\_start]Abra o código na **IDE** de sua preferência[cite: 11].
2.  [cite\_start]Abra um novo terminal (**Git Bash**) [cite: 12] e realize os seguintes comandos:
      * [cite\_start]`git branch -r`: Irá trazer todas as *branchs* (versões existentes no GitHub)[cite: 12].
      * [cite\_start]`git checkout correcao`: Irá fazer você entrar na versão de correção, que é a versão final com a API funcional[cite: 12].

### 4\. Inicialização da Aplicação

1.  [cite\_start]Abra a seguinte estrutura de pastas: `coffeShop > src > main > java > com.senac.CoffeShopp`[cite: 13].
2.  [cite\_start]Dentro de `"com.senac.CoffeShopp"`, abra o arquivo `"CoffeShopApplication"`[cite: 13].
3.  [cite\_start]Dentro do arquivo, está a chamada para rodar a aplicação[cite: 14].

### 5\. Configuração de Conexão (application.properties)

[cite\_start]Na pasta `resources > application.properties`, mude as configurações para permitir a conexão com o banco de dados[cite: 15].

| Propriedade | Descrição | Configuração (Ajuste) |
| :--- | :--- | :--- |
| `spring.datasource.url` | [cite\_start]Direciona a porta e a base de dados correta[cite: 16]. | `jdbc:mysql://localhost:3307/coffe_shop_system` |
| `spring.datasource.username` | [cite\_start]Credencial de usuário do banco[cite: 18]. | `"USER LOCAL"` |
| `spring.datasource.password` | [cite\_start]Credencial de senha do banco[cite: 18]. | `"SENHA LOCAL"` |
| `server.port` | [cite\_start]Define a porta de inicialização da aplicação[cite: 19]. | `8080` |

### 6\. Teste com Requisições (CRUD)

[cite\_start]Faça o download do **Postman** (ou similar) [cite: 20] [cite\_start]para realizar as requisições HTTP e testar o **CRUD** (Create, Read, Update, Delete)[cite: 20]:

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
    [cite_start]``` [cite: 20]

    ````

#### ⬅️ READ (Ler)

  * **Método:** `GET`
  * [cite\_start]**URL:** `http://localhost:8080/Ingredientes` [cite: 20]

#### 🔄 UPDATE (Atualizar)

  * **Método:** `PUT`
  * [cite\_start]**URL:** `http://localhost:8080/Ingredientes/19` (Informar um ID) [cite: 21]
  * **Body (JSON):**
    ````json
    {
        "nome": "Asafrão",
        "fornecedor": "Ingredientes"
    }
    [cite_start]``` [cite: 22]

    ````

#### 🗑️ DELETE (Excluir)

  * **Método:** `DELETE`
  * [cite\_start]**URL:** `http://localhost:8080/Ingredientes/4` (informar um ID) [cite: 23]

-----

🎉 Dentro desses passos é capaz de realizar todas as aplicação inteira

SISTEMA DE GERENCIAMENTO DE ESTOQUE

A API foi desenvolvida utilizando o Spring Boot, que acelerou a criação de endpoints robustos e eficientes para o gerenciamento de recursos, como ingredientes. O framework forneceu a estrutura essencial para a camada de persistência (Spring Data JPA) e a definição de controllers RESTful, garantindo a organização do projeto e o cumprimento das boas práticas de desenvolvimento backend. Todo o ciclo de desenvolvimento, desde a implementação de novas funcionalidades até a correção de bugs de mapeamento (como a conversão de camelCase para snake_case do Hibernate), foi gerenciado com o Git. O domínio de comandos Git foi fundamental para o controle de versão, permitindo a integração segura de código e a resolução de conflitos (merge conflicts) de forma colaborativa, assegurando a rastreabilidade e a estabilidade da base de código finalizada. Vamos seguir os passos seguintes para executar a API em sua maquina local.

1 Passo: Execute o script para a criação e tabela do banco de dados no SGBD(Sistema de Gerenciamento de Banco de Dados) de preferência:

CREATE SCHEMA IF NOT EXISTS coffe_shop_system; USE coffe_shop_system ;

CREATE TABLE IF NOT EXISTS coffe_shop_system.ingredientes ( idIngrediente INT NOT NULL PRIMARY KEY AUTO_INCREMENT, nome VARCHAR(100) NOT NULL , fornecedor VARCHAR(100) NULL DEFAULT NULL, unidade_medida ENUM('KG', 'LITROS', 'UNIDADE', 'PACOTE') NOT NULL, preco_custo DECIMAL(10,2) NULL DEFAULT NULL, ponto_pedido INT NULL DEFAULT NULL, quantidade DECIMAL(10,3) NOT NULL DEFAULT '0.000', localizacao ENUM('ARMÁRIO', 'GELADEIRA', 'FRIZZER') NULL DEFAULT NULL, ;

2 Passo: Clonar Repositorio Executar o comando do git para clonar o repositório na pasta especifica que vai conter o repositório, precisa conter a URL do projeto comando: "git clone https://github.com/JoaoDamasqui01/Coffe-Shop-Spring-Boot-"

3 Passo: Abrir o código na IDE de preferência

4 Passo: Abrir um novo terminal "Git Bash" Realizar os seguintes comandos: 1. "git branch -r", ira trazer todas as branch(Versões existente no GitHub) 2. "git checkout correcao", ira fazer você entra na versão de correcão(sendo a versão final com a API funcional ), não se assuste ira trazer todos arquivos da branch.

5 Passo: Abra as seguinte estruturas de pastas que irei listas coffeShop > src > main > java > com.senac.CoffeShopp Dentro de "com.senac.CoffeShopp" está toda estrutura pastas e código, abra o ultimo arquivo "CoffeShopApplication" e dentro do arquivo está a chamando a aplicação para rodar. Quando tiver pronto o arquivo "application.properties" volte nela.

6 Passo: Na pasta recurces>application.properties dentro dela mude pequena configurações para permitir a conexão com o banco de dados, vou deixar pequenas interações para funcional em sua máquina

spring.datasource.url=jdbc:mysql://localhost:3307/coffe_shop_system
É responsavel direcionar porta e a base de dados correto 

spring.datasource.username="USER LOCAL"
spring.datasource.password="SENHA LOCAL"
Credencias do banco como senha e nome do user, deve ser alterado para permição de comunicação
 
spring.port:8080
Dependendo da ocasição de mude o numero da porta, mas é definido por padrão na inicialização a aplicação

7 Passo: Faça o download de postmen
 Pode realizar as requisições HTTP para realizar o CRUD
 Create (Criar): http://localhost:8080/Ingredientes
     {
        "nome": "Café em Prem",
        "fornecedor": "Torrefação Aroma Forte",
        "unidadeMedida": "KG",
        "precoCusto": 65.00,
        "pontoPedido": 10,
        "quantidade": 25,
        "localizacao": "ARMÁRIO"
    }
 Read (Ler): http://localhost:8080/Ingredientes
 Update (Atualizar): http://localhost:8080/Ingredientes/19(Informar um ID)
 
 {
	"nome": "Asafrão",
    "fornecedor": "Ingredientes"
}

 Delete (Excluir): http://localhost:8080/Ingredientes/4(informar um ID)

8 Passo: Dentro desses passos é capaz de realizar todas as aplicação inteira.




