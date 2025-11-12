package com.senac.CoffeShop.Controller;

import com.senac.CoffeShop.DTO.DadosAtualizarIngrediente;
import com.senac.CoffeShop.DTO.DadosCadastroIngrediente;
import com.senac.CoffeShop.DTO.DadosListagemIngredientes;
import com.senac.CoffeShop.Ingredientes.*;

import com.senac.CoffeShop.Repository.IngredientesRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Ingredientes")
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
        List<DadosListagemIngredientes> ingredientesList = repository.findAll().stream().map(DadosListagemIngredientes:: new).toList();
        return ingredientesList;
    }


    @DeleteMapping("/{idIngrediente}")
    @Transactional
    public ResponseEntity<Void> deletar(@PathVariable Long idIngrediente){
        repository.deleteById(idIngrediente);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/{idIngrediente}")
    @Transactional
    public ResponseEntity<DadosListagemIngredientes> atualizar(
            @PathVariable Long idIngrediente, // ID para buscar quem será atualizado
            @RequestBody @Valid DadosAtualizarIngrediente dados // Dados para alteração
    ) {
        Ingredientes ingrediente = repository.getReferenceById(idIngrediente);

        ingrediente.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosListagemIngredientes(ingrediente));
    }


}
