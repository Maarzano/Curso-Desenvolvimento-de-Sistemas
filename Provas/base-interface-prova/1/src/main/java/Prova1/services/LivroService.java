package Prova1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Prova1.model.LivroModel;
import Prova1.repository.LivroRepository;
import Prova1.repository.BibliotecarioRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;

    public List<LivroModel> buscarTodosLivros() {
        return livroRepository.findAll();
    }

    public LivroModel buscarLivroPorId(long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public LivroModel salvarLivro(LivroModel livro) {
        if (livro.getBibliotecarioResponsavel() != null && livro.getBibliotecarioResponsavel().getId() != null) {
            livro.setBibliotecarioResponsavel(
                bibliotecarioRepository.findById(livro.getBibliotecarioResponsavel().getId()).orElse(null)
            );
        }
        return livroRepository.save(livro);
    }

    public void excluirLivro(long id) {
        livroRepository.deleteById(id);
    }
}
