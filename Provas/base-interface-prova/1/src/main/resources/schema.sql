CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

-- Tabela de bibliotecários
CREATE TABLE IF NOT EXISTS bibliotecarios (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Tabela de livros
CREATE TABLE IF NOT EXISTS livros (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    bibliotecario_id BIGINT,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    genero ENUM('ROMANCE', 'TECNICO', 'FANTASIA', 'TERROR', 'SUSPENSE') NOT NULL,
    status ENUM('DISPONIVEL', 'EMPRESTADO', 'RESERVADO') NOT NULL DEFAULT 'DISPONIVEL',
    data_cadastro DATE NOT NULL,
    CONSTRAINT fk_livro_bibliotecario FOREIGN KEY (bibliotecario_id) REFERENCES bibliotecarios(id)
);
