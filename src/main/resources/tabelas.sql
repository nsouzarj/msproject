SET SCHEMA local;

DROP TABLE IF EXISTS TAREFAS;
CREATE TABLE TAREFAS
 (
      id long,
      idtarefaprincipal long,
      nometarefa varchar(255),
      recurso varchar(255),
      CONSTRAINT TAREFAS_PK PRIMARY KEY(id)

  );

