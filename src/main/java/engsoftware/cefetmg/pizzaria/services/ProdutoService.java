package engsoftware.cefetmg.pizzaria.services;

import engsoftware.cefetmg.pizzaria.entities.Pedido;

import java.util.List;

public interface ProdutoService {

    List<String> getPizzaSabores();

    Pedido savePedido(Pedido pedido);
}
