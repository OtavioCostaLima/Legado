package br.com.ti4b.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Otavio Costa
 */
public class ConexaoUtil {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FazendaPU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static EntityManager getEntityManager() {

        return entityManagerFactory.createEntityManager();
    }

}
