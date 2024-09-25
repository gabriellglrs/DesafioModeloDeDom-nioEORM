INSERT INTO tb_participante (id,nome,email) VALUES (1 , 'Jose Silva', 'jose@gmail.com');
INSERT INTO tb_participante (id,nome,email) VALUES (2 , 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (id,nome,email) VALUES (3 , 'Maria do Rosario', 'maria@gmail.com');
INSERT INTO tb_participante (id,nome,email) VALUES (4 , 'Teresa Rodrigues', 'teresa@gmail.com');

INSERT INTO tb_categoria (id,descricao) VALUES (1 , 'Curso');
INSERT INTO tb_categoria (id,descricao) VALUES (2 , 'Oficina');

INSERT INTO tb_atividade (id,nome,descricao, preco, categoria_id) VALUES (1 , 'Curso de html', 'aprenda HTML de forma pratica', 80.00, 1);
INSERT INTO tb_atividade (id,nome,descricao, preco, categoria_id) VALUES (2 , 'Curso de github', 'aprenda github de forma pratica', 50.00, 2);


INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (1 , '2017-09-25 08:00:00', '2017-09-25 11:00:00', 1);
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (2 , '2017-09-25 14:00:00', '2017-09-25 18:00:00', 2);
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (3 , '2017-09-26 08:00:00', '2017-09-26 11:00:00', 2);

INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (1, 1);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (1, 2);

INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (2, 1);

INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (3, 1);
INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (3, 2);

INSERT INTO tb_atividade_participante (participante_id, atividade_id) VALUES (4, 2);

