package engsoftware.cefetmg.pizzaria.services.impl;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import engsoftware.cefetmg.pizzaria.entities.Produto;
import engsoftware.cefetmg.pizzaria.models.enums.SaborBebidaEnum;
import engsoftware.cefetmg.pizzaria.models.enums.SaborPizzaEnum;
import engsoftware.cefetmg.pizzaria.models.enums.TamanhoPizzaEnum;
import engsoftware.cefetmg.pizzaria.repositories.PedidoRepository;
import engsoftware.cefetmg.pizzaria.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<String> getPizzaSabores() {
        List<String> sabores = new ArrayList<>();

        Arrays.stream(SaborPizzaEnum.values())
                .forEach(s -> sabores.add(s.nome));
        return sabores;
    }

    public List<String> getBebidaSabores() {
        List<String> sabores = new ArrayList<>();

        Arrays.stream(SaborBebidaEnum.values())
                .forEach(s -> sabores.add(s.nome));
        return sabores;
    }

    public Pedido savePedido(List<Produto> produtos) {
        var pedido = new Pedido();
        pedido.setProdutos(produtos);
        pedidoRepository.save(pedido);

        return pedido;
    }


}
