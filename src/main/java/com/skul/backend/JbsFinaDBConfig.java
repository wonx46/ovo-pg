package com.skul.backend;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		  entityManagerFactoryRef = "finaEntityManagerFactory",
		  transactionManagerRef = "finaTransactionManager",
		  basePackages = { "com.skul.backend.jbsfina.repository" }
		)
public class JbsFinaDBConfig {
	  @Bean(name = "finadataSource")
	  @ConfigurationProperties(prefix = "spring.datasource.jbsfina")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }
	  
	  @Bean(name = "finaEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean 
	  entityManagerFactory(
	    EntityManagerFactoryBuilder builder,
	    @Qualifier("finadataSource") DataSource dataSource
	  ) {
	    return builder
	      .dataSource(dataSource)
	      .packages("com.skul.backend.jbsfina.domain")
	      .persistenceUnit("jbsfina")
	      .build();
	  }
	    
	  @Bean(name = "finaTransactionManager")
	  public PlatformTransactionManager transactionManager(
	    @Qualifier("finaEntityManagerFactory") EntityManagerFactory 
	    finaentityManagerFactory
	  ) {
	    return new JpaTransactionManager(finaentityManagerFactory);
	  }
}
