package engsoftware.cefetmg.pizzaria.services;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.models.dto.UsuarioDTO;

public interface UsuarioService {

    Cliente validateLogin(UsuarioDTO usuario);

}
