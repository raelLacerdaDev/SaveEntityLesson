-- ==========================================
-- SEED: tb_department (5 Departamentos)
-- ==========================================
-- Assumindo que o banco está vazio, os IDs gerados (IDENTITY) serão 1, 2, 3, 4 e 5.
INSERT INTO tb_department (name) VALUES ('Tecnologia da Informação');
INSERT INTO tb_department (name) VALUES ('Recursos Humanos');
INSERT INTO tb_department (name) VALUES ('Vendas');
INSERT INTO tb_department (name) VALUES ('Marketing');
INSERT INTO tb_department (name) VALUES ('Financeiro');

-- ==========================================
-- SEED: tb_person (20 Pessoas)
-- ==========================================

-- Departamento 1: Tecnologia da Informação
INSERT INTO tb_person (name, salary, department_id) VALUES ('Alice Silva', 8500.00, 1);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Bruno Santos', 7200.50, 1);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Carlos Oliveira', 9100.00, 1);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Daniela Souza', 10500.00, 1);

-- Departamento 2: Recursos Humanos
INSERT INTO tb_person (name, salary, department_id) VALUES ('Eduarda Lima', 4500.00, 2);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Felipe Costa', 4800.00, 2);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Gabriela Pereira', 5200.00, 2);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Henrique Alves', 4100.00, 2);

-- Departamento 3: Vendas
INSERT INTO tb_person (name, salary, department_id) VALUES ('Isabela Rodrigues', 6000.00, 3);
INSERT INTO tb_person (name, salary, department_id) VALUES ('João Martins', 6300.00, 3);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Karina Gomes', 5900.00, 3);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Lucas Barbosa', 7100.00, 3);

-- Departamento 4: Marketing
INSERT INTO tb_person (name, salary, department_id) VALUES ('Mariana Ribeiro', 5500.00, 4);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Nicolas Rocha', 5800.00, 4);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Olívia Mendes', 6200.00, 4);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Pedro Teixeira', 5400.00, 4);

-- Departamento 5: Financeiro
INSERT INTO tb_person (name, salary, department_id) VALUES ('Quintino Vieira', 8000.00, 5);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Rafaela Nunes', 8200.00, 5);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Samuel Monteiro', 9500.00, 5);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Tatiane Farias', 7800.00, 5);