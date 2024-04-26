CREATE TABLE endereco(
    id int auto_increment primary key,
    rua varchar(255) not null,
    cep varchar(20) not null,
    bairro varchar(255) not null,
    numero varchar(255) not null,
    estado varchar(2) not null,
    cidade varchar(255) not null,
    complemento varchar(255)
);

CREATE TABLE cliente(
    id int auto_increment primary key,
    nome varchar(255) not null,
    cpf varchar(20) not null,
    endereco_id int,
    telefone varchar(20),
    isAtivo boolean,
    CONSTRAINT cliente_fk1 FOREIGN KEY (endereco_id) REFERENCES endereco (id)
);

CREATE TABLE veiculo(
    id int auto_increment primary key,
    modelo varchar(255) not null,
    placa varchar(255) not null,
    ano varchar(4),
    isAtivo boolean
);

CREATE TABLE reserva(
    id int auto_increment primary key,
    datainicio datetime,
    datafim datetime,
    veiculo_id int,
    cliente_id int,
    CONSTRAINT reserva_fk1 FOREIGN KEY (cliente_id) REFERENCES cliente (id),
    CONSTRAINT reserva_fk2 FOREIGN KEY (veiculo_id) REFERENCES veiculo (id)
);

