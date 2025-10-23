CREATE DATABASE IF NOT EXISTS `Coffe_Shop_System` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `Coffe_Shop_System`;


-- Tabela ÚNICA: Cadastro de Ingredientes e Saldo de Estoque
CREATE TABLE EstoqueIngredientes (
    idIngrediente INT PRIMARY KEY AUTO_INCREMENT, -- Chave Primária (do antigo Ingredientes)

    -- Dados de Cadastro (do antigo Ingredientes)
    nome VARCHAR(100) NOT NULL UNIQUE,
    fornecedor VARCHAR(100),
    unidade_medida ENUM('kg', 'litro', 'unidade', 'pacote') NOT NULL,
    preco_custo DECIMAL(10, 2), -- Preço médio de custo por unidade de medida
    ponto_pedido INT, -- (Adicionado, pois é crucial para a gestão)

    -- Dados de Estoque (do antigo Estoque)
    quantidade_atual DECIMAL(10, 3) NOT NULL DEFAULT 0,
    localizacao ENUM('Armário', 'Geladeira', 'Frizzer')

    -- OBS: A tabela MOVIMENTACOES foi ELIMINADA. O histórico de entradas e saídas não é registrado.
);


-- Alimentando a Tabela ÚNICA (com os dados de cadastro e saldo iniciais)
INSERT INTO EstoqueIngredientes (nome, fornecedor, unidade_medida, preco_custo, ponto_pedido, quantidade_atual, localizacao) VALUES
-- Dados de Ingredientes (com fornecedores adicionados no último passo) + Dados de Estoque Inicial
('Café em Grãos Blend Premium', 'Torrefação Aroma Forte', 'kg', 65.00, 10, 25.000, 'Armário'),
('Leite Integral', 'Laticínios Pura Vida', 'litro', 4.50, 50, 60.000, 'Geladeira'),
('Açúcar Refinado', 'Distribuidora Doce Lar', 'kg', 5.80, 20, 30.000, 'Armário'),
('Xarope de Baunilha', 'Xaropes Premium Brasil', 'litro', 45.00, 5, 8.000, 'Armário'),
('Massa de Pão de Queijo Congelada', 'Pães de Minas Congelados', 'unidade', 1.20, 100, 150.000, 'Frizzer'),
('Queijo Mussarela Fatiado', 'Frios Nobres Ltda', 'kg', 32.00, 8, 12.500, 'Geladeira');