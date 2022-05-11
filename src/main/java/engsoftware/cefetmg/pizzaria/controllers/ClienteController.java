package engsoftware.cefetmg.pizzaria.controllers;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.models.dto.LoginDTO;
import engsoftware.cefetmg.pizzaria.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @CrossOrigin
    @PostMapping("/createUpdate")
    public ResponseEntity<String> createUpdate(@RequestBody Cliente cliente){
        var retorno = clienteService.saveCliente(cliente);
        if (retorno != null) {
            return ResponseEntity.ok("Usuário criado com sucesso!");
        } else {
            return new ResponseEntity<>("Erro ao criar usuário", HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public Iterable<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable String id){
        return clienteService.getClienteById(id);
    }

    @CrossOrigin
    @PostMapping("/login")
    public List<Cliente> getCredentials(@RequestBody LoginDTO loginDTO) {
        return clienteService.validateLogin(loginDTO);
    }
}
    