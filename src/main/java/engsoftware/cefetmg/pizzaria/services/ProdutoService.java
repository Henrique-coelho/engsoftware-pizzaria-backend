package engsoftware.cefetmg.pizzaria.services;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import engsoftware.cefetmg.pizzaria.entities.Produto;

import java.util.List;

public interface ProdutoService {

    List<String> getPizzaSabores();

    Pedido savePedido(List<Produto> produtos);
}
