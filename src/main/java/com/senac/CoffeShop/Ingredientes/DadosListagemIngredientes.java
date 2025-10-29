package com.senac.CoffeShop.Ingredientes;

import java.math.BigDecimal;

public record DadosListagemIngredientes(Long id,
                                        String nome,
                                        String fornecedor,
                                        UnidadeMedida unidadeMedida,
                                        BigDecimal precoCusto,
                                        int pontoPedido,
                                        Long quantidade,
                                        Localizacao locali){
}
