import com.mycompany.seumercado.Clientes;
import jakarta.persistence.*;
import java.util.List;

public class ClientesJPA {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("mercadoPU");

    public void salvar(Clientes cliente) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Clientes> listarTodos() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM Clientes c", Clientes.class).getResultList();
        } finally {
            em.close();
        }
    }
}

