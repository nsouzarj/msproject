package com.exemplo.msproject.util;

import com.exemplo.msproject.domain.SubTarefas;
import com.exemplo.msproject.domain.Tarefa;
import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.services.ServiceTarefas;
import net.sf.mpxj.*;
import net.sf.mpxj.reader.UniversalProjectReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LerMsProject {

    @Autowired
    private ServiceTarefas serviceTarefas;

    private UniversalProjectReader reader = new UniversalProjectReader();
    private ProjectFile project = reader.read("Jurua_09fev23.mpp");
    private ResourceAssignmentContainer resourceAssignments = project.getResourceAssignments();
    private TaskContainer assignment = project.getTasks();
    private List<Tarefas> tarefasList = new ArrayList<>();
    private Integer contadorTarefa;
    private Integer contadorSubTarefa;
    private Tarefas tarefas;

    public LerMsProject () throws MPXJException {
        // TODO document why this constructor is empty
    }

    public void leraquivo () {


        for (ResourceAssignment dados : resourceAssignments) {
            if (dados.getResource() != null) {
                contadorTarefa = contadorTarefa + 1;
                tarefas = new Tarefas();
                tarefas.setId(contadorTarefa);

                tarefas.setIdtarefaprincipal(dados.getTask().getUniqueID());
                tarefas.setNometarefa(dados.getTask().getName());
                tarefas.setRecurso(dados.getResource().getName());
                serviceTarefas.salvarTarefa(tarefas);
            }
        }

    }

    // @Bean(name="listaTarefa")
    public ArrayList<Tarefas> listaTarefaRecursos () {
        contadorTarefa = 1;

        for (ResourceAssignment resso : resourceAssignments) {
            if (resso.getResource() != null) {
                if (resso.getTask().getActive()) {
                    tarefas = new Tarefas();
                    Task task = resso.getTask();
                    String teste = assignment.toString();
                    tarefas.setId(contadorTarefa++);
                    tarefas.setIdtarefaprincipal(resso.getTask().getUniqueID());
                    tarefas.setNomeprojeto(resso.getTask().getProject());
                    tarefas.setNometarefa(resso.getTask().getName());
                    tarefas.setRecurso(resso.getResource().getName());
                    tarefas.setDatainicio(resso.getTask().getStart());
                    tarefas.setNotatarefa(resso.getTask().getNotes());
                    tarefas.setDuracao(resso.getTask().getDuration().toString());
                    tarefas.setDataconclusao(resso.getTask().getFinish());

                    if (resso.getTask().getParentTask().getChildTasks().size() > 0) {
                        contadorSubTarefa = 1;
                        ArrayList<SubTarefas> subTarefaslist = new ArrayList<>();
                        for (Task childTaskContainer : resso.getTask().getParentTask().getChildTasks()) {
                            SubTarefas subTarefas = new SubTarefas();
                            subTarefas.setIdsubtarefa(childTaskContainer.getUniqueID());
                            subTarefas.setIdtarefapai((int) tarefas.getIdtarefaprincipal());
                            subTarefas.setNomesubtarefa(childTaskContainer.getName());
                            subTarefaslist.add(subTarefas);

                        }
                        tarefas.setSubtarefas(subTarefaslist);

                    }
                }

            }
            tarefasList.add(tarefas);
        }

        //serviceTarefas.trazerLista();
        return (ArrayList<Tarefas>) tarefasList;
    }

    public List<Tarefa> listaSoTarefas () {
        List<Tarefa> tarefaList = new ArrayList<>();
        for (Task task : assignment) {
            Tarefa tarefa = new Tarefa();
            tarefa.setId(task.getID());
            tarefa.setNomeTafera(task.getName() + " - " + task.getNotes());
            tarefaList.add(tarefa);
        }
        return tarefaList;

    }


}
