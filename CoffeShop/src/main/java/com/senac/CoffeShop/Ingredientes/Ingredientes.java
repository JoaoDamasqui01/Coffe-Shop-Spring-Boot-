package com.senac.CoffeShop.Ingredientes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.math.BigDecimal;

@Table(name = "Ingredientes")
@Entity(name = "Ingredientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ingredientes {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idIngrediente;
   private String nome;
   private String fornecedor;

   @Enumerated(EnumType.STRING)
   private UnidadeMedida unidadeMedida;

   private BigDecimal precoCusto;
   private int pontoPedido;

   private Long quantidade;

   @Enumerated(EnumType.STRING)
   private Localizacao locali;


   public Ingredientes(DadosCadastroIngrediente dados) {
      this.nome = dados.nome();
      this.fornecedor = dados.fornecedor();
      this.unidadeMedida = dados.unidadeMedida();
      this.precoCusto = dados.precoCusto();
      this.quantidade = dados.quantidade();
      this.locali = dados.locali();
      //Conversar com o Professor sobre UnidadeMedida no RECORD
   }
}
