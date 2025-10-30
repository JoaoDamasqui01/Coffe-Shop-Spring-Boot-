package com.senac.CoffeShop.Ingredientes;


import jakarta.persistence.*;
import jakarta.validation.Valid;
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
   @Column(name = "id_Ingrediente")
   private long idIngrediente;
   private String nome;

   @Column(name = "preco_custo")
   private BigDecimal precoCusto;

   private String fornecedor;
   private Long quantidade;

   @Enumerated(EnumType.STRING)
   private Localizacao localizacao;

   @Enumerated(EnumType.STRING)
   @Column(name = "unidade_medida")
   private UnidadeMedida unidadeMedida;

    @Column(name = "ponto_Pedido")
   private Long pontoPedido;


   public Ingredientes(DadosCadastroIngrediente dados) {
      this.nome = dados.nome();
      this.precoCusto = dados.precoCusto();
      this.fornecedor = dados.fornecedor();
      this.unidadeMedida = dados.unidadeMedida();
      this.localizacao = dados.localizacao();
      this.quantidade = dados.quantidade();
      this.pontoPedido = dados.pontoPedido();
      //Conversar com o Professor sobre UnidadeMedida no RECORD
   }

   public void atualizarInformacoes(@Valid DadosAtualizarIngrediente dados) {

      if (dados.nome() != null && !dados.nome().trim().isEmpty()) {
         this.nome = dados.nome();
      }

      // 2. Preço de Custo (verificar se é positivo)
      if (dados.precoCusto() != null && dados.precoCusto().compareTo(BigDecimal.ZERO) >= 0) {
         // REGRA 2: Não permitir preço de custo negativo
         this.precoCusto = dados.precoCusto();
      }

      // 3. Fornecedor
      if (dados.fornecedor() != null && !dados.fornecedor().trim().isEmpty()) {
         // CORRIGIR DIGITAÇÃO: Mantenha o campo 'fornecedor' correto!
         this.fornecedor = dados.fornecedor();
      }

      // 4. Ponto de Pedido (garantir que é um valor válido, ex: positivo)
      if (dados.pontoPedido() != null && dados.pontoPedido() > 0) {
         this.pontoPedido = dados.pontoPedido();
      }

      // 5. ENUMS (UnidadeMedida e Localizacao)
      // Se forem fornecidos, substitui. Se for null, mantém o valor antigo.
      if (dados.unidadeMedida() != null) {
         this.unidadeMedida = dados.unidadeMedida();
      }

      if (dados.localizacao() != null) {
         this.localizacao = dados.localizacao();
      }
   }
}
