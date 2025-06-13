package Prova1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Prova1.model.BibliotecarioModel;
import Prova1.services.BibliotecarioService;

@RestController
@RequestMapping("/api/v1/bibliotecarios")
public class BibliotecarioController {

    @Autowired
    private BibliotecarioService service;

    @GetMapping
    public List<BibliotecarioModel> getAll(){
        return service.buscarTodosBibliotecarios();
    }

    @PostMapping
    public BibliotecarioModel create(@RequestBody BibliotecarioModel obj){

        return service.adicionarBibliotecario(obj);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable long id){
        service.excluirBibliotecario(id);
    }
}
