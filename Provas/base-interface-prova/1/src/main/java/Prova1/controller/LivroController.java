package Prova1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Prova1.model.LivroModel;
import Prova1.services.LivroService;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping
    public List<LivroModel> getAll() {
        return service.buscarTodosLivros();
    }

    @GetMapping("/{id}")
    public LivroModel getById(@PathVariable long id) {
        return service.buscarLivroPorId(id);
    }

    @PostMapping
    public LivroModel create(@RequestBody LivroModel livro) {
        return service.salvarLivro(livro);
    }

    @PutMapping("/{id}")
    public LivroModel update(@PathVariable long id, @RequestBody LivroModel livro) {
        livro.setId(id);
        return service.salvarLivro(livro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.excluirLivro(id);
    }
}
