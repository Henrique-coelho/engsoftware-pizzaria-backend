package engsoftware.cefetmg.pizzaria.services.impl;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.entities.Usuario;
import engsoftware.cefetmg.pizzaria.models.dto.UsuarioDTO;
import engsoftware.cefetmg.pizzaria.repositories.UsuarioRepository;
import engsoftware.cefetmg.pizzaria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Cliente validateLogin(UsuarioDTO usuarioDTO) {

        return usuarioRepository.findAllUserByCredentials(usuarioDTO.getEmail(), usuarioDTO.getSenha());

    }

    private Usuario usuarioDTOToEntity(UsuarioDTO usuarioDTO){
        return Usuario.builder()
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .build();
    }

}
