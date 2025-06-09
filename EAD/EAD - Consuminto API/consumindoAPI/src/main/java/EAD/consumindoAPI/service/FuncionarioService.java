package EAD.consumindoAPI.service;

import EAD.consumindoAPI.model.Funcionario;
import EAD.consumindoAPI.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public boolean existsByEmail(String email) {
        return funcionarioRepository.existsByEmail(email);
    }
}
