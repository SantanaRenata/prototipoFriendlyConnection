CREATE DATABASE FriendlyConnection;
USE FriendlyConnection;

CREATE TABLE endereco (
    endereco_id INT PRIMARY KEY AUTO_INCREMENT,
    cep VARCHAR(20) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    rua VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    referencia VARCHAR(100)
);

CREATE TABLE pessoa (
    pessoa_id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(15) NOT NULL
);

CREATE TABLE evento (
    evento_id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    data DATE,
    horario TIME,
    endereco_id INT,
    FOREIGN KEY (endereco_id) REFERENCES endereco(endereco_id)
);
