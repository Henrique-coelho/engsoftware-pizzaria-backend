package engsoftware.cefetmg.pizzaria.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import engsoftware.cefetmg.pizzaria.enums.Bairro;
import engsoftware.cefetmg.pizzaria.enums.Cidade;

@Entity
@Getter
@Setter
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    
    private Integer rua_numero;

    @Enumerated(EnumType.ORDINAL)
    private Bairro bairro;

    @Enumerated(EnumType.ORDINAL)
    private Cidade cidade;

    private String complemento;

}

    