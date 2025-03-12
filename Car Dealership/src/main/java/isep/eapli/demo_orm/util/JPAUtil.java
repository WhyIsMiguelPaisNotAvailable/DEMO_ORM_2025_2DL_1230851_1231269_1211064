package isep.eapli.demo_orm.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceUnitName");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

}