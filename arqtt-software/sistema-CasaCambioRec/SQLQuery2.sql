--CREATE DATABASE CasaCambio;
--GO

--USE CasaCambio;
--GO

CREATE TABLE Cliente (
    cliente_id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    data_nascimento DATE,
    prioridade VARCHAR(11),
    cadastrado_no_CR BIT NOT NULL,
    login VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

CREATE TABLE Senha (
    senha_id INT PRIMARY KEY,
    cliente_id INT NOT NULL,
    prioridade BIT NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(cliente_id) ON DELETE CASCADE
);

CREATE TABLE Atendimento (
    atendimento_id INT PRIMARY KEY,
    cliente_id INT NOT NULL,
    senha_id INT NOT NULL,
    atendido BIT NOT NULL,
    valor_transacao DECIMAL(10, 2),
    tipo_moeda VARCHAR(10),
    FOREIGN KEY (cliente_id) REFERENCES Cliente(cliente_id),
    FOREIGN KEY (senha_id) REFERENCES Senha(senha_id)
);

CREATE TABLE Recepcao (
    recepcao_id INT PRIMARY KEY,
    senha_id INT NOT NULL,
    chamada BIT NOT NULL,
    --data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (senha_id) REFERENCES Senha(senha_id)
);

-- exemplo de cliente
INSERT INTO Cliente (nome,cliente_id, cpf, data_nascimento, prioridade, cadastrado_no_CR, login, senha)
VALUES ('João Silva', 345323, '12345678901', '1990-05-10', 0, 1, 'joaosilva', 'senha123');

SELECT * FROM Cliente;

-- cliente com prioridade
INSERT INTO Cliente (nome, cliente_id, cpf, data_nascimento, prioridade, cadastrado_no_CR, login, senha)
VALUES ('Maria Souza', 0002 , '98765432100', '1985-12-25', 1, 0, 'mariasouza', 'senha123');

-- senha retirada por cliente
INSERT INTO Senha (cliente_id, senha_id, prioridade)
VALUES (1, 1000, 0), (2, 2000, 1);

-- atendimento
INSERT INTO Atendimento (cliente_id, senha_id, atendimento_id, atendido, valor_transacao, tipo_moeda)
VALUES (1, 1, 1, 1500.00, 'USD'), (2, 2, 1, 2000.00, 'EUR');

-- chamada de senha pela recepção
INSERT INTO Recepcao (senha_id, chamada)
VALUES (1, 1), (2, 1);
