package com.uc10e3.dao;

import com.uc10e3.model.Podcast;
import com.uc10e3.util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.List;

public class PodcastDAO {

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