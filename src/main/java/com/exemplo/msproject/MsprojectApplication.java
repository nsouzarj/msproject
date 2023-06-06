package com.exemplo.msproject;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.repository.TarefasRepository;
import com.exemplo.msproject.services.ServiceTarefas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication(scanBasePackages = "com.*")
@EnableJpaRepositories ("com.exemplo.msproject.*")
@ComponentScan("com.exemplo.msproject.domain.Tarefas")
@EntityScan(basePackages = {"com.exemplo.msproject.*"})
@EnableAutoConfiguration
//@EnableWebMvc
public class MsprojectApplication implements CommandLineRunner {
    //@Autowired
	//ServiceTarefas serviceTarefas;
	public static void main(String[] args) {
		SpringApplication.run(MsprojectApplication.class, args);
	}


	@Override
	public void run (String... args) throws Exception {
//		Tarefas tarefas=new Tarefas();
//		//tarefas.setId(1L);
//		tarefas.setIdtarefaprincipal(2L);
//		serviceTarefas.salvarTarefa(tarefas);

        //tarefasRepository.findAll();
	}
}
