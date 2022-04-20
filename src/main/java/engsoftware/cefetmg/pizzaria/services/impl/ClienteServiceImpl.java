package engsoftware.cefetmg.pizzaria.services.impl;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.repositories.ClienteRepository;
import engsoftware.cefetmg.pizzaria.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public Iterable<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getClienteById(String id){
        return clienteRepository.findById(Long.getLong(id));
    }
}
