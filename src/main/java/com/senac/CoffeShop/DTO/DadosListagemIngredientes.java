package com.senac.CoffeShop.DTO;

import com.senac.CoffeShop.Ingredientes.Ingredientes;
import com.senac.CoffeShop.Ingredientes.Localizacao;
import com.senac.CoffeShop.Ingredientes.UnidadeMedida;

import java.math.BigDecimal;

public record DadosListagemIngredientes(Long id, String nome, BigDecimal precoCusto, String fornecedor, Long quantidade, Localizacao localizacao, UnidadeMedida unidadeMedida, Long pontoPedido) {

    public DadosListagemIngredientes(Ingredientes ingredientes){
        this(ingredientes.getIdIngrediente(), ingredientes.getNome(),
                ingredientes.getPrecoCusto(), ingredientes.getFornecedor(), ingredientes.getQuantidade(),
                ingredientes.getLocalizacao(), ingredientes.getUnidadeMedida(), ingredientes.getPontoPedido());

    }
}
