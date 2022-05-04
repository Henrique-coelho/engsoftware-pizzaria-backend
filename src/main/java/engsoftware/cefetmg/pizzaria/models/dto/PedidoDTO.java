package engsoftware.cefetmg.pizzaria.models.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PedidoDTO {

    private List<ProdutoDTO> produtos;

    private int valorTotal;
}
