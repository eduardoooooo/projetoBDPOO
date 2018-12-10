import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EduardoBrenda");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Pessoa p = new Pessoa();
		p.setId_n(1l);
		p.setNome("Abobora");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
