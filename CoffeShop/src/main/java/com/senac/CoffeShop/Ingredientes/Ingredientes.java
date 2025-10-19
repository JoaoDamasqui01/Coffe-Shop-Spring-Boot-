package com.senac.CoffeShop.Ingredientes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ingredientes {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idIngrediente;
   private String nome;
   private Long precoCusto;
   private String fornercedor;

   @Enumerated(EnumType.STRING)
   private UnidadeMedida unidadeMedida;

   public Ingredientes(DadosCadastroIngrediente dados) {
      this.nome = dados.nome();
      this.precoCusto = dados.precoCusto();
      this.fornercedor = dados.fornecedor();
      this.unidadeMedida = UnidadeMedida.unidadeMedida();
      //Conversar com o Professor sobre UnidadeMedida no RECORD

   }
}
