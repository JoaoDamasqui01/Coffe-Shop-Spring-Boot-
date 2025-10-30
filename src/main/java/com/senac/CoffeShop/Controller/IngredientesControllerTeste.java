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

    @PutMapping("/{id_Ingrediente}") // CHAVE NA URL: {id}
    @Transactional
    public ResponseEntity<Ingredientes> atualizar(
            // Variável no método: id
            @PathVariable Long id,
            @RequestBody @Valid DadosAtualizarIngrediente dados
    ) {
        // Busca a entidade pelo ID.
        // Se encontrar (.map), atualiza e retorna 200 OK.
        // Se não encontrar (.orElseGet), retorna 404 Not Found.
        return repository.findById(id)
                .map(ingrediente -> {
                    ingrediente.atualizarInformacoes(dados); // Use o nome correto do seu método!
                    return ResponseEntity.ok(ingrediente);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }






    //@DeleteMapping("/{id}") //parametro dinamico
    //@Transactional
    //public void excluir(@PathVariable Long id){ // Anotacao para receber o parametro dinamico
    //  repository.deleteById(id);
    //}
}
