package com.uc10e3.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Gerencia a conexão com o banco de dados MySQL.
 * Implementa o padrão Singleton para garantir uma única instância de conexão.
 * 
 * @author Wesll
 * @version 1.2
 * @since 2023-10-01
 */
public class JPAUtil {

    private static final String PERSISTENCE_UNIT = "cenaflix-pu";
    private static EntityManagerFactory emf;

    private JPAUtil() {}

    private static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        return emf;
    }

    public static EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}