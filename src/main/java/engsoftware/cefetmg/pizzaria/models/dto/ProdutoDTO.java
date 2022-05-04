package engsoftware.cefetmg.pizzaria.models.dto;

import engsoftware.cefetmg.pizzaria.models.enums.ProdutoEnum;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProdutoDTO {

    private String nome;

    private String caracteristica;

    private ProdutoEnum tipo;

}
