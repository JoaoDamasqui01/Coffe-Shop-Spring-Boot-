package com.senac.CoffeShop.Ingredientes;

import jakarta.validation.constraints.*;
<<<<<<< HEAD
import java.math.BigDecimal; // Importe este
// import org.springframework.format.annotation.NumberFormat; // Não é necessário para validação

public record DadosCadastroIngrediente(

        @NotBlank(message = "O nome é obrigatório.")
=======
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

public record DadosCadastroIngrediente(

        @NotBlank(message = "O nome é obrigatório.") // Troque @NotNull por @NotBlank
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962
        @Size(min = 5, max = 100, message = "O nome deve ter entre 5 e 100 caracteres.")
        String nome,

        @NotNull(message = "O preço de custo é obrigatório.")
        @Positive(message = "O preço de custo deve ser positivo.")
<<<<<<< HEAD
        BigDecimal precoCusto,
=======
        @NumberFormat(pattern = "#,##0.00")
        Long precoCusto, // Atenção: Long pode ser pequeno para dinheiro, use BigDecimal ou Double/Float.
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962

        @NotBlank(message = "O fornecedor é obrigatório.")
        @Size(min = 5, max = 100, message = "O fornecedor deve ter entre 5 e 100 caracteres.")
        String fornecedor,

<<<<<<< HEAD
        @NotNull (message = "A unidade de medida é obrigatória.")
        UnidadeMedida unidadeMedida,

        @NotNull(message = "A quantidade não pode ser nula.")
        @PositiveOrZero(message = "A quantidade inicial não pode ser negativa.")
        Long quantidade,

        @NotNull(message = "A localização não pode ser nula.")
        Localizacao locali
=======
        @NotNull(message = "A unidade de medida é obrigatória.")
        UnidadeMedida unidadeMedida,

        @NotNull(message = "A quantidade não pode ser nula.")
        @PositiveOrZero(message = "O estoque não pode ser negativo.")
        int quantidade,

        @NotNull(message = "A localização não pode ser nula.")
        Localizacao localizacao
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962
) {
}