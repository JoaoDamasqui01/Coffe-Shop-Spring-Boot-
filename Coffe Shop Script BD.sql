CREATE DATABASE IF NOT EXISTS `Coffe_Shop` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `Coffe_Shop`;

-- Tabela ÚNICA: Cadastro de Ingredientes e Saldo de Estoque
CREATE TABLE Ingredientes (
    idIngrediente INT PRIMARY KEY AUTO_INCREMENT, -- Chave Primária (do antigo Ingredientes)
    
    -- Dados de Cadastro (do antigo Ingredientes)
    nome VARCHAR(100) NOT NULL UNIQUE,
    fornecedor VARCHAR(100),
    unidade_medida ENUM('kg', 'litro', 'unidade', 'pacote') NOT NULL,
    preco_custo DECIMAL(10, 2), -- Preço médio de custo por unidade de medida

    -- Dados de Estoque (do antigo Estoque)
    quantidade_atual DECIMAL(10, 3) NOT NULL DEFAULT 0,
    localizacao ENUM('Armário', 'Geladeira', 'Frizzer')
    
    -- OBS: A tabela MOVIMENTACOES foi ELIMINADA. O histórico de entradas e saídas não é registrado.
);


