package com.senac.CoffeShop.Ingredientes;

public record DadosListagemIngredientes(Long id, String nome, Long precoCusto, String fornecedor, int quantidade, Localizacao locali, UnidadeMedida unidademedida) {

    public DadosListagemIngredientes(Ingredientes ingredientes){
        this(ingredientes.getIdIngrediente(), ingredientes.getNome(), ingredientes.getPrecoCusto(),
                ingredientes.getFornercedor(), ingredientes.getQuantidade(), ingredientes.getLocali(),
                ingredientes.getUnidadeMedida());
    }
}
