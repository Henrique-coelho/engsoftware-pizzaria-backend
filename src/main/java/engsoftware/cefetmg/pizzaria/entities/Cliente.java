package engsoftware.cefetmg.pizzaria.entities;

import engsoftware.cefetmg.pizzaria.entities.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;
    
    private String telefone;

    private String email;

    private String senha;

    @OneToOne
    private Endereco endereco;

}
