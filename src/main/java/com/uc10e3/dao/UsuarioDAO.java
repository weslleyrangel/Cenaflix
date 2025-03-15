package com.uc10e3.dao;

import com.uc10e3.model.Usuario;
import com.uc10e3.util.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

public class UsuarioDAO {

    public Usuario autenticar(String login, String senha) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class)
                    .setParameter("login", login)
                    .setParameter("senha", senha)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se o usuário não for encontrado
        } finally {
            em.close();
        }
    }

    public void salvar(Usuario usuario) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}