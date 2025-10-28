package com.senac.CoffeShop.Controller;

import com.senac.CoffeShop.Ingredientes.DadosCadastroIngrediente;
import com.senac.CoffeShop.Ingredientes.DadosListagemIngredientes;
import com.senac.CoffeShop.Ingredientes.Ingredientes;
import com.senac.CoffeShop.Repository.IngredientesRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredientes")
public class IngredientesControllerTeste {

    @Autowired
    private  IngredientesRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroIngrediente dados){
        repository.save(new Ingredientes(dados));
    }

    @GetMapping
    @Transactional
    public List<DadosListagemIngredientes> listar(){
        List<Ingredientes> listaEntidades = repository.findAll();
        return listaEntidades.stream()
                .map(DadosListagemIngredientes::new)
                .collect(java.util.stream.Collectors.toList());

    }

}
