package com.exemplo.msproject.resource;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.util.LerMsProject;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


//@CrossOrigin(value = "*")
public class SalvaDados {

    @Autowired
    LerMsProject lerMsProject;

//  @RequestMapping(value = "/ler",method = RequestMethod.GET)
   public void lerDados(){
        lerMsProject.leraquivo();
  }


   // @RequestMapping(value = "/lista",method = RequestMethod.GET)
    public List<Tarefas> lerDados1(){
        return lerMsProject.listaTarefa();
    }
}
