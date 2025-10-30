package com.senac.CoffeShop.Ingredientes;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record DadosAtualizarIngrediente(

        @NotNull(message = "O ID é obrigatório para a atualização.")
        Long id,

        @Size(min = 5, max = 100, message = "O nome deve ter entre 5 e 100 caracteres.")
        String nome, // Não precisa de @NotBlank, pois a alteração é opcional

        @Positive(message = "O preço de custo deve ser positivo.")
        BigDecimal precoCusto,

        @Size(min = 5, max = 100, message = "O fornecedor deve ter entre 5 e 100 caracteres.")
        String fornecedor,

        UnidadeMedida unidadeMedida, // Alterar unidade de medida é raro, mas possível

        @Positive(message = "A quantidade inicial não pode ser negativa.")
        BigDecimal quantidade,

        @Positive(message = "A quantidade miníma tem que ser superior a ZERO.")
        Long pontoPedido,

        Localizacao localizacao
) {




}
