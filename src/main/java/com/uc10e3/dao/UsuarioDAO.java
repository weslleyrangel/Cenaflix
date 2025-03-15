package com.uc10e3.dao;

import com.uc10e3.model.Usuario;
import com.uc10e3.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

/**
 * Representa um usuário do sistema CENAFLIX.
 * @author Wesll
 * @version 1.0
 * @since 2023-10-01
 */
public class UsuarioDAO {
    /**
 * Autentica um usuário no sistema.
 * @param login Login do usuário.
 * @param senha Senha do usuário.
 * @return Objeto Usuario autenticado ou null.
 */
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