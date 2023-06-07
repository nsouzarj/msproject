package com.exemplo.msproject.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariConfigMXBean;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.SQLException;


@Configuration
public class DataSourceConfig{



    @Bean("doido")
    @ConfigurationProperties (prefix = "spring.datasource.local")
    public DataSource local() throws SQLException {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }


    @Bean("entityManagerFactory")
    @Primary
    @ConfigurationProperties (prefix = "spring.datasource.local")
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
