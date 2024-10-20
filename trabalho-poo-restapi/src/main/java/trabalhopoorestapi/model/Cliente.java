package trabalhopoorestapi.model;

import jakarta.persistence.*;
import  lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String telefone;

}
