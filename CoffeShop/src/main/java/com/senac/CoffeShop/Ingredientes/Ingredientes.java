package com.senac.CoffeShop.Ingredientes;


import jakarta.persistence.*;
import lombok.*;

<<<<<<< HEAD
import javax.naming.Name;
import java.math.BigDecimal;

@Table(name = "Ingredientes")
@Entity(name = "Ingredientes")
=======
@Table(name = "Ingredientes")
@Entity (name = "Ingredientes")
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ingredientes {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long idIngrediente;
   private String nome;
<<<<<<< HEAD
   private String fornecedor;
=======
   private long precoCusto;
   private String fornercedor;
   private int quantidade;

   @Enumerated(EnumType.STRING)
   private Localizacao locali;
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962

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
<<<<<<< HEAD
      this.quantidade = dados.quantidade();
      this.locali = dados.locali();
=======
      this.fornercedor = dados.fornecedor();
      this.unidadeMedida = dados.unidadeMedida();
      this.locali = dados.localizacao();
      this.quantidade = dados.quantidade();
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962
      //Conversar com o Professor sobre UnidadeMedida no RECORD
   }
}
