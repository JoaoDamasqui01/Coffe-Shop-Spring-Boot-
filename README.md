É um projeto para aplicar nossos conhecimento para construção de API em Spring Boot, e iremos ter instrução passo a passo para conseguir rodar.


1 Passo: Execute o script para a criação e tabela do banco de dados no SGBD(Sistema de Gerenciamento de Banco de Dados) de preferência:

CREATE SCHEMA IF NOT EXISTS `coffe_shop_system`;
USE `coffe_shop_system` ;

CREATE TABLE IF NOT EXISTS `coffe_shop_system`.`ingredientes` (
  `idIngrediente` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL ,
  `fornecedor` VARCHAR(100) NULL DEFAULT NULL,
  `unidade_medida` ENUM('KG', 'LITROS', 'UNIDADE', 'PACOTE') NOT NULL,
  `preco_custo` DECIMAL(10,2) NULL DEFAULT NULL,
  `ponto_pedido` INT NULL DEFAULT NULL,
  `quantidade` DECIMAL(10,3) NOT NULL DEFAULT '0.000',
  `localizacao` ENUM('ARMÁRIO', 'GELADEIRA', 'FRIZZER') NULL DEFAULT NULL,
  ;

  2 Passo: Clonar Repositorio 
  Executar o comando do git para clonar o repositório na pasta especifica que vai conter o repositório, precisa conter a URL do projeto
  comando: "git clone https://github.com/JoaoDamasqui01/Coffe-Shop-Spring-Boot-"

3 Passo: Abrir o código na IDE de preferência

4 Passo: Abrir um novo terminal "Git Bash"
  Realizar os seguintes comandos:
      1. "git branch -r", ira trazer todas as branch(Versões existente no GitHub)
      2. "git checkout correcao", ira fazer você entra na versão de correcão, não se assuste ira trazer todos arquivos da branch.

5 Passo: Abra as seguinte estruturas de pastas que irei listas
      coffeShop
          |__src
              |__main
                  |__java
                      |__com.senac.CoffeShopp
    Dentro de "com.senac.CoffeShopp" está todas as informações do código, abra o ultimo arquivo "CoffeShopApplication" e dentro do arquivo está a chamando a aplicação para rodar. Quando tiver pronto o arquivo "application.properties" volte nela.

6 Passo: Na pasta recurces>application.properties dentro dela mude pequena configurações para permitir a conexão e suas interações com o banco de dados 

  Encaminha para o banco de dados correto localhost da sua máquina
  spring.datasource.url=jdbc:mysql://localhost:3307/coffe_shop_system

  Credencias do banco como senha e nome do user, altere se tiver log de erro de JPA
  spring.datasource.username="USER LOCAL"
  spring.datasource.password="SENHA LOCAL"

  Dependendo da ocasição de mude o numero da porta(mas é definido por padrão)
    spring.port:8080

7 Passo: faça download de algumas ferramentas de teste de API 
  Pode realizar as requisições HTTP para realizar o CRUD: Create (Criar), Read (Ler), Update (Atualizar) e Delete (Excluir) por meio
  

  

      
    
  
