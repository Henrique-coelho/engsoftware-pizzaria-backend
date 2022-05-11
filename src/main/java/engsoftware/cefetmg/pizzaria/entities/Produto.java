package engsoftware.cefetmg.pizzaria.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String name;

    @JsonIgnore
    private String info;

    @JsonIgnore
    private String img;

    private Integer price;

    private Integer quantity;


}
