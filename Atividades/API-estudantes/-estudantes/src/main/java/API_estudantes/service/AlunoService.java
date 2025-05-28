package API_estudantes.service;

import API_estudantes.model.Aluno;
import API_estudantes.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Aluno cadastrar(Aluno aluno) {
        return repository.save(aluno);
    }

    public Optional<Aluno> atualizar(Long id, Aluno aluno) {
        return repository.findById(id)
                .map(a -> {
                    a.setNome(aluno.getNome());
                    a.setEmail(aluno.getEmail());
                    return repository.save(a);
                });
    }

    public boolean deletar(Long id) {
        return repository.findById(id)
                .map(a -> {
                    repository.delete(a);
                    return true;
                }).orElse(false);
    }
}
