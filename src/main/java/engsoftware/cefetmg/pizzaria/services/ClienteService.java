package engsoftware.cefetmg.pizzaria.services;

import engsoftware.cefetmg.pizzaria.entities.Cliente;

import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> getClienteById(String id);

}
