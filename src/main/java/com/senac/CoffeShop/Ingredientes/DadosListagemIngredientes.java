package com.senac.CoffeShop.Ingredientes;

import java.math.BigDecimal;

public record DadosListagemIngredientes(Long id, String nome, BigDecimal precoCusto, String fornecedor, long quantidade, Localizacao localizacao, UnidadeMedida unidadeMedida, Long pontoPedido) {

    public DadosListagemIngredientes(Ingredientes ingredientes){
        this(ingredientes.getIdIngrediente(), ingredientes.getNome(), ingredientes.getFornecedor(),
                ingredientes.getPrecoCusto(), ingredientes.getFornecedor(), ingredientes.getQuantidade(),
                ingredientes.getLocalizacao(), ingredientes.getUnidadeMedida(), ingredientes.getPontoPedido());

    }
}
