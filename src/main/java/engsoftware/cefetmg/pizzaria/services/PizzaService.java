package engsoftware.cefetmg.pizzaria.services;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import engsoftware.cefetmg.pizzaria.models.dto.PedidoDTO;

import java.util.List;

public interface PizzaService {

    List<String> getSabores();

    String postPedido(Pedido pedido);
}
