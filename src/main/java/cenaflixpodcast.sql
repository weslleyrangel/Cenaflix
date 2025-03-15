-- Cria o banco de dados
CREATE DATABASE IF NOT EXISTS cenaflixpodcast;
USE cenaflixpodcast;

-- Cria a tabela Usuario
CREATE TABLE IF NOT EXISTS Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    login VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL
);

-- Cria a tabela Podcast
CREATE TABLE IF NOT EXISTS Podcast (
    id INT AUTO_INCREMENT PRIMARY KEY,
    produtor VARCHAR(100) NOT NULL,
    nomeDoEpisodio VARCHAR(100) NOT NULL,
    numeroDoEpisodio INT NOT NULL,
    duracao VARCHAR(50) NOT NULL,
    urlDoRepositorio VARCHAR(255) NOT NULL
);

-- Insere usuários 
INSERT INTO Usuario (nome, login, senha, tipo) VALUES
('Admin', 'admin', 'admin123', 'Administrador'),
('Operador', 'operador', 'operador123', 'Operador'),
('Usuario', 'usuario', 'usuario123', 'Usuário');