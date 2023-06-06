package com.exemplo.msproject.repository;
import com.exemplo.msproject.domain.Tarefas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
