package engsoftware.cefetmg.pizzaria.repositories;

import engsoftware.cefetmg.pizzaria.entities.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pedido, Long> {
}
