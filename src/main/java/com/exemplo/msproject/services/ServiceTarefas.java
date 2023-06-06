package com.exemplo.msproject.services;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class ServiceTarefas {

    @Autowired
    public TarefasRepository tarefasRepository;
    public void salvarTarefa(Tarefas tarefas){
        tarefasRepository.save(tarefas);
    }

    public List<Tarefas> tarefasList(){
       return (List<Tarefas>) tarefasRepository.findAll();
    }
}
