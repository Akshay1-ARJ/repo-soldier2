package com.xworkz.soldgier.configuration;

import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.soldgier.dto.FirstAidDTO;
import com.xworkz.soldgier.repositories.FirstAidrRepository;
import com.xworkz.soldgier.repositories.FirstAidrRepositoryimpl;
import com.xworkz.soldgier.services.FirstAidServicesimpl;

@Configuration
@ComponentScan("com.xworkz.soldgier")

public class SpringConfiguration {
	public SpringConfiguration() {

		System.out.println("creating SpringConfiguration running ");
	}

	@Bean
	public Validator validator() {

		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		return validator;

	}

}
