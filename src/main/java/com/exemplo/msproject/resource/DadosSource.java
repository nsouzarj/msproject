package com.exemplo.msproject.resource;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.util.LerMsProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@CrossOrigin(origins = {"*"},allowCredentials = "false",originPatterns = {"*"},exposedHeaders = {"*"})
@RequestMapping("/")
public class DadosSource {

    @Autowired
    LerMsProject lerMsProject;
   @CrossOrigin( origins = {"*"},allowCredentials = "",originPatterns = {"*"},exposedHeaders = {"*"})
   @RequestMapping (value = "/ler",method = RequestMethod.GET)
   public void lerDados(){
        lerMsProject.leraquivo();
  }

    @CrossOrigin( origins = {"*"},allowCredentials = "",originPatterns = {"*"},exposedHeaders = {"*"})

    @RequestMapping(value = "/lista",method = RequestMethod.GET)
    public List<Tarefas> lerDados1(){
        return lerMsProject.listaTarefa();
    }
}
