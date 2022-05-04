package engsoftware.cefetmg.pizzaria.models.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class PizzaDTO extends ProdutoDTO{

    private String sabor;

    private String tamanho;

}
