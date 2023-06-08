SET SCHEMA local;

DROP TABLE IF EXISTS TAREFAS;
CREATE TABLE TAREFAS
 (
      id bigint auto_increment primary key,
      idtarefaprincipal long,
      nometarefa varchar(255),
      recurso varchar(255)

  );

