package trabalhopoorestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trabalhopoorestapi.model.Cliente;
import trabalhopoorestapi.service.ClientService;

import java.util.List;
import java.util.Optional;


@RestController()
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    public ClientService clientService;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clientService.insert(cliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listAll(){
        return new ResponseEntity<List<Cliente>>(clientService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        if (clientService.findById(id).isPresent()){
            return new ResponseEntity<>(clientService.findById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
        }
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id, @RequestBody Cliente cliente){
        return clientService.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clientService.delete(id);
    }


}
