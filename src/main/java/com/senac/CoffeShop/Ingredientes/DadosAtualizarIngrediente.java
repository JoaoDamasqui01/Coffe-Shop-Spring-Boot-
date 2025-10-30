package com.senac.CoffeShop.Ingredientes;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record DadosAtualizarIngrediente(


        String nome, // Não precisa de @NotBlank, pois a alteração é opcional

        BigDecimal precoCusto,

        String fornecedor,

        UnidadeMedida unidadeMedida, // Alterar unidade de medida é raro, mas possível

        Long quantidade,

        Long pontoPedido,

        Localizacao localizacao
) {




}
