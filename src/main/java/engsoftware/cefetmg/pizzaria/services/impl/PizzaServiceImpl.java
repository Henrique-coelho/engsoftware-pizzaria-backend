package engsoftware.cefetmg.pizzaria.services.impl;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import engsoftware.cefetmg.pizzaria.models.dto.PedidoDTO;
import engsoftware.cefetmg.pizzaria.models.enums.BebidaEnum;
import engsoftware.cefetmg.pizzaria.models.enums.SaborPizzaEnum;
import engsoftware.cefetmg.pizzaria.models.enums.TamanhoEnum;
import engsoftware.cefetmg.pizzaria.repositories.PedidoRepository;
import engsoftware.cefetmg.pizzaria.repositories.PizzaRepository;
import engsoftware.cefetmg.pizzaria.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<String> getSabores() {
        List<String> sabores = new ArrayList<>();

        Arrays.stream(SaborPizzaEnum.values())
                .forEach(s -> sabores.add(s.nome));
        return sabores;
    }

    public String postPedido(Pedido pedido) {
        List<Integer> valores = new ArrayList<>();
        pedido.getProdutos().stream()
                .forEach(s -> {
                if(s.getIsPizza()) {
                    valores.add(TamanhoEnum.valueOf(s.getDescricao()).valor);
                } else {
                    valores.add(BebidaEnum.valueOf(s.getNome()).valor);
                }
        });
        var total = valores.stream().mapToInt(x -> x).sum();

        //TODO salvar no banco
        //pedidoRepository.save(pedido);

        return Integer.toString(total);
    }


}
