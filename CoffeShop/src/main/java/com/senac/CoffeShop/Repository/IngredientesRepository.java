package com.senac.CoffeShop.Repository;

import com.senac.CoffeShop.Ingredientes.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientesRepository  extends JpaRepository<Ingredientes, Long > {
}
