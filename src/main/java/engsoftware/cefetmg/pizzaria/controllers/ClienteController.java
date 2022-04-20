package engsoftware.cefetmg.pizzaria.controllers;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public String add(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
        return "New Student is added successfully";
    }

    @GetMapping("/getAll")
    public Iterable<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable String id){
        return clienteService.getClienteById(id);
    }
}
