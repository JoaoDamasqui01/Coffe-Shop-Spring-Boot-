package com.senac.CoffeShop.Repository;

import com.senac.CoffeShop.Ingredientes.DadosListagemIngredientes;
import com.senac.CoffeShop.Ingredientes.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientesRepository  extends JpaRepository<Ingredientes, Long > {

}
