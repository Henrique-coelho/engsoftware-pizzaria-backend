package engsoftware.cefetmg.pizzaria.dao;

import engsoftware.cefetmg.pizzaria.entities.Cliente;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ClienteDAO {

    private final EntityManagerFactory emf;

    public ClienteDAO(EntityManagerFactory emf) {
       this.emf = emf;
    }

    public List<Cliente> findAllUserByCredentials(String email, String senha){
        EntityManager entityManager = emf.createEntityManager();
        Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.email=:email and c.senha=:senha");
        query.setParameter("email", email);
        query.setParameter("senha", senha);

        return query.getResultList();
    }

}
