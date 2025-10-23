package com.senac.CoffeShop.Ingredientes;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "Ingredientes")
@Entity (name = "Ingredientes")
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
   private String fornercedor;
   private int quantidade;

   @Enumerated(EnumType.STRING)
   private Localizacao locali;

   @Enumerated(EnumType.STRING)
   private UnidadeMedida unidadeMedida;

   public Ingredientes(DadosCadastroIngrediente dados) {
      this.nome = dados.nome();
      this.precoCusto = dados.precoCusto();
      this.fornercedor = dados.fornecedor();
      this.unidadeMedida = dados.unidadeMedida();
      this.locali = dados.localizacao();
      this.quantidade = dados.quantidade();
      //Conversar com o Professor sobre UnidadeMedida no RECORD

   }
}
