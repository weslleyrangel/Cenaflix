package com.uc10e3.dao;

import com.uc10e3.model.Podcast;
import com.uc10e3.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

/**
 * Camada de acesso a dados para operações relacionadas a podcasts.
 * Realiza operações CRUD no banco de dados.
 * 
 * @author Wesll
 * @version 1.1
 * @since 2023-10-01
 */
public class PodcastDAO {
     /**
     * Salva um podcast no banco de dados.
     * 
     * @param podcast Objeto a ser persistido.
     */
    public void salvar(Podcast podcast) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        em.getTransaction().begin();
        em.persist(podcast);
        em.getTransaction().commit();
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        throw new RuntimeException("Erro ao salvar podcast: " + e.getMessage(), e);
    } finally {
        em.close();
    }
}
  /**
     * Busca todos os podcasts cadastrados.
     * 
     * @return Lista completa de podcasts ordenados por ID.
     * @throws SQLException Se a consulta falhar.
     */
public List<Podcast> listarTodos() {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        return em.createQuery("SELECT p FROM Podcast p", Podcast.class).getResultList();
    } catch (Exception e) {
        throw new RuntimeException("Erro ao listar podcasts: " + e.getMessage(), e);
    } finally {
        em.close();
    }
}

public List<Podcast> filtrarPorProdutor(String produtor) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        return em.createQuery("SELECT p FROM Podcast p WHERE p.produtor LIKE :produtor", Podcast.class)
                .setParameter("produtor", "%" + produtor + "%")
                .getResultList();
    } catch (Exception e) {
        throw new RuntimeException("Erro ao filtrar podcasts por produtor: " + e.getMessage(), e);
    } finally {
        em.close();
    }
}
}