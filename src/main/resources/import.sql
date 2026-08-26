INSERT INTO tb_role (authority) VALUES ('ROLE_ALUNO');
INSERT INTO tb_role (authority) VALUES ('ROLE_PROFESSOR');

INSERT INTO tb_user (username, email, password, phone, address) VALUES ('Ana Aluna', 'ana.aluna@gmail.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', '11999990000', 'Rua A, 123');
INSERT INTO tb_user (username, email, password, phone, address) VALUES ('Pedro Professor', 'pedro.professor@gmail.com', '$2a$10$.mmz3OqUecF234Bic.FuYO5uZF9eZZGYM7aDkVLpqGVKUqBfhwrAC', '11988880000', 'Rua B, 456');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_disciplina (title, description, created) VALUES ('Matemática', 'Disciplina de Matemática do ensino fundamental.', '2026-02-01T08:00:00');
INSERT INTO tb_disciplina (title, description, created) VALUES ('Português', 'Disciplina de Língua Portuguesa.', '2026-02-01T08:00:00');

INSERT INTO tb_turma (name, school_year) VALUES ('9º Ano A', '2026');
INSERT INTO tb_turma (name, school_year) VALUES ('9º Ano B', '2026');

INSERT INTO tb_atividade (title, content, status, disciplina_id) VALUES ('Lista de Exercícios 1', 'Resolver os exercícios das páginas 10 a 15.', 'ABERTA', 1);
INSERT INTO tb_atividade (title, content, status, disciplina_id) VALUES ('Redação Dissertativa', 'Escrever uma redação sobre o tema sorteado em sala.', 'ABERTA', 2);

INSERT INTO tb_entrega (content, status, submission_date, atividade_id) VALUES ('Resposta do aluno para a lista de exercícios.', 'ENVIADA', '2026-03-01T14:30:00', 1);
INSERT INTO tb_entrega (content, status, submission_date, atividade_id) VALUES ('Redação entregue pelo aluno.', 'ENVIADA', '2026-03-02T09:15:00', 2);

INSERT INTO tb_nota (period, rate) VALUES ('1º Bimestre', 8.5);
INSERT INTO tb_nota (period, rate) VALUES ('1º Bimestre', 7.0);

INSERT INTO tb_boletim (period, final_average, status) VALUES ('1º Bimestre', 8.5, 'APROVADO');
INSERT INTO tb_boletim (period, final_average, status) VALUES ('1º Bimestre', 7.0, 'APROVADO');
