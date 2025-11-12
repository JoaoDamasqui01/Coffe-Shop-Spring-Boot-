package com.senac.CoffeShop.DTO;

import com.senac.CoffeShop.Ingredientes.Localizacao;
import com.senac.CoffeShop.Ingredientes.UnidadeMedida;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
