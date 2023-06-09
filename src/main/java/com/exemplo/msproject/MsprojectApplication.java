package com.exemplo.msproject;

import com.exemplo.msproject.domain.Tarefas;
import com.exemplo.msproject.repository.TarefasRepository;
import com.exemplo.msproject.util.LerMsProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableJpaRepositories("com.exemplo.msproject.repository.Repository")
@ComponentScan(basePackages ={"com.exemplo.msproject.repository.TarefasRepository",
		"com.exemplo.msproject.util.LerMsProject",
         "com.exemplo.msproject.services.ServiceTarefas",
		"com.exemplo.msproject.resource.DadosSource",
		"com.exemplo.msproject.util.WebConfig",
		"com.exemplo.msproject.odata.ODataController",
		"com.exemplo.msproject.util.","com.exemplo.msproject.*"})
@EntityScan(value = "com.exemplo.msproject.domain.*")
@SpringBootApplication(scanBasePackages = {"com.exemplo.msproject.*"})
public class MsprojectApplication {
//     @Autowired
//	 LerMsProject lerMsProject;

	public static void main(String[] args) {
		SpringApplication.run(MsprojectApplication.class, args);

	}


//	@Override
//	public void run(String... args) throws Exception {
////		lerMsProject.listaTarefa();
//
//
//
//	}

}