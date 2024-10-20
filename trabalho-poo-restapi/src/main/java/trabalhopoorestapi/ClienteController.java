package trabalhopoorestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalhopoorestapi.model.Cliente;
import trabalhopoorestapi.service.ClientService;

import java.util.List;


@RestController()
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    private ResponseEntity<List<Cliente>> listAll(){
        return new ResponseEntity<List<Cliente>>(clientService.listAll(), HttpStatus.OK);
    }
}
