package com.senac.CoffeShop.Ingredientes;

import jakarta.validation.constraints.*;
import java.math.BigDecimal; // Importe este
// import org.springframework.format.annotation.NumberFormat; // Não é necessário para validação

public record DadosCadastroIngrediente(

        // REMOVIDO: Long id (O ID deve ser gerado no cadastro)

        @NotBlank(message = "O nome é obrigatório.")
        @Size(min = 5, max = 100, message = "O nome deve ter entre 5 e 100 caracteres.")
        String nome,

        // CORRIGIDO: Tipo para BigDecimal
        @NotNull(message = "O preço de custo é obrigatório.")
        @Positive(message = "O preço de custo deve ser positivo.")
        Long precoCusto,

        @NotBlank(message = "O fornecedor é obrigatório.")
        @Size(min = 5, max = 100, message = "O fornecedor deve ter entre 5 e 100 caracteres.")
        String fornecedor,

        // CORRIGIDO: Uso de @NotNull para Enum
        @NotNull (message = "A unidade de medida é obrigatória.")
        UnidadeMedida unidadeMedida,

        // CORRIGIDO: Removido @Positive para evitar conflito (mantendo PositiveOrZero para estoque)
        @NotNull(message = "A quantidade não pode ser nula.")
        @PositiveOrZero(message = "A quantidade inicial não pode ser negativa.")
        Long quantidade,

        @NotNull(message = "A localização não pode ser nula.")
        Localizacao locali
) {
}