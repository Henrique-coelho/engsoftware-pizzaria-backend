package engsoftware.cefetmg.pizzaria.repositories;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import engsoftware.cefetmg.pizzaria.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT * FROM cliente c JOIN usuario u on c.usuario_id = u.id WHERE u.email = 'h8mendes@gmail.com'")
    Cliente findAllUserByCredentials(@Param("email") String email, @Param("senha") String senha);
}
