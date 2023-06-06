package com.exemplo.msproject.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;


@Configuration
public class DataSourceConfig{



    @Bean(name = "coisado")
    @ConfigurationProperties (prefix = "spring.datasource")
    public DataSource datasource() throws SQLException {
        DataSourceProperties dataSourceProperties = new DataSourceProperties();
        dataSourceProperties.setPassword("ca");
        dataSourceProperties.setUsername("ca");
        dataSourceProperties.setDriverClassName("org.h2.Driver");
        dataSourceProperties.setUrl("jdbc:h2:mem:tarefas;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1;INIT=CREATE SCHEMA IF NOT EXISTS local");

        DataSourceBuilder dataSourceBuilder = dataSourceProperties.initializeDataSourceBuilder();

        return DataSourceBuilder.create().build();
    }


    @Bean("entityManagerFactory")
    @Primary
    @ConfigurationProperties (prefix = "spring.datasource")
    public LocalSessionFactoryBean sessionFactory() throws NamingException, SQLException {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

        return sessionFactory;
    }

//    @Bean
//    public DataSourceInitializer dataSourceInitializer(DataSource ds) {
//        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//        resourceDatabasePopulator.addScript(new ClassPathResource("/data.sql"));
//
//        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//        dataSourceInitializer.setDataSource(ds);
//        dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
//        return dataSourceInitializer;
//    }

//    @Bean
//    @ConfigurationProperties (prefix = "spring.datasource")
//    public DataSource dataSource3() throws NamingException {
//      //  Context initialContext = new InitialContext();
//
//        HikariConfig config = new HikariConfig();
//        config.setMaximumPoolSize(100);
//        config.setDataSourceClassName("org.h2.Driver");
//        config.setJdbcUrl("jdbc:h2:mem:dbtarefas;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1;INIT=CREATE SCHEMA IF NOT EXISTS local");
//        config.setPassword("ca");
//        config.setUsername("ca");
//        config.setDataSourceJNDI("java:/dbtarefas");
//        return new HikariDataSource(config);
//    }






}
