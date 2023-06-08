package com.exemplo.msproject.util;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.services.ServiceTarefas;
import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.ResourceAssignment;
import net.sf.mpxj.ResourceAssignmentContainer;
import net.sf.mpxj.reader.UniversalProjectReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LerMsProject {

    @Autowired
     private ServiceTarefas serviceTarefas;

    UniversalProjectReader reader = new UniversalProjectReader();
    ProjectFile project = reader.read("Jurua_09fev23.mpp");
    ResourceAssignmentContainer resourceAssignments=project.getResourceAssignments();

    Tarefas tarefas = null;
    List<Tarefas> tarefasList = new ArrayList<>();

    public LerMsProject () throws MPXJException {
        // TODO document why this constructor is empty
    }

    public void leraquivo(){

        for(ResourceAssignment dados:resourceAssignments){
            if(dados.getResource()!=null){
                tarefas= new Tarefas();
                tarefas.setIdtarefaprincipal(dados.getTask().getUniqueID());
                tarefas.setNometarefa(dados.getTask().getName());
                tarefas.setRecurso(dados.getResource().getName());
                serviceTarefas.salvarTarefa(tarefas);
            }
        }

    }
    @Bean(name="listaTarefa")
    public  List<Tarefas> listaTarefa(){
        for(ResourceAssignment resso:resourceAssignments){
            if(resso.getResource()!=null){
                tarefas= new Tarefas();
                tarefas.setIdtarefaprincipal(resso.getTask().getUniqueID());
                tarefas.setNometarefa(resso.getTask().getName());
                tarefas.setRecurso(resso.getResource().getName());

                tarefasList.add(tarefas);
            }
        }
        //serviceTarefas.trazerLista();
       return tarefasList;
    }


}
