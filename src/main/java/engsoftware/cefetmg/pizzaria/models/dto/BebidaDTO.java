package engsoftware.cefetmg.pizzaria.models.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BebidaDTO extends ProdutoDTO{

    private String sabor;

    private String tamanho;

}
