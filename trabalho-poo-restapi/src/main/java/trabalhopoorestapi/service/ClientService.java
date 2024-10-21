package trabalhopoorestapi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trabalhopoorestapi.model.Cliente;
import trabalhopoorestapi.repository.ClienteRepository;

import java.sql.*;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClienteRepository clienteRepository;

    Connection conn;

    public void connect() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:h2:mem:restapi-poo","admin","p@ssw0rd");
    };

    public void disconnect() throws SQLException {
        if(this.conn != null && !this.conn.isClosed()) {
            this.conn.close();
        }
    }

    public List<Cliente> listAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id){
        return clienteRepository.findById(id);
    };

    public Cliente insert(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente update(Long id, Cliente cliente){
        if(clienteRepository.findById(id).isPresent()){
            Cliente c = clienteRepository.findById(id).get();
            c.setName(cliente.getName());
            c.setEmail(cliente.getEmail());
            c.setTelefone(cliente.getTelefone());
            return clienteRepository.save(c);
        }
        return null;
    }

    public void delete(Long id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("O cliente de ID " + id + "não existe!");
        }
    }
}
