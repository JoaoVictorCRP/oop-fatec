package trabalhopoorestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trabalhopoorestapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
