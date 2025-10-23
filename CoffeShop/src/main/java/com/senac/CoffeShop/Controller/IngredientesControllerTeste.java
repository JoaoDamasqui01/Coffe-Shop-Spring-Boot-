package com.senac.CoffeShop.Controller;

import com.senac.CoffeShop.Ingredientes.DadosCadastroIngrediente;

import com.senac.CoffeShop.Ingredientes.DadosListagemIngredientes;
import com.senac.CoffeShop.Ingredientes.Ingredientes;
import com.senac.CoffeShop.Ingredientes.IngredientesRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ingredientes")
public class IngredientesControllerTeste {

    @Autowired
    private IngredientesRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroIngrediente dados){
        repository.save(new Ingredientes(dados));
    }

    @GetMapping
    public List<DadosListagemIngredientes> listar() {

      return repository.findAll() // Chama o findAll() sem argumentos, que retorna List<Ingredientes>
                .stream()
              .map(DadosListagemIngredientes::new) // Converte cada Entidade para o DTO
            .collect(Collectors.toList());      // Coleta o resultado em uma lista
    }

    //@PutMapping
    //@Transactional
    //public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
      //  var medico = repository.getReferenceById(dados.id());
        //medico.atualizarInformacoes(dados);
    //}

    //@DeleteMapping("/{id}") //parametro dinamico
    //@Transactional
    //public void excluir(@PathVariable Long id){ // Anotacao para receber o parametro dinamico
    //  repository.deleteById(id);
    //}
}
