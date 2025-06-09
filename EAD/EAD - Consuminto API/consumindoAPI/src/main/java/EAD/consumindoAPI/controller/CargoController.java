package EAD.consumindoAPI.controller;

import EAD.consumindoAPI.model.Cargo;
import EAD.consumindoAPI.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @PostMapping
    public ResponseEntity<Cargo> create(@RequestBody Cargo cargo) {
        return ResponseEntity.ok(cargoService.save(cargo));
    }

    @GetMapping
    public List<Cargo> getAll() {
        return cargoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> getById(@PathVariable Long id) {
        return cargoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Cargo cargo) {
        return cargoService.findById(id)
                .map(c -> {
                    cargo.setId(id);
                    return ResponseEntity.ok(cargoService.save(cargo));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (!cargoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        cargoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
