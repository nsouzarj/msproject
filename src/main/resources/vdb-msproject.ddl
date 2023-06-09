CREATE DATABASE vdbremoto  OPTIONS (ANNOTATION 'Customer VDB');
USE DATABASE vdbremoto;
CREATE SERVER dbtarefas  FOREIGN DATA WRAPPER H2;
--CREATE SCHEMA local1  SERVER dbtarefas;
--IMPORT FOREIGN SCHEMA LOCAL FROM SERVER dbtarefas INTO local1;
--SET SCHEMA local1;
--CREATE FOREIGN TABLE tarefas
-- (
--      id bigint primary key,
--      idtarefaprincipal bigint,
--      nometarefa varchar(255),
--      recurso varchar(255)
--  );


--IMPORT FOREIGN SCHEMA LOCAL FROM SERVER dbtarefas INTO local1  OPTIONS("importer.useFullSchemaName" 'false');
--CREATE SCHEMA test;
--CREATE SERVER dbtarefas  FOREIGN DATA WRAPPER H2;
--CREATE SCHEMA test SERVER dbtarefas;
--OPTIONS (importer.tableTypes 'TABLE,VIEW' );
--CREATE VIRTUAL SCHEMA virt;
--SET SCHEMA virt;
--CREATE VIRTUAL TABLE TESTE;
--CREATE SCHEMA local1  SERVER dbtarefas;
--IMPORT FOREIGN SCHEMA LOCAL FROM SERVER dbtarefas INTO local1  OPTIONS("importer.useFullSchemaName" 'false');
--IMPORT FOREIGN SCHEMA local FROM SERVER dbtarefas INTO local1
--    OPTIONS(
--        importer.useFullSchemaName false,
--        importer.tableTypes 'TABLE,VIEW'
--);




