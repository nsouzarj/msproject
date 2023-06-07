package com.exemplo.msproject.repository;
import com.exemplo.msproject.domain.Tarefas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TarefasRepository extends CrudRepository<Tarefas,Long> {
}
