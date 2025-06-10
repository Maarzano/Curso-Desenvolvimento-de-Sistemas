package EAD.consumindoAPI.repository;

import EAD.consumindoAPI.model.FuncionarioPorCargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioPorCargoRepository extends JpaRepository<FuncionarioPorCargo, Long> {
    List<FuncionarioPorCargo> findByCargoId(Long cargoId);
    List<FuncionarioPorCargo> findByFuncionarioId(Long funcionarioId);
}
