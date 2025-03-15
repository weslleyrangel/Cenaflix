package com.uc10e3.controller;

import com.uc10e3.dao.PodcastDAO;
import com.uc10e3.model.Podcast;

import java.util.List;

public class PodcastController {
    private PodcastDAO podcastDAO = new PodcastDAO();

    public void cadastrarPodcast(Podcast podcast) {
        try {
            podcastDAO.salvar(podcast);
        } catch (Exception e) {
            throw new RuntimeException("Erro no controller ao cadastrar podcast: " + e.getMessage(), e);
        }
    }

    public List<Podcast> listarPodcasts() {
        try {
            return podcastDAO.listarTodos();
        } catch (Exception e) {
            throw new RuntimeException("Erro no controller ao listar podcasts: " + e.getMessage(), e);
        }
    }

    public List<Podcast> filtrarPodcastsPorProdutor(String produtor) {
        try {
            return podcastDAO.filtrarPorProdutor(produtor);
        } catch (Exception e) {
            throw new RuntimeException("Erro no controller ao filtrar podcasts: " + e.getMessage(), e);
        }
    }
}