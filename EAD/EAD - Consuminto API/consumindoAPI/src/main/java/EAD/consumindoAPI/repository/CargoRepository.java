package EAD.consumindoAPI.repository;

import EAD.consumindoAPI.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
