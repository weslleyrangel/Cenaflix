package com.uc10e3.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;  

@Entity
/**
 * Representa um podcast no sistema CENAFLIX.
 * Contém informações como identificador único, produtor, detalhes do episódio,
 * duração e URL de acesso.
 * 
 * @author Wesll
 * @version 1.1
 * @since 2023-10-01
 */
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nomeDoEpisodio;
    private int numeroDoEpisodio;
    private String duracao;
    private String urlDoRepositorio;

    public Podcast() {}

      /**
     * Constrói um objeto Podcast com todos os atributos.
     * 
     * @param produtor Nome do produtor/responsável pelo episódio.
     * @param nomeDoEpisodio Título do episódio.
     * @param numeroDoEpisodio Número sequencial na série.
     * @param duracao Duração no formato HH:MM.
     * @param urlDoRepositorio Link para acesso ao conteúdo.
     */
    public Podcast(String produtor, String nomeDoEpisodio, int numeroDoEpisodio, String duracao, String urlDoRepositorio) {
        this.produtor = produtor;
        this.nomeDoEpisodio = nomeDoEpisodio;
        this.numeroDoEpisodio = numeroDoEpisodio;
        this.duracao = duracao;
        this.urlDoRepositorio = urlDoRepositorio;
    }

    // Getters e Setters
     /**
     * Recupera o ID único do podcast no banco de dados.
     * 
     * @return ID numérico do podcast.
     */

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