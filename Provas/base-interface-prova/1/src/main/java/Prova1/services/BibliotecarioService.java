package Prova1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Prova1.model.BibliotecarioModel;
import Prova1.repository.BibliotecarioRepository;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository repository;


    public List<BibliotecarioModel> buscarTodosBibliotecarios(){
        return repository.findAll();
    }

    public BibliotecarioModel adicionarBibliotecario(BibliotecarioModel obj){
        return repository.save(obj);
    }

    public void excluirBibliotecario(long id){
        repository.deleteById(id);
    }

    public BibliotecarioModel trazerBibliotecarioPelId(long id){
        return repository.findById(id).get();
    }
}
