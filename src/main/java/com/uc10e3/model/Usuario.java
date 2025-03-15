package com.uc10e3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
/**
 * Representa um usuário do sistema CENAFLIX.
 * Armazena credenciais e permissões de acesso.
 * 
 * @author Wesll
 * @version 1.0
 * @since 2023-10-01
 */
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;

    // Construtor padrão necessário para JPA
    public Usuario() {}

    /**
     * Constrói um usuário com permissões específicas.
     * 
     * @param login Identificação única do usuário.
     * @param tipo Nível de acesso (Usuário/Administrador).
     */
    public Usuario(String nome, String login, String senha, String tipo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    // Getters e Setters
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Recupera o nível de acesso do usuário.
     * 
     * @return "Usuário" ou "Administrador".
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}