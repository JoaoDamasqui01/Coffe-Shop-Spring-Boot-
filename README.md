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
 Delete (Excluir): http://localhost:8080/Ingredientes/4(informar um ID)





