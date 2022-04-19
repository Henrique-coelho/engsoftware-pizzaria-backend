package engsoftware.cefetmg.pizzaria.repositories;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
