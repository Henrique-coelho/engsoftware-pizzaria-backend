package engsoftware.cefetmg.pizzaria.controllers;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.entities.Usuario;
import engsoftware.cefetmg.pizzaria.models.dto.UsuarioDTO;
import engsoftware.cefetmg.pizzaria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public Cliente getCredentials(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.validateLogin(usuarioDTO);
    }
}
