package com.exemplo.msproject;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.util.LerMsProject;
import net.sf.mpxj.MPXJException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

class TnsereDadoTest {
    LerMsProject lerMsProject;

    @BeforeEach
    public void setup() throws MPXJException {
        lerMsProject= new LerMsProject();
    }

    public TnsereDadoTest () throws MPXJException {
    }

    @Test
    void lisitarTrafas() throws MPXJException {

        List<Tarefas> tarefasList= lerMsProject.listaTarefa();
        System.out.println(tarefasList);

    }
}
