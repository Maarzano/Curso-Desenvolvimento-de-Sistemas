GO

CREATE DATABASE DB_BancoInter;

GO

USE DB_BancoInter;

GO

--TABELAS COM INFORMA��ES GERAIS SOBRE CLIENTES

CREATE TABLE CLIENTES (
    CLIENTE_ID INT IDENTITY(1,1) PRIMARY KEY,
    NOME VARCHAR (50) NOT NULL,
    CPF CHAR (11) NOT NULL UNIQUE,
    TELEFONE VARCHAR (15),
    EMAIL VARCHAR (50)
);

GO

INSERT INTO CLIENTES (NOME, CPF, TELEFONE, EMAIL) VALUES
('Carlos Silva', '12345678901', '9988776655', 'carlos.silva@email.com'),
('Ana Oliveira', '23456789012', '9977665544', 'ana.oliveira@email.com'),
('Maria Santos', '34567890123', '9966554433', 'maria.santos@email.com'),
('Jo�o Souza', '45678901234', '9955443322', 'joao.souza@email.com'),
('Paula Pereira', '56789012345', '9944332211', 'paula.pereira@email.com'),
('Fernando Costa', '67890123456', '9933221100', 'fernando.costa@email.com'),
('Rita Almeida', '78901234567', '9922110099', 'rita.almeida@email.com'),
('Lucas Martins', '89012345678', '9911009988', 'lucas.martins@email.com'),
('Juliana Lima', '90123456789', '9900998877', 'juliana.lima@email.com'),
('Roberto Souza', '01234567890', '9899887766', 'roberto.souza@email.com'),
('Tatiane Rodrigues', '13579246801', '9888776655', 'tatiane.rodrigues@email.com'),
('Ricardo Barbosa', '24681357902', '9877665544', 'ricardo.barbosa@email.com'),
('Felipe Oliveira', '35792468013', '9866554433', 'felipe.oliveira@email.com'),
('Larissa Costa', '46813579124', '9855443322', 'larissa.costa@email.com'),
('Bruno Martins', '57924680235', '9844332211', 'bruno.martins@email.com');

GO

CREATE TABLE CONTAS(
    CONTA_ID INT IDENTITY(1,1) PRIMARY KEY,
    CLIENTE_ID INT NOT NULL,
    TIPO_CONTA VARCHAR (10),
    SALDO DECIMAL (15,2) DEFAULT 0.00,
    AGENCIA INT,
    CONSTRAINT FK_CLIENTES_CONTAS FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID)
);

GO

INSERT INTO CONTAS (CLIENTE_ID, TIPO_CONTA, SALDO, AGENCIA) VALUES
(1, 'Corrente', 1000.00, 1234),
(2, 'Poupan�a', 1500.50, 1234),
(3, 'Corrente', 2000.00, 2345),
(4, 'Poupan�a', 2500.75, 2345),
(5, 'Corrente', 3000.00, 3456),
(6, 'Poupan�a', 3500.25, 3456),
(7, 'Corrente', 4000.00, 4567),
(8, 'Poupan�a', 4500.50, 4567),
(9, 'Corrente', 5000.00, 5678),
(10, 'Poupan�a', 5500.75, 5678),
(11, 'Corrente', 6000.00, 6789),
(12, 'Poupan�a', 6500.25, 6789),
(13, 'Corrente', 7000.00, 7890),
(14, 'Poupan�a', 7500.50, 7890),
(15, 'Corrente', 8000.00, 8901);

GO

--�REA DE RELACIONAMENTO DO CLIENTE DO BANCO INTER

CREATE TABLE CONTATOS (
    CONTATO_ID INT IDENTITY(1,1) PRIMARY KEY,
    CLIENTE_ID INT NOT NULL,
    TIPO_CONTATO VARCHAR(50) NOT NULL,
    VALOR_CONTATO VARCHAR(100) NOT NULL,
    CONSTRAINT FK_CONTATOS_CLIENTES FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID)
);

GO

INSERT INTO CONTATOS (CLIENTE_ID, TIPO_CONTATO, VALOR_CONTATO) VALUES
(1, 'Celular', '9988776655'),
(2, 'Celular', '9977665544'),
(3, 'Email', 'maria.santos@email.com'),
(4, 'Telefone', '9955443322'),
(5, 'Celular', '9944332211'),
(6, 'Email', 'fernando.costa@email.com'),
(7, 'Telefone', '9922110099'),
(8, 'Celular', '9911009988'),
(9, 'Email', 'juliana.lima@email.com'),
(10, 'Telefone', '9899887766'),
(11, 'Email', 'tatiane.rodrigues@email.com'),
(12, 'Celular', '9877665544'),
(13, 'Telefone', '9866554433'),
(14, 'Email', 'larissa.costa@email.com'),
(15, 'Celular', '9844332211');

GO


CREATE TABLE ATENDENTE (
    ATENDENTE_ID INT IDENTITY(1,1) PRIMARY KEY,
    NOME_ATENDENTE VARCHAR(100) NOT NULL,
    EMAIL_ATENDENTE VARCHAR(100) NOT NULL,
    TELEFONE_ATENDENTE VARCHAR(20),
    DATA_ADMISSAO DATE NOT NULL
);

GO

INSERT INTO ATENDENTE (NOME_ATENDENTE, EMAIL_ATENDENTE, TELEFONE_ATENDENTE, DATA_ADMISSAO) VALUES
('Carlos Alves', 'carlos.alves@email.com', '9988776655', '2022-05-01'),
('Ana Pereira', 'ana.pereira@email.com', '9977665544', '2022-06-02'),
('Luciana Oliveira', 'luciana.oliveira@email.com', '9966554433', '2021-03-15'),
('Pedro Gomes', 'pedro.gomes@email.com', '9955443322', '2021-07-20'),
('Marcelo Souza', 'marcelo.souza@email.com', '9944332211', '2020-09-01'),
('Fernanda Lima', 'fernanda.lima@email.com', '9933221100', '2021-10-18'),
('Thiago Costa', 'thiago.costa@email.com', '9922110099', '2022-04-05'),
('Roberto Silva', 'roberto.silva@email.com', '9911009988', '2020-01-01'),
('Juliana Almeida', 'juliana.almeida@email.com', '9900998877', '2022-11-12'),
('Felipe Santos', 'felipe.santos@email.com', '9899887766', '2021-02-25'),
('Lucas Barbosa', 'lucas.barbosa@email.com', '9888776655', '2022-08-10'),
('Tatiane Rocha', 'tatiane.rocha@email.com', '9877665544', '2021-09-30'),
('Paula Costa', 'paula.costa@email.com', '9866554433', '2020-05-10'),
('Carlos Silva', 'carlos.silva@email.com', '9855443322', '2022-03-08'),
('Bruna Martins', 'bruna.martins@email.com', '9844332211', '2021-06-22');

GO

CREATE TABLE ATENDIMENTOS (
    ATENDIMENTO_ID INT IDENTITY(1,1) PRIMARY KEY,
    CLIENTE_ID INT NOT NULL,
    DATA_HORA DATETIME NOT NULL,
    DESCRICAO_ATENDIMENTOS VARCHAR(500) NOT NULL,
    ATENDENTE_ID INT NOT NULL,
    CONSTRAINT FK_ATENDIMENTOS_CLIENTE FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID),
	CONSTRAINT FK_ATENDIMENTOS_ATENDENTE FOREIGN KEY (ATENDENTE_ID) REFERENCES ATENDENTE(ATENDENTE_ID)
);

GO

INSERT INTO ATENDIMENTOS (CLIENTE_ID, DATA_HORA, DESCRICAO_ATENDIMENTOS, ATENDENTE_ID) VALUES
(1, '2025-01-01T10:00:00', 'Consulta sobre saldo', 1),
(2, '2025-01-02T11:00:00', 'Consulta sobre empr�stimo', 2),
(3, '2025-01-03T12:00:00', 'Problema com conta corrente', 3),
(4, '2025-01-04T13:00:00', 'Solicita��o de cart�o', 4),
(5, '2025-01-05T14:00:00', 'D�vida sobre investimentos', 5),
(6, '2025-01-06T15:00:00', 'Altera��o de dados cadastrais', 6),
(7, '2025-01-07T16:00:00', 'Consulta sobre taxas', 7),
(8, '2025-01-08T17:00:00', 'Bloqueio de cart�o', 8),
(9, '2025-01-09T18:00:00', 'Esclarecimento sobre tarifas', 9),
(10, '2025-01-10T19:00:00', 'Cancelamento de conta', 10),
(11, '2025-01-11T20:00:00', 'Ajuste de limite de cart�o', 11),
(12, '2025-01-12T21:00:00', 'Problema t�cnico no app', 12),
(13, '2025-01-13T22:00:00', 'Recarga de celular', 13),
(14, '2025-01-14T23:00:00', 'Consulta sobre saldo', 14),
(15, '2025-01-15T23:30:00', 'Solicita��o de transfer�ncia', 15);

GO

CREATE TABLE FEEDBACK (
    FEEDBACK_ID INT IDENTITY(1,1) PRIMARY KEY,
    CLIENTE_ID INT NOT NULL,
    ATENDIMENTO_ID INT NOT NULL,
    NOTA INT CHECK (NOTA BETWEEN 1 AND 5),
    COMENTARIO VARCHAR(500),
    DATA_FEEDBACK DATETIME NOT NULL,
    CONSTRAINT FK_FEEDBACK_CLIENTES FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID),
    CONSTRAINT FK_FEEDBACK_ATENDIMENTOS FOREIGN KEY (ATENDIMENTO_ID) REFERENCES ATENDIMENTOS(ATENDIMENTO_ID)
);

GO

INSERT INTO FEEDBACK (CLIENTE_ID, ATENDIMENTO_ID, NOTA, COMENTARIO, DATA_FEEDBACK) VALUES
(1, 1, 5, 'Atendimento excelente!', '2025-01-01T10:30:00'),
(2, 2, 4, 'Atendente muito atencioso', '2025-01-02T11:30:00'),
(3, 3, 3, 'O problema demorou para ser resolvido', '2025-01-03T12:30:00'),
(4, 4, 5, 'Resolu��o r�pida e eficiente', '2025-01-04T13:30:00'),
(5, 5, 4, 'Atendente bem preparado, mas faltou mais clareza', '2025-01-05T14:30:00'),
(6, 6, 5, 'Amei a solu��o apresentada', '2025-01-06T15:30:00'),
(7, 7, 3, 'Resposta lenta, mas resolveu no final', '2025-01-07T16:30:00'),
(8, 8, 5, 'Muito satisfeito com o atendimento', '2025-01-08T17:30:00'),
(9, 9, 4, 'Boa explica��o, mas poderia ser mais r�pido', '2025-01-09T18:30:00'),
(10, 10, 2, 'Infelizmente o problema n�o foi resolvido', '2025-01-10T19:30:00'),
(11, 11, 4, 'Atendente bom, mas faltou mais paci�ncia', '2025-01-11T20:30:00'),
(12, 12, 5, 'Atendimento �timo, estou satisfeito', '2025-01-12T21:30:00'),
(13, 13, 5, 'Problema resolvido rapidamente, excelente!', '2025-01-13T22:30:00'),
(14, 14, 3, 'Precisava de mais informa��es', '2025-01-14T23:30:00'),
(15, 15, 4, 'Bom atendimento, mas pode melhorar', '2025-01-15T23:45:00');

GO

CREATE TABLE ALERTA_SUSPENSAO (
    ALERTASUSPENSAO_ID INT IDENTITY(1,1) PRIMARY KEY,
    CLIENTE_ID INT NOT NULL,
    TIPO VARCHAR(50) NOT NULL,
    DESCRICAO_ALERTA_SUSPENSAO VARCHAR(500) NOT NULL,
    DATA_REGISTRO DATE NOT NULL,
    SITUACAO VARCHAR(20) NOT NULL,
    MOTIVO VARCHAR(300),
    CONSTRAINT FK_ALERTASUSPENSAO_CLIENTES FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID)
);

GO

INSERT INTO ALERTA_SUSPENSAO (CLIENTE_ID, TIPO, DESCRICAO_ALERTA_SUSPENSAO, DATA_REGISTRO, SITUACAO, MOTIVO) VALUES
(1, 'Suspens�o tempor�ria', 'Cliente com conta bloqueada por motivo de fraude.', '2025-01-01', 'Ativo', 'Fraude detectada no sistema'),
(2, 'Suspens�o permanente', 'Cliente teve sua conta encerrada devido � inadimpl�ncia.', '2025-01-02', 'Ativo', 'Inadimpl�ncia superior a 90 dias'),
(3, 'Suspens�o tempor�ria', 'Conta suspensa por irregularidades na documenta��o.', '2025-01-03', 'Inativo', 'Documenta��o inconsistente'),
(4, 'Suspens�o permanente', 'Bloqueio permanente de conta por problemas de seguran�a.', '2025-01-04', 'Ativo', 'Problemas de seguran�a com login'),
(5, 'Suspens�o tempor�ria', 'Bloqueio tempor�rio de conta devido a transa��es suspeitas.', '2025-01-05', 'Inativo', 'Transa��es n�o autorizadas detectadas'),
(6, 'Suspens�o permanente', 'Conta do cliente foi suspensa ap�s viola��o dos termos.', '2025-01-06', 'Ativo', 'Viola��o dos termos de uso'),
(7, 'Suspens�o tempor�ria', 'Cliente teve acesso suspenso por tentativa de fraude.', '2025-01-07', 'Ativo', 'Tentativa de fraude registrada'),
(8, 'Suspens�o permanente', 'Conta encerrada por repetidas tentativas de fraude.', '2025-01-08', 'Inativo', 'Tentativas de fraude em m�ltiplas ocasi�es'),
(9, 'Suspens�o tempor�ria', 'Suspens�o tempor�ria para revis�o de transa��es.', '2025-01-09', 'Ativo', 'Revis�o de transa��es banc�rias'),
(10, 'Suspens�o permanente', 'Suspens�o de conta por n�o conformidade com as pol�ticas do banco.', '2025-01-10', 'Ativo', 'N�o conformidade com as pol�ticas'),
(11, 'Suspens�o tempor�ria', 'Cliente suspenso por erro de sistema.', '2025-01-11', 'Inativo', 'Erro no sistema banc�rio'),
(12, 'Suspens�o permanente', 'Conta permanentemente bloqueada devido a relat�rio de fraude.', '2025-01-12', 'Ativo', 'Fraude detectada'),
(13, 'Suspens�o tempor�ria', 'Conta suspensa para investiga��o de transa��es fraudulentas.', '2025-01-13', 'Ativo', 'Investiga��o em andamento'),
(14, 'Suspens�o permanente', 'Conta encerrada devido a problemas com identidade do cliente.', '2025-01-14', 'Ativo', 'Problemas de identidade'),
(15, 'Suspens�o tempor�ria', 'Suspens�o tempor�ria por falha no sistema de seguran�a.', '2025-01-15', 'Ativo', 'Falha no sistema de seguran�a');

GO

--�REA DE OPERA��ES FINANCEIRAS DO BANCO INTER

CREATE TABLE TRANSACOES (
    TRANSACAO_ID INT IDENTITY(1,1) PRIMARY KEY,
    CONTA_ID INT NOT NULL,
    TIPO_TRANSACAO VARCHAR (15),
    VALOR DECIMAL (15,2) NOT NULL,
    DATA_TRANSACAO DATE,
    CONSTRAINT FK_CONTAS_TRANSACOES FOREIGN KEY (CONTA_ID) REFERENCES CONTAS(CONTA_ID)
);

GO

INSERT INTO TRANSACOES (CONTA_ID, TIPO_TRANSACAO, VALOR, DATA_TRANSACAO) VALUES
(1, 'Dep�sito', 1000.00, '2025-01-01'),
(2, 'Saque', 500.00, '2025-01-02'),
(3, 'Transfer�ncia', 300.00, '2025-01-03'),
(4, 'Dep�sito', 1500.00, '2025-01-04'),
(5, 'Saque', 700.00, '2025-01-05'),
(6, 'Transfer�ncia', 1200.00, '2025-01-06'),
(7, 'Dep�sito', 2000.00, '2025-01-07'),
(8, 'Saque', 150.00, '2025-01-08'),
(9, 'Transfer�ncia', 1800.00, '2025-01-09'),
(10, 'Dep�sito', 2500.00, '2025-01-10'),
(11, 'Saque', 800.00, '2025-01-11'),
(12, 'Transfer�ncia', 600.00, '2025-01-12'),
(13, 'Dep�sito', 950.00, '2025-01-13'),
(14, 'Saque', 400.00, '2025-01-14'),
(15, 'Transfer�ncia', 1500.00, '2025-01-15');

GO

CREATE TABLE EMPRESTIMO(
    EMPRESTIMO_ID INT IDENTITY (1,1) PRIMARY KEY,
    CLIENTE_ID INT NOT NULL,
    VALOR_EMPRESTIMO DECIMAL (15,2) NOT NULL,
    JUROS DECIMAL (5,2) NOT NULL,
    PARCELAS INT,
    DATA_EMPRESTIMO DATE,
    SITUACAO VARCHAR (15),
    CONSTRAINT FK_CLIENTES_EMPRESTIMO FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID)
);

GO

INSERT INTO EMPRESTIMO (CLIENTE_ID, VALOR_EMPRESTIMO, JUROS, PARCELAS, DATA_EMPRESTIMO, SITUACAO) VALUES
(1, 5000.00, 5.00, 12, '2025-01-01', 'Aprovado'),
(2, 10000.00, 7.50, 24, '2025-01-02', 'Aprovado'),
(3, 3000.00, 6.00, 18, '2025-01-03', 'Aprovado'),
(4, 4000.00, 5.50, 10, '2025-01-04', 'Aprovado'),
(5, 1500.00, 4.00, 6, '2025-01-05', 'Aprovado'),
(6, 7000.00, 6.50, 24, '2025-01-06', 'Aprovado'),
(7, 8500.00, 5.75, 12, '2025-01-07', 'Aprovado'),
(8, 9500.00, 7.00, 18, '2025-01-08', 'Aprovado'),
(9, 12000.00, 8.00, 24, '2025-01-09', 'Aprovado'),
(10, 6000.00, 6.25, 18, '2025-01-10', 'Aprovado'),
(11, 4500.00, 5.00, 12, '2025-01-11', 'Aprovado'),
(12, 8000.00, 7.25, 24, '2025-01-12', 'Aprovado'),
(13, 5500.00, 6.75, 18, '2025-01-13', 'Aprovado'),
(14, 9500.00, 6.50, 12, '2025-01-14', 'Aprovado'),
(15, 10500.00, 7.00, 24, '2025-01-15', 'Aprovado');

GO

CREATE TABLE CARTOES(
    CARTAO_ID INT IDENTITY (1,1) PRIMARY KEY,
    CLIENTE_ID INT,
    TIPO_CARTAO VARCHAR (10),
    LIMITE DECIMAL (15,2),
    NUMERO_CARTAO CHAR (16),
    DATA_VENCIMENTO DATE NOT NULL,
    CONSTRAINT FK_CARTOES_CLIENTES FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID)
);

GO

INSERT INTO CARTOES (CLIENTE_ID, TIPO_CARTAO, LIMITE, NUMERO_CARTAO, DATA_VENCIMENTO) VALUES
(1, 'Cr�dito', 2000.00, '1234123412341234', '2025-02-01'),
(2, 'D�bito', 1500.00, '2345234523452345', '2025-02-02'),
(3, 'Cr�dito', 2500.00, '3456345634563456', '2025-02-03'),
(4, 'D�bito', 3000.00, '4567456745674567', '2025-02-04'),
(5, 'Cr�dito', 3500.00, '5678567856785678', '2025-02-05'),
(6, 'D�bito', 4000.00, '6789678967896789', '2025-02-06'),
(7, 'Cr�dito', 4500.00, '7890789078907890', '2025-02-07'),
(8, 'D�bito', 5000.00, '8901890189018901', '2025-02-08'),
(9, 'Cr�dito', 5500.00, '9012901290129012', '2025-02-09'),
(10, 'D�bito', 6000.00, '0123012301230123', '2025-02-10'),
(11, 'Cr�dito', 6500.00, '1234123412341234', '2025-02-11'),
(12, 'D�bito', 7000.00, '2345234523452345', '2025-02-12'),
(13, 'Cr�dito', 7500.00, '3456345634563456', '2025-02-13'),
(14, 'D�bito', 8000.00, '4567456745674567', '2025-02-14'),
(15, 'Cr�dito', 8500.00, '5678567856785678', '2025-02-15');

GO

CREATE TABLE INVESTIMENTOS(
    INVESTIMENTO_ID INT PRIMARY KEY IDENTITY(1,1),
    CLIENTE_ID INT,
    TIPO_INVESTIMENTO VARCHAR(50),
    VALOR_INVESTIDO DECIMAL(18, 2),
    DATA_INVESTIMENTO DATE,
    TAXA_RENDIMENTO DECIMAL(5, 2),
    DATA_VENCIMENTO DATE,
    RENTABILIDADE_ANUAL DECIMAL(5, 2),
    CONSTRAINT FK_CLIENTES_INVESTIMENTOS FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTES(CLIENTE_ID)
);

GO

INSERT INTO INVESTIMENTOS (CLIENTE_ID, TIPO_INVESTIMENTO, VALOR_INVESTIDO, DATA_INVESTIMENTO, TAXA_RENDIMENTO, DATA_VENCIMENTO, RENTABILIDADE_ANUAL) VALUES
(1, 'CDB', 5000.00, '2025-01-01', 6.50, '2026-01-01', 7.00),
(2, 'Poupan�a', 2000.00, '2025-01-02', 2.00, '2026-01-02', 3.00),
(3, 'Fundo de Investimento', 3000.00, '2025-01-03', 7.50, '2026-01-03', 8.00),
(4, 'Tesouro Direto', 4000.00, '2025-01-04', 5.00, '2026-01-04', 6.00),
(5, 'CDB', 2500.00, '2025-01-05', 6.00, '2026-01-05', 6.50),
(6, 'A��es', 7000.00, '2025-01-06', 8.00, '2026-01-06', 9.00),
(7, 'Poupan�a', 1500.00, '2025-01-07', 2.50, '2026-01-07', 3.50),
(8, 'Fundo de Investimento', 5000.00, '2025-01-08', 7.00, '2026-01-08', 7.50),
(9, 'Tesouro Direto', 6000.00, '2025-01-09', 5.50, '2026-01-09', 6.50),
(10, 'CDB', 8000.00, '2025-01-10', 6.25, '2026-01-10', 6.75),
(11, 'A��es', 10000.00, '2025-01-11', 9.00, '2026-01-11', 10.00),
(12, 'Poupan�a', 2000.00, '2025-01-12', 3.00, '2026-01-12', 3.50),
(13, 'Fundo de Investimento', 4000.00, '2025-01-13', 7.00, '2026-01-13', 7.50),
(14, 'Tesouro Direto', 3500.00, '2025-01-14', 5.75, '2026-01-14', 6.25),
(15, 'CDB', 6000.00, '2025-01-15', 6.25, '2026-01-15', 6.75);

GO

CREATE TABLE FATURAS(
    FATURA_ID INT IDENTITY (1,1) PRIMARY KEY,
    CARTAO_ID INT,
    DATA_INICIO DATE,
    VENCIMENTO_FATURA DATE,
    VALOR_FATURA DECIMAL (18,2),
    JUROS_FATURA DECIMAL (5,2),
    CONSTRAINT FK_CARTOES_FATURAS FOREIGN KEY (CARTAO_ID) REFERENCES CARTOES(CARTAO_ID)
);

GO

INSERT INTO FATURAS (CARTAO_ID, DATA_INICIO, VENCIMENTO_FATURA, VALOR_FATURA, JUROS_FATURA) VALUES
(1, '2025-01-01', '2025-01-30', 1200.00, 5.00),
(2, '2025-01-02', '2025-02-02', 800.00, 3.50),
(3, '2025-01-03', '2025-02-03', 1500.00, 4.00),
(4, '2025-01-04', '2025-02-04', 2200.00, 3.75),
(5, '2025-01-05', '2025-02-05', 1100.00, 4.25),
(6, '2025-01-06', '2025-02-06', 1700.00, 4.00),
(7, '2025-01-07', '2025-02-07', 1900.00, 5.50),
(8, '2025-01-08', '2025-02-08', 2500.00, 4.50),
(9, '2025-01-09', '2025-02-09', 2100.00, 5.00),
(10, '2025-01-10', '2025-02-10', 3200.00, 6.00),
(11, '2025-01-11', '2025-02-11', 3500.00, 3.75),
(12, '2025-01-12', '2025-02-12', 1800.00, 4.25),
(13, '2025-01-13', '2025-02-13', 2600.00, 5.00),
(14, '2025-01-14', '2025-02-14', 2200.00, 3.50),
(15, '2025-01-15', '2025-02-15', 2400.00, 4.00);

GO

--�REA DE RECURSOS HUMANOS DO BANCO INTER

GO

CREATE TABLE SETORES (
    SETOR_ID INT IDENTITY (1,1) PRIMARY KEY,
    NOME_SETOR VARCHAR (50) NOT NULL,
    DESCRICAO VARCHAR (50),
    NOME_GERENTE VARCHAR (50)
);

GO

INSERT INTO SETORES (NOME_SETOR, DESCRICAO, NOME_GERENTE) VALUES
('TI', 'Tecnologia da Informa��o', 'Carlos Souza'),
('Financeiro', 'Gest�o financeira', 'Maria Oliveira'),
('Comercial', 'Vendas e Marketing', 'Lucas Silva'),
('RH', 'Recursos Humanos', 'Fernanda Costa'),
('TI', 'Suporte e Desenvolvimento', 'Roberto Lima'),
('Financeiro', 'Gest�o financeira e cont�bil', 'Tatiane Alves'),
('Comercial', 'Vendas e atendimento ao cliente', 'Marcelo Pereira'),
('RH', 'Gest�o de pessoal', 'Gabriela Rocha'),
('Financeiro', 'Planejamento financeiro', 'Rodrigo Fernandes'),
('TI', 'Desenvolvimento de software', 'Bruna Santos'),
('Comercial', 'Relacionamento com clientes', 'Vin�cius Almeida'),
('Financeiro', 'An�lise financeira e or�ament�ria', 'Simone Costa'),
('Comercial', 'Vendas corporativas', 'Paula Martins'),
('TI', 'Suporte t�cnico e infraestrutura', 'Andr� Ribeiro'),
('RH', 'Gest�o de recursos humanos', 'Renata Alves');

GO

CREATE TABLE CARGOS (
	CARGO_ID INT IDENTITY (1,1) PRIMARY KEY,
    NOME_CARGO VARCHAR (50) NOT NULL,
    SALARIO_BASE DECIMAL (18,2),
    N�VEL_PROFISSIONAL VARCHAR (50) NOT NULL
);

GO

INSERT INTO CARGOS (NOME_CARGO, SALARIO_BASE, N�VEL_PROFISSIONAL) VALUES
('Analista de TI', 5000.00, 'J�nior'),
('Gerente Financeiro', 8000.00, 'S�nior'),
('Executivo de Vendas', 7000.00, 'Pleno'),
('Analista de Recursos Humanos', 4500.00, 'J�nior'),
('Desenvolvedor de Software', 6000.00, 'Pleno'),
('Coordenador de Comercial', 7500.00, 'S�nior'),
('Assistente de TI', 3500.00, 'J�nior'),
('Analista de Marketing', 6000.00, 'Pleno'),
('Supervisor de TI', 8000.00, 'S�nior'),
('Consultor Financeiro', 7000.00, 'Pleno'),
('Coordenador de Recursos Humanos', 7500.00, 'S�nior'),
('Assistente de Vendas', 3000.00, 'J�nior'),
('Especialista em Seguran�a', 9000.00, 'Pleno'),
('Gestor de TI', 10000.00, 'S�nior'),
('Supervisor Financeiro', 8500.00, 'S�nior');

GO

CREATE TABLE FUNCIONARIOS (
    FUNCIONARIO_ID INT IDENTITY(1,1) PRIMARY KEY ,
    NOME_FUNCIONARIO VARCHAR (50) NOT NULL,
    CPF_FUNCIONARIO CHAR (11) NOT NULL UNIQUE,
    EMAIL_FUNCIONARIO VARCHAR (50),
    ENDERE�O_FUNCIONARIO VARCHAR (50),
	CARGO_ID INT,
    SETOR_ID INT NOT NULL,
    DATA_ADMISSIONAL DATE NOT NULL,
    SALARIO DECIMAL (18,2),
	CONSTRAINT FK_FUNCIONARIOS_CARGOS FOREIGN KEY (CARGO_ID) REFERENCES CARGOS(CARGO_ID),
	CONSTRAINT FK_FUNCIONARIOS_SETORES FOREIGN KEY (SETOR_ID) REFERENCES SETORES(SETOR_ID)
);

GO

INSERT INTO FUNCIONARIOS (NOME_FUNCIONARIO, CPF_FUNCIONARIO, EMAIL_FUNCIONARIO, ENDERE�O_FUNCIONARIO, CARGO_ID, SETOR_ID, DATA_ADMISSIONAL, SALARIO) VALUES
('Carlos Souza', '12345678901', 'carlos.souza@empresa.com', 'Rua A, 123', 1, 1, '2020-01-10', 5000.00),
('Maria Oliveira', '23456789012', 'maria.oliveira@empresa.com', 'Rua B, 456', 2, 2, '2021-02-15', 4000.00),
('Lucas Silva', '34567890123', 'lucas.silva@empresa.com', 'Rua C, 789', 3, 3, '2019-04-20', 5500.00),
('Fernanda Costa', '45678901234', 'fernanda.costa@empresa.com', 'Rua D, 101', 4, 4, '2020-06-30', 4500.00),
('Roberto Lima', '56789012345', 'roberto.lima@empresa.com', 'Rua E, 202', 5, 5, '2021-03-25', 5200.00),
('Tatiane Alves', '67890123456', 'tatiane.alves@empresa.com', 'Rua F, 303', 6, 6, '2021-07-18', 4800.00),
('Marcelo Pereira', '78901234567', 'marcelo.pereira@empresa.com', 'Rua G, 404', 7, 7, '2022-08-22', 5300.00),
('Gabriela Rocha', '89012345678', 'gabriela.rocha@empresa.com', 'Rua H, 505', 8, 8, '2020-05-17', 4700.00),
('Rodrigo Fernandes', '90123456789', 'rodrigo.fernandes@empresa.com', 'Rua I, 606', 9, 9, '2019-09-10', 5100.00),
('Bruna Santos', '12345098765', 'bruna.santos@empresa.com', 'Rua J, 707', 10, 10, '2021-10-12', 5500.00),
('Vin�cius Almeida', '23456123456', 'vinicius.almeida@empresa.com', 'Rua K, 808', 11, 11, '2020-12-01', 5400.00),
('Simone Costa', '34567234567', 'simone.costa@empresa.com', 'Rua L, 909', 12, 12, '2021-11-14', 4600.00),
('Paula Martins', '45678345678', 'paula.martins@empresa.com', 'Rua M, 110', 13, 13, '2022-01-19', 4900.00),
('Andr� Ribeiro', '56789456789', 'andre.ribeiro@empresa.com', 'Rua N, 121', 14, 14, '2022-02-20', 6000.00),
('Renata Alves', '67890567890', 'renata.alves@empresa.com', 'Rua O, 132', 15, 15, '2020-07-25', 4500.00);

GO

CREATE TABLE SALARIO_FUNCIONARIOS (
    FOLHA_SALARIAL_ID INT IDENTITY (1,1) PRIMARY KEY,
    FUNCIONARIO_ID INT,
    MES_REFERENTE VARCHAR (50),
    SALARIO_BASE DECIMAL (18,2),
    HORAS_EXTRAS INT,
    DESCONTOS DECIMAL (18,2),
    ANO INT,
    SALARIO_LIQUIDO DECIMAL (18,2),
    DATA_PAGAMENTO DATE,
    CONSTRAINT FK_FUNCIONARIOS_FOLHADEPAGAMENTOS FOREIGN KEY (FUNCIONARIO_ID) REFERENCES FUNCIONARIOS(FUNCIONARIO_ID)
);

GO

INSERT INTO SALARIO_FUNCIONARIOS (FUNCIONARIO_ID, MES_REFERENTE, SALARIO_BASE, HORAS_EXTRAS, DESCONTOS, ANO, SALARIO_LIQUIDO, DATA_PAGAMENTO) VALUES
(1, 'Janeiro', 5000.00, 10, 100.00, 2025, 4900.00, '2025-01-30'),
(2, 'Janeiro', 4000.00, 5, 50.00, 2025, 3950.00, '2025-01-30'),
(3, 'Janeiro', 5500.00, 8, 70.00, 2025, 5430.00, '2025-01-30'),
(4, 'Janeiro', 4500.00, 4, 60.00, 2025, 4440.00, '2025-01-30'),
(5, 'Janeiro', 5200.00, 6, 80.00, 2025, 5120.00, '2025-01-30'),
(6, 'Janeiro', 4800.00, 7, 70.00, 2025, 4730.00, '2025-01-30'),
(7, 'Janeiro', 5300.00, 5, 60.00, 2025, 5240.00, '2025-01-30'),
(8, 'Janeiro', 4700.00, 9, 50.00, 2025, 4650.00, '2025-01-30'),
(9, 'Janeiro', 5100.00, 10, 90.00, 2025, 5010.00, '2025-01-30'),
(10, 'Janeiro', 5500.00, 8, 100.00, 2025, 5400.00, '2025-01-30'),
(11, 'Janeiro', 6000.00, 6, 120.00, 2025, 5880.00, '2025-01-30'),
(12, 'Janeiro', 5500.00, 7, 90.00, 2025, 5410.00, '2025-01-30'),
(13, 'Janeiro', 4600.00, 5, 50.00, 2025, 4550.00, '2025-01-30'),
(14, 'Janeiro', 4900.00, 8, 70.00, 2025, 4830.00, '2025-01-30'),
(15, 'Janeiro', 6000.00, 10, 150.00, 2025, 5850.00, '2025-01-30');

GO

CREATE TABLE FERIAS (
    FERIAS_ID INT IDENTITY (1,1) PRIMARY KEY,
    FUNCIONARIO_ID INT,
    DATA_INICIO DATE,
    DATA_FIM DATE,
    DIAS_TOTAIS INT,
    SALDO_FERIAS DECIMAL (18,2),
    CONSTRAINT FK_FUNCIONARIOS_FERIAS FOREIGN KEY (FUNCIONARIO_ID) REFERENCES FUNCIONARIOS(FUNCIONARIO_ID)
);

GO

INSERT INTO FERIAS (FUNCIONARIO_ID, DATA_INICIO, DATA_FIM, DIAS_TOTAIS, SALDO_FERIAS) VALUES
(1, '2025-02-01', '2025-02-10', 10, 1000.00),
(2, '2025-02-05', '2025-02-15', 11, 950.00),
(3, '2025-02-10', '2025-02-20', 9, 1100.00),
(4, '2025-02-15', '2025-02-25', 10, 900.00),
(5, '2025-02-20', '2025-03-01', 12, 1050.00),
(6, '2025-02-25', '2025-03-05', 9, 1000.00),
(7, '2025-03-01', '2025-03-10', 10, 1200.00),
(8, '2025-03-05', '2025-03-15', 11, 1100.00),
(9, '2025-03-10', '2025-03-20', 10, 950.00),
(10, '2025-03-15', '2025-03-25', 10, 1000.00),
(11, '2025-03-20', '2025-03-30', 9, 1050.00),
(12, '2025-03-25', '2025-04-04', 10, 900.00),
(13, '2025-03-30', '2025-04-09', 10, 1150.00),
(14, '2025-04-01', '2025-04-11', 9, 950.00),
(15, '2025-04-05', '2025-04-15', 10, 1000.00);

    SELECT *
    FROM Clientes
    
    SELECT *
    FROM Contas

    SELECT *
    FROM CONTATOS
    
    SELECT *
    FROM ATENDENTE
    
    SELECT *
    FROM ATENDIMENTOS
    
    SELECT *
    FROM FEEDBACK
    
    SELECT *
    FROM ALERTA_SUSPENSAO

    SELECT *
    FROM TRANSACOES
    
    SELECT *
    FROM EMPRESTIMO
    
    SELECT *
    FROM CARTOES
    
    SELECT *
    FROM INVESTIMENTOS
    
    SELECT *
    FROM FATURAS
    
    SELECT *
    FROM SETORES
    
    SELECT *
    FROM CARGOS
    
    SELECT *
    FROM FUNCIONARIOS
    
    SELECT *
    FROM SALARIO_FUNCIONARIOS
    
    SELECT *
    FROM FERIAS
