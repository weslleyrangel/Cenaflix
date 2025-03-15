package com.uc10e3.controller;

import com.uc10e3.dao.PodcastDAO;
import com.uc10e3.model.Podcast;

import java.util.List;

/**
 * Controlador responsável pela lógica de negócios relacionada a podcasts.
 * Gerencia operações como cadastro, listagem e filtragem de podcasts.
 * 
 * @author Wesll
 * @version 1.1
 * @since 2023-10-01
 */
public class PodcastController {
    private PodcastDAO podcastDAO = new PodcastDAO();

    public void cadastrarPodcast(Podcast podcast) {
        try {
            podcastDAO.salvar(podcast);
        } catch (Exception e) {
            throw new RuntimeException("Erro no controller ao cadastrar podcast: " + e.getMessage(), e);
        }
    }
    /**
     * Recupera todos os podcasts cadastrados no sistema.
     * 
     * @return Lista de podcasts ordenados por data de cadastro.
     */
    public List<Podcast> listarPodcasts() {
        try {
            return podcastDAO.listarTodos();
        } catch (Exception e) {
            throw new RuntimeException("Erro no controller ao listar podcasts: " + e.getMessage(), e);
        }
    }
    
    /**
 * Filtra podcasts pelo nome do produtor.
 * @param produtor Nome do produtor para filtro (case-insensitive).
 * @return Lista de podcasts filtrados.
 */
    public List<Podcast> filtrarPodcastsPorProdutor(String produtor) {
        try {
            return podcastDAO.filtrarPorProdutor(produtor);
        } catch (Exception e) {
            throw new RuntimeException("Erro no controller ao filtrar podcasts: " + e.getMessage(), e);
        }
    }
}