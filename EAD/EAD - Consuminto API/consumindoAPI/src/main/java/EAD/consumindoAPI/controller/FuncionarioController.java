package EAD.consumindoAPI.controller;

import EAD.consumindoAPI.model.Funcionario;
import EAD.consumindoAPI.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Funcionario funcionario) {
        if (funcionarioService.existsByEmail(funcionario.getEmail())) {
            return ResponseEntity.badRequest().body("Email já cadastrado.");
        }
        return ResponseEntity.ok(funcionarioService.save(funcionario));
    }

    @GetMapping
    public List<Funcionario> getAll() {
        return funcionarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getById(@PathVariable Long id) {
        return funcionarioService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        return funcionarioService.findById(id)
                .map(f -> {
                    funcionario.setId(id);
                    return ResponseEntity.ok(funcionarioService.save(funcionario));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (!funcionarioService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        funcionarioService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
