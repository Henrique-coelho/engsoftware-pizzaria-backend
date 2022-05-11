package engsoftware.cefetmg.pizzaria.controllers;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import engsoftware.cefetmg.pizzaria.entities.Produto;
import engsoftware.cefetmg.pizzaria.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/pizzaList")
    public List<String> getListaPizzas() {
        return produtoService.getPizzaSabores();
    }

    @PostMapping("/realizarPedido")
    public Pedido savePedido(@RequestBody List<Produto> body) {
        return produtoService.savePedido(body);
    }
}
