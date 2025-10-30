package com.senac.CoffeShop.Controller;

import com.senac.CoffeShop.Ingredientes.DadosAtualizarIngrediente;
import com.senac.CoffeShop.Ingredientes.DadosCadastroIngrediente;

import com.senac.CoffeShop.Ingredientes.DadosListagemIngredientes;
import com.senac.CoffeShop.Ingredientes.Ingredientes;
import com.senac.CoffeShop.Repository.IngredientesRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Ingredientes")
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


    @DeleteMapping("/{idIngrediente}")
    @Transactional
    public ResponseEntity<Void> deletar(@PathVariable Long idIngrediente){
        repository.deleteById(idIngrediente);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{idIngrediente}")
    @Transactional
    public ResponseEntity<Ingredientes> atualizar(
            // O nome do parâmetro (@PathVariable) deve corresponder ao nome na URL ({idIngrediente})
            @PathVariable Long idIngrediente,
            @RequestBody @Valid DadosAtualizarIngrediente dados
    ) {
        // 1. Busca o ingrediente pelo ID. Retorna um Optional.
        return repository.findById(idIngrediente)
                .map(ingrediente -> {
                    // 2. Se o ingrediente for encontrado:
                    ingrediente.atualizarInformacoes(dados);
                    // 3. Retorna 200 OK com o objeto atualizado no corpo.
                    return ResponseEntity.ok(ingrediente);
                })
                .orElseGet(() ->
                        // 4. Se o ingrediente NÃO for encontrado: Retorna 404 Not Found.
                        ResponseEntity.notFound().build()
                );
    }



    //@DeleteMapping("/{id}") //parametro dinamico
    //@Transactional
    //public void excluir(@PathVariable Long id){ // Anotacao para receber o parametro dinamico
    //  repository.deleteById(id);
    //}
}
