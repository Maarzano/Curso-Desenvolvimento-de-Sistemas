package EAD.consumindoAPI.controller;

import EAD.consumindoAPI.model.FuncionarioPorCargo;
import EAD.consumindoAPI.service.FuncionarioPorCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios-por-cargo")
public class FuncionarioPorCargoController {

    @Autowired
    private FuncionarioPorCargoService service;

    @PostMapping
    public ResponseEntity<FuncionarioPorCargo> create(@RequestBody FuncionarioPorCargo fpc) {
        return ResponseEntity.ok(service.save(fpc));
    }

    @GetMapping
    public List<FuncionarioPorCargo> getAll(
            @RequestParam(required = false) Long cargoId,
            @RequestParam(required = false) Long funcionarioId
    ) {
        if (cargoId != null) return service.findByCargoId(cargoId);
        if (funcionarioId != null) return service.findByFuncionarioId(funcionarioId);
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioPorCargo> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioPorCargo> update(@PathVariable Long id, @RequestBody FuncionarioPorCargo fpc) {
        return service.findById(id)
                .map(existing -> {
                    fpc.setId(id);
                    return ResponseEntity.ok(service.save(fpc));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
