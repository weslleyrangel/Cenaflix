package com.uc10e3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nomeDoEpisodio;
    private int numeroDoEpisodio;
    private String duracao;
    private String urlDoRepositorio;

    // Construtor padrão necessário para JPA
    public Podcast() {}

    public Podcast(String produtor, String nomeDoEpisodio, int numeroDoEpisodio, String duracao, String urlDoRepositorio) {
        this.produtor = produtor;
        this.nomeDoEpisodio = nomeDoEpisodio;
        this.numeroDoEpisodio = numeroDoEpisodio;
        this.duracao = duracao;
        this.urlDoRepositorio = urlDoRepositorio;
    }

    // Getters e Setters
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeDoEpisodio() {
        return nomeDoEpisodio;
    }

    public void setNomeDoEpisodio(String nomeDoEpisodio) {
        this.nomeDoEpisodio = nomeDoEpisodio;
    }

    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrlDoRepositorio() {
        return urlDoRepositorio;
    }

    public void setUrlDoRepositorio(String urlDoRepositorio) {
        this.urlDoRepositorio = urlDoRepositorio;
    }
    
}