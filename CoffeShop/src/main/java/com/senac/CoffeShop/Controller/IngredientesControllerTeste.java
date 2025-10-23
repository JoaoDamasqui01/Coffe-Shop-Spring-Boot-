package com.senac.CoffeShop.Controller;

import com.senac.CoffeShop.Ingredientes.DadosCadastroIngrediente;
import com.senac.CoffeShop.Ingredientes.DadosListagemIngredientes;
import com.senac.CoffeShop.Ingredientes.Ingredientes;
import com.senac.CoffeShop.Ingredientes.IngredientesRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class IngredientesControllerTeste {

    @Autowired
    private IngredientesRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroIngrediente dados){
        repository.save(new Ingredientes(dados));
    }

    @GetMapping
    public Page<DadosListagemIngredientes> listar(DadosListagemIngredientes dados){ // Importar do pacote spring
        return repository.findAll();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}") //parametro dinamico
    @Transactional
    public void excluir(@PathVariable Long id){ // Anotacao para receber o parametro dinamico
        repository.deleteById(id);
    }
}
