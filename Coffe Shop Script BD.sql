CREATE DATABASE IF NOT EXISTS `Coffe_Shop_System` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `Coffe_Shop_System`;

CREATE TABLE Ingredientes (
    idIngrediente INT PRIMARY KEY AUTO_INCREMENT, -- Chave Primária
    nome VARCHAR(100) NOT NULL UNIQUE,
    fornecedor varchar(100),
    unidade_medida ENUM('kg', 'litro', 'unidade', 'pacote'),
	preco_custo DECIMAL(10, 2), -- Preço médio de custo por unidade de medida
);


-- 2. Tabela de ESTOQUE
CREATE TABLE Estoque (
    idEstoque INT PRIMARY KEY AUTO_INCREMENT, -- Chave Primária
    idIngrediente INT NOT NULL UNIQUE, -- Chave Estrangeira
    quantidade_atual DECIMAL(10, 3) NOT NULL DEFAULT 0,
    localizacao ENUM('Armário', 'Geladeira', 'Frizzer'), 
    FOREIGN KEY (idIngrediente) REFERENCES Ingredientes(idIngrediente)
);

-- 3. Tabela de MOVIMENTACOES
-- Registra todas as entradas (compras) e saídas (consumo, perdas) do estoque.
CREATE TABLE Movimentacoes (
    idMovimentação INT PRIMARY KEY AUTO_INCREMENT, -- Chave Primária
    idIngrediente INT NOT NULL, -- Chave Estrangeira
    tipo_movimentacao ENUM('ENTRADA', 'SAÍDA') NOT NULL, -- 'ENTRADA' ou 'SAIDA'
    quantidade DECIMAL(10, 3) NOT NULL,
    data_hora DATETIME NOT NULL,
    observacoes TEXT,
    FOREIGN KEY (IdIngrediente) REFERENCES Ingredientes(idIngrediente)
);

-- 1. Alimentando a Tabela INGREDIENTES
INSERT INTO Ingredientes (nome, unidade_medida, preco_custo, ponto_pedido) VALUES
('Café em Grãos Blend Premium', 'kg', 65.00, 10),
('Leite Integral', 'litro', 4.50, 50),
('Açúcar Refinado', 'kg', 5.80, 20),
('Xarope de Baunilha', 'litro', 45.00, 5),
('Massa de Pão de Queijo Congelada', 'unidade', 1.20, 100),
('Queijo Mussarela Fatiado', 'kg', 32.00, 8);



-- 2. Alimentando a Tabela ESTOQUE (Saldo Inicial)
INSERT INTO Estoque (idIngrediente, quantidade_atual, localizacao) VALUES
(1, 25.000, 'Armário'),      -- 25 kg de Café
(2, 60.000, 'Geladeira'),    -- 60 litros de Leite
(3, 30.000, 'Armário'),      -- 30 kg de Açúcar
(4, 8.000, 'Armário'),       -- 8 litros de Xarope de Baunilha
(5, 150.000, 'Frizzer'),     -- 150 unidades de Massa de Pão de Queijo
(6, 12.500, 'Geladeira');    -- 12.5 kg de Queijo Mussarela

-- 3. Alimentando a Tabela MOVIMENTACOES

-- Movimentações de ENTRADA (Compras)
INSERT INTO Movimentacoes (idIngrediente, tipo_movimentacao, quantidade, data_hora, observacoes) VALUES
(1, 'ENTRADA', 10.000, NOW() - INTERVAL 3 DAY , 'Recebimento do Fornecedor A - Lote 001'),
(2, 'ENTRADA', 20.000, NOW() - INTERVAL 3 DAY , 'Recebimento Leite UHT - 20 caixas'),
(5, 'ENTRADA', 50.000, NOW() - INTERVAL 2 DAY, 'Nova remessa de pão de queijo do fornecedor B');


-- Movimentações de SAÍDA (Consumo/Perda)
INSERT INTO Movimentacoes (idIngrediente, tipo_movimentacao, quantidade, data_hora, observacoes) VALUES
(1, 'SAÍDA', 1.500, NOW() - INTERVAL 1 DAY , 'Consumo do turno da manhã'),
(2, 'SAÍDA', 5.000, NOW() - INTERVAL 1 DAY, 'Consumo para lattes e cappuccinos'),
(3, 'SAÍDA', 0.500, NOW(), 'Saída por desperdício/derramamento no bar'),
(5, 'SAÍDA', 25.000, NOW(), '25 pães de queijo assados e vendidos');