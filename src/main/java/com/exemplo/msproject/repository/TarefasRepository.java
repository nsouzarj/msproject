package com.exemplo.msproject.repository;
import com.exemplo.msproject.domain.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
