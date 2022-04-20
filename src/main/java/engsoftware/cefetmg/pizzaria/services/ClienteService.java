package engsoftware.cefetmg.pizzaria.services;

import engsoftware.cefetmg.pizzaria.entities.Cliente;

import java.util.Optional;

public interface ClienteService {

    Cliente saveCliente(Cliente cliente);

    Iterable<Cliente> getAllClientes();

    Optional<Cliente> getClienteById(String id);

}
