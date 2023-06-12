package com.exemplo.msproject;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.util.LerMsProject;
import net.sf.mpxj.MPXJException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
class TnsereDadoTest {


    @BeforeEach
    public void setup() {

    }


    @Test
    void lisitarTrafas() {
        LerMsProject lerMsProject= null;
        try {
            lerMsProject = new LerMsProject();
        } catch (MPXJException e) {
            throw new RuntimeException(e);
        }
        List<Tarefas> tarefasList = lerMsProject.listaTarefaRecursos();
        System.out.println(tarefasList);

    }
}
