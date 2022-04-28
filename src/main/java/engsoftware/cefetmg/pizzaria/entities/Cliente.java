package engsoftware.cefetmg.pizzaria.entities;

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

    @OneToOne
    private Endereco endereco;

    @OneToOne
    private Usuario usuario;
}
