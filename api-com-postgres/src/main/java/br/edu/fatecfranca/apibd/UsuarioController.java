package br.edu.fatecfranca.apibd;

import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    private ResponseEntity<List<Usuario>> listarTodos() {
        return new ResponseEntity<>(usuarioService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> buscaPorId(@PathVariable Long id) {
        Optional<Usuario> query = usuarioService.findById(id);
        return query.isPresent() ?
                new ResponseEntity<>(query.get(), HttpStatus.OK)
                :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/")
    private ResponseEntity<?> buscaPorIdRequestParam(@RequestParam Long id) {
        Optional<Usuario> query = usuarioService.findById(id);
        return new ResponseEntity<>(query, HttpStatus.OK);
    }
}
