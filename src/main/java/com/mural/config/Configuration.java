package com.mural.config;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.metamodel.ManagedType;
import javax.persistence.metamodel.Metamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import lombok.AllArgsConstructor;

@SuppressWarnings("deprecation")
@Component
@AllArgsConstructor
public class Configuration extends RepositoryRestConfigurerAdapter {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("DELETE");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		List<Class<?>> entityClasses = getAllManagedEntityTypes(entityManagerFactory);

		for (Class<?> entityClass : entityClasses) {
			config.exposeIdsFor(entityClass);
		}

		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
	}

	private List<Class<?>> getAllManagedEntityTypes(EntityManagerFactory entityManagerFactory) {
		List<Class<?>> entityClasses = new ArrayList<>();
		Metamodel metamodel = entityManagerFactory.getMetamodel();

		for (ManagedType<?> managedType : metamodel.getManagedTypes()) {
			if (managedType.getJavaType().isAnnotationPresent(Entity.class)) {
				entityClasses.add(managedType.getJavaType());
			}
		}

		return entityClasses;
	}

}
