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

  

  
