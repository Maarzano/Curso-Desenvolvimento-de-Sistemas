CREATE DATABASE BancoInter;

GO

USE BancoInter;

GO

CREATE TABLE Clientes (
    ID_Cliente INT IDENTITY(1,1) PRIMARY KEY,
    Nome NVARCHAR(100) NOT NULL,
    CPF CHAR(11) UNIQUE NOT NULL,
    Data_Nascimento DATE NOT NULL,
    Endereco NVARCHAR(200) NOT NULL
);

GO

CREATE TABLE Contas (
    ID_Conta INT IDENTITY(1,1) PRIMARY KEY,
    ID_Cliente INT NOT NULL,
    Numero_Conta CHAR(10) UNIQUE NOT NULL,
    Tipo_Conta NVARCHAR(50) NOT NULL,
    Saldo DECIMAL(18,2) DEFAULT 0 NOT NULL,
    CONSTRAINT FK_Contas_Clientes FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);

GO

CREATE TABLE Transacoes (
    ID_Transacao INT IDENTITY(1,1) PRIMARY KEY,
    ID_Conta INT NOT NULL,
    Data_Hora DATETIME NOT NULL,
    Tipo_Transacao NVARCHAR(50) NOT NULL,
    Valor DECIMAL(18,2) NOT NULL,
    CONSTRAINT FK_Transacoes_Contas FOREIGN KEY (ID_Conta) REFERENCES Contas(ID_Conta)
);

GO

CREATE TABLE Contatos (
    ID_Contato INT IDENTITY(1,1) PRIMARY KEY,
    ID_Cliente INT NOT NULL,
    Tipo_Contato NVARCHAR(50) NOT NULL,
    Valor_Contato NVARCHAR(100) NOT NULL,
    CONSTRAINT FK_Contatos_Clientes FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);

GO

CREATE TABLE Atendimentos (
    ID_Atendimento INT IDENTITY(1,1) PRIMARY KEY,
    ID_Cliente INT NOT NULL,
    Data_Hora DATETIME NOT NULL,
    Descricao NVARCHAR(MAX) NOT NULL,
    Atendente NVARCHAR(100) NOT NULL,
    CONSTRAINT FK_Atendimentos_Clientes FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);

GO

SELECT *
FROM Clientes;

GO

SELECT *
FROM Contas;

GO

SELECT *
FROM Contatos;

GO

SELECT *
FROM Transacoes;

GO

SELECT *
FROM Atendimentos;

GO

INSERT INTO Clientes (Nome, CPF, Data_Nascimento, Endereco)
VALUES 
('João Silva', '12345678901', '1990-01-15', 'Rua das Flores, 123'),
('Maria Oliveira', '23456789012', '1985-03-10', 'Av. Paulista, 456'),
('Pedro Santos', '34567890123', '1995-07-20', 'Rua dos Pinheiros, 789'),
('Ana Costa', '45678901234', '1998-12-25', 'Rua do Sol, 101'),
('Lucas Ferreira', '56789012345', '2000-10-01', 'Rua da Lua, 202'),
('Beatriz Lima', '67890123456', '1992-04-18', 'Rua das Palmeiras, 303'),
('Gabriel Rocha', '78901234567', '1994-06-11', 'Rua das Orquídeas, 404'),
('Laura Almeida', '89012345678', '1988-08-30', 'Rua das Hortênsias, 505'),
('Rafael Mendes', '90123456789', '1997-09-05', 'Rua dos Cravos, 606'),
('Carla Ribeiro', '01234567890', '1993-11-15', 'Av. Brasil, 707'),
('Fernanda Souza', '10987654321', '1989-02-28', 'Av. Central, 808'),
('Thiago Martins', '21098765432', '1991-05-23', 'Rua das Magnólias, 909'),
('Juliana Cunha', '32109876543', '1986-12-10', 'Rua do Bosque, 111'),
('Ricardo Silva', '43210987654', '1999-08-14', 'Rua das Acácias, 222'),
('Camila Barbosa', '54321098765', '1987-09-19', 'Rua da Esperança, 333');

go

INSERT INTO Contas (ID_Cliente, Numero_Conta, Tipo_Conta, Saldo)
VALUES 
(1, '0001234567', 'Corrente', 1500.50),
(2, '0002345678', 'Poupança', 2500.75),
(3, '0003456789', 'Corrente', 3200.00),
(4, '0004567890', 'Corrente', 1200.00),
(5, '0005678901', 'Poupança', 1800.25),
(6, '0006789012', 'Corrente', 5000.00),
(7, '0007890123', 'Corrente', 2200.40),
(8, '0008901234', 'Poupança', 300.50),
(9, '0009012345', 'Corrente', 1000.00),
(10, '0010123456', 'Poupança', 4500.00),
(11, '0011234567', 'Corrente', 2750.90),
(12, '0012345678', 'Poupança', 1900.75),
(13, '0013456789', 'Corrente', 800.00),
(14, '0014567890', 'Corrente', 6200.00),
(15, '0015678901', 'Poupança', 3500.25);

go

INSERT INTO Transacoes (ID_Conta, Data_Hora, Tipo_Transacao, Valor)
VALUES 
(1, '2025-01-01T09:00:00', 'Depósito', 1000.00),
(2, '2025-01-02T10:15:00', 'Saque', 500.00),
(3, '2025-01-03T14:30:00', 'Transferência', 300.00),
(4, '2025-01-04T16:45:00', 'Depósito', 700.00),
(5, '2025-01-05T08:20:00', 'Saque', 200.00),
(6, '2025-01-06T13:10:00', 'Transferência', 800.00),
(7, '2025-01-07T15:00:00', 'Depósito', 1200.00),
(8, '2025-01-08T11:00:00', 'Saque', 400.00),
(9, '2025-01-09T17:30:00', 'Transferência', 500.00),
(10, '2025-01-10T12:15:00', 'Depósito', 300.00),
(11, '2025-01-11T09:45:00', 'Saque', 600.00),
(12, '2025-01-12T14:00:00', 'Transferência', 900.00),
(13, '2025-01-13T10:30:00', 'Depósito', 1500.00),
(14, '2025-01-14T16:00:00', 'Saque', 100.00),
(15, '2025-01-15T18:15:00', 'Transferência', 250.00);

go

INSERT INTO Contatos (ID_Cliente, Tipo_Contato, Valor_Contato)
VALUES 
(1, 'Telefone', '11999999999'),
(2, 'Email', 'maria@gmail.com'),
(3, 'Telefone', '11988888888'),
(4, 'Email', 'ana@gmail.com'),
(5, 'Telefone', '11977777777'),
(6, 'Email', 'beatriz@gmail.com'),
(7, 'Telefone', '11966666666'),
(8, 'Email', 'laura@gmail.com'),
(9, 'Telefone', '11955555555'),
(10, 'Email', 'carla@gmail.com'),
(11, 'Telefone', '11944444444'),
(12, 'Email', 'thiago@gmail.com'),
(13, 'Telefone', '11933333333'),
(14, 'Email', 'ricardo@gmail.com'),
(15, 'Telefone', '11922222222');

go

INSERT INTO Atendimentos (ID_Cliente, Data_Hora, Descricao, Atendente)
VALUES 
(1, '2025-01-01T10:00:00', 'Consulta sobre saldo', 'Atendente A'),
(2, '2025-01-02T11:30:00', 'Abertura de conta', 'Atendente B'),
(3, '2025-01-03T15:45:00', 'Atualização de cadastro', 'Atendente C'),
(4, '2025-01-04T09:00:00', 'Solicitação de extrato', 'Atendente D'),
(5, '2025-01-05T13:15:00', 'Emissão de cartão', 'Atendente E'),
(6, '2025-01-06T14:20:00', 'Consulta de taxas', 'Atendente F'),
(7, '2025-01-07T16:10:00', 'Encerramento de conta', 'Atendente G'),
(8, '2025-01-08T17:25:00', 'Bloqueio de cartão', 'Atendente H'),
(9, '2025-01-09T10:40:00', 'Reativação de conta', 'Atendente I'),
(10, '2025-01-10T12:30:00', 'Alteração de limite', 'Atendente J'),
(11, '2025-01-11T14:50:00', 'Dúvidas sobre investimento', 'Atendente K'),
(12, '2025-01-12T11:15:00', 'Emissão de boleto', 'Atendente L'),
(13, '2025-01-13T09:20:00', 'Troca de senha', 'Atendente M'),
(14, '2025-01-14T15:10:00', 'Consulta de saldo', 'Atendente N'),
(15, '2025-01-15T18:40:00', 'Abertura de conta conjunta', 'Atendente O');

GO

SELECT *
FROM Clientes;

GO

SELECT *
FROM Contas;

GO

SELECT *
FROM Contatos;

GO

SELECT *
FROM Transacoes;

GO

SELECT *
FROM Atendimentos;

