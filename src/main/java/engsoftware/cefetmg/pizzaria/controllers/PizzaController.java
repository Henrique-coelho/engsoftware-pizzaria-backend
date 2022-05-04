package engsoftware.cefetmg.pizzaria.controllers;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import engsoftware.cefetmg.pizzaria.models.dto.PedidoDTO;
import engsoftware.cefetmg.pizzaria.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/sabores")
    public List<String> getListaPizzas() {
        return pizzaService.getSabores();
    }

    @PostMapping("/pedido")
    public String realizarPedido(@RequestBody Pedido body) {
        return pizzaService.postPedido(body);
    }
}
