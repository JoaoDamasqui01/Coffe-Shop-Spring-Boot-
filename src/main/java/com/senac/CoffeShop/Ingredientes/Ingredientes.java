package com.senac.CoffeShop.Ingredientes;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;


@Table(name = "Ingredientes")
@Entity(name = "Ingredientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ingredientes {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long idIngrediente;
   private String nome;
   private long precoCusto;
   private String fornecedor;
   private @NotNull(message = "A quantidade não pode ser nula.")
   @PositiveOrZero(message = "A quantidade inicial não pode ser negativa.")
   Long quantidade;

   @Enumerated(EnumType.STRING)
   private Localizacao localizacao;

   @Enumerated(EnumType.STRING)
   private UnidadeMedida unidadeMedida;

   private int pontoPedido;


   public Ingredientes(DadosCadastroIngrediente dados) {
      this.nome = dados.nome();
      this.fornecedor = dados.fornecedor();
      this.unidadeMedida = dados.unidadeMedida();
      this.fornecedor = dados.fornecedor();
      this.unidadeMedida = dados.unidadeMedida();
      this.localizacao = dados.localizacao();
      this.quantidade = dados.quantidade();
      //Conversar com o Professor sobre UnidadeMedida no RECORD
   }
}
