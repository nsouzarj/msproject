package com.exemplo.msproject;

import com.exemplo.msproject.util.WebConfig;
import net.sf.mpxj.MPXJException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@EnableJpaRepositories("com.exemplo.msproject.repository.TarefasRepository")
@ComponentScan(basePackages = {"com.*"})
@EntityScan(basePackages = {"com.*"})
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication(scanBasePackages ={"domain","services","util","resource","repository"})
public class MsprojectApplication implements CommandLineRunner {
//    @Autowired
//	@Qualifier("LerMsProject")
//  	private LerMsProject lerMsProject;


	public static void main(String[] args) {
		SpringApplication.run(MsprojectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		//	webConfig.addCorsMappings(null);

	}

}