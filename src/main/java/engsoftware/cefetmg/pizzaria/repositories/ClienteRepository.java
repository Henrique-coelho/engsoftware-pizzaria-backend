package engsoftware.cefetmg.pizzaria.repositories;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
