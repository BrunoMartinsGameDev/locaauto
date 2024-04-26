INSERT INTO endereco (rua, cep, bairro, numero, estado, cidade, complemento) VALUES
    ('Rua A', '12345-678', 'Centro', '100', 'SP', 'São Paulo', 'Apartamento 1'),
    ('Rua B', '54321-876', 'Perdizes', '200', 'RJ', 'Rio de Janeiro', NULL),
    ('Rua C', '98765-432', 'Vila Madalena', '300', 'MG', 'Belo Horizonte', 'Casa amarela'),
    ('Rua D', '13579-246', 'Moema', '400', 'PR', 'Curitiba', NULL),
    ('Rua E', '24680-135', 'Pinheiros', '500', 'RS', 'Porto Alegre', 'Sobrado 2'),
    ('Rua F', '86420-975', 'Ipanema', '600', 'SC', 'Florianópolis', 'Cobertura 3'),
    ('Rua G', '97531-684', 'Jardins', '700', 'GO', 'Goiânia', NULL),
    ('Rua H', '31415-926', 'Lapa', '800', 'BA', 'Salvador', 'Conjunto 4'),
    ('Rua I', '53589-793', 'Copacabana', '900', 'CE', 'Fortaleza', NULL),
    ('Rua J', '79382-589', 'Itaim Bibi', '1000', 'AM', 'Manaus', 'Edifício 5');

INSERT INTO cliente (nome, cpf, endereco_id, telefone) VALUES
    ('João Silva', '123.456.789-00', 1, '(11) 98765-4321'),
    ('Maria Santos', '987.654.321-00', 2, '(22) 1234-5678'),
    ('José Pereira', '456.789.012-00', 3, '(33) 2468-1357'),
    ('Ana Oliveira', '321.654.987-00', 4, '(44) 1357-2468'),
    ('Pedro Souza', '789.012.345-00', 5, '(55) 9876-5432'),
    ('Carla Ferreira', '234.567.890-00', 6, '(66) 4321-8765'),
    ('Marcos Costa', '890.123.456-00', 7, '(77) 3141-5926'),
    ('Laura Martins', '567.890.123-00', 8, '(88) 9753-1684'),
    ('Gabriel Lima', '012.345.678-00', 9, '(99) 5358-9793'),
    ('Fernanda Rocha', '345.678.901-00', 10, '(00) 7938-2589');

INSERT INTO veiculo (modelo, placa, ano) VALUES
    ('Gol', 'ABC1234', '2020'),
    ('Civic', 'DEF5678', '2018'),
    ('Onix', 'GHI9012', '2019'),
    ('HB20', 'JKL3456', '2021'),
    ('Corolla', 'MNO7890', '2017'),
    ('Uno', 'PQR1234', '2016'),
    ('Fox', 'STU5678', '2015'),
    ('Celta', 'VWX9012', '2014'),
    ('Palio', 'YZA3456', '2013'),
    ('Fiesta', 'BCD7890', '2012');

INSERT INTO reserva (datainicio, datafim, veiculo_id, cliente_id) VALUES
    ('2024-04-18 08:00:00', '2024-04-18 17:00:00', 1, 1),
    ('2024-04-19 09:00:00', '2024-04-19 18:00:00', 2, 2),
    ('2024-04-20 10:00:00', '2024-04-20 19:00:00', 3, 3),
    ('2024-04-21 11:00:00', '2024-04-21 20:00:00', 4, 4),
    ('2024-04-22 12:00:00', '2024-04-22 21:00:00', 5, 5),
    ('2024-04-23 13:00:00', '2024-04-23 22:00:00', 6, 6),
    ('2024-04-24 14:00:00', '2024-04-24 23:00:00', 7, 7),
    ('2024-04-25 15:00:00', '2024-04-25 00:00:00', 8, 8),
    ('2024-04-26 16:00:00', '2024-04-26 01:00:00', 9, 9),
    ('2024-04-27 17:00:00', '2024-04-27 02:00:00', 10, 10);
