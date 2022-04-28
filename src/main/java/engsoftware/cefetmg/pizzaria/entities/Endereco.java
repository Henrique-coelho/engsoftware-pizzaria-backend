package engsoftware.cefetmg.pizzaria.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import engsoftware.cefetmg.pizzaria.enums.Bairro;
import engsoftware.cefetmg.pizzaria.enums.Cidade;

@Entity
@Getter
@Setter
@Table(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    
    private int numero;

    private String bairro;

    private String cidade;

    private String complemento;

}

    