package EAD.consumindoAPI.service;

import EAD.consumindoAPI.model.FuncionarioPorCargo;
import EAD.consumindoAPI.repository.FuncionarioPorCargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioPorCargoService {

    @Autowired
    private FuncionarioPorCargoRepository repository;

    public FuncionarioPorCargo save(FuncionarioPorCargo fpc) {
        return repository.save(fpc);
    }

    public List<FuncionarioPorCargo> findAll() {
        return repository.findAll();
    }

    public Optional<FuncionarioPorCargo> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<FuncionarioPorCargo> findByCargoId(Long cargoId) {
        return repository.findByCargoId(cargoId);
    }

    public List<FuncionarioPorCargo> findByFuncionarioId(Long funcionarioId) {
        return repository.findByFuncionarioId(funcionarioId);
    }
}
