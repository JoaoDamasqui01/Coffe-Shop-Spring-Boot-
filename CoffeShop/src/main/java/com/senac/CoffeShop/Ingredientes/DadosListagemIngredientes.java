package com.senac.CoffeShop.Ingredientes;

<<<<<<< HEAD
import java.math.BigDecimal;

public record DadosListagemIngredientes(Long id,
                                        String nome,
                                        String fornecedor,
                                        UnidadeMedida unidadeMedida,
                                        BigDecimal precoCusto,
                                        int pontoPedido,
                                        Long quantidade,
                                        Localizacao locali){

    public DadosListagemIngredientes(Ingredientes ingre){
        this(ingre.getIdIngrediente(), ingre.getNome(), ingre.getFornecedor(),ingre.getUnidadeMedida(), ingre.getPrecoCusto(), ingre.getPontoPedido(), ingre.getQuantidade(), ingre.getLocali());
    }


=======
public record DadosListagemIngredientes(Long id, String nome, Long precoCusto, String fornecedor, int quantidade, Localizacao locali, UnidadeMedida unidademedida) {

    public DadosListagemIngredientes(Ingredientes ingredientes){
        this(ingredientes.getIdIngrediente(), ingredientes.getNome(), ingredientes.getPrecoCusto(),
                ingredientes.getFornercedor(), ingredientes.getQuantidade(), ingredientes.getLocali(),
                ingredientes.getUnidadeMedida());
    }
>>>>>>> bcc63f9469472ed14fc94a1daf052c55bcfd6962
}
