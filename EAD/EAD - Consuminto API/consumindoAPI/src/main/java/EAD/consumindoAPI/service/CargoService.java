package EAD.consumindoAPI.service;

import EAD.consumindoAPI.model.Cargo;
import EAD.consumindoAPI.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public Cargo save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Optional<Cargo> findById(Long id) {
        return cargoRepository.findById(id);
    }

    public void deleteById(Long id) {
        cargoRepository.deleteById(id);
    }
}
