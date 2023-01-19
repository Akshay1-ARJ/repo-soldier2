package com.xworkz.soldgier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.FirstAidDTO;
import com.xworkz.soldgier.repositories.FirstAidrRepository;

@Component
public class FirstAidServicesimpl implements FirstAidServices {
	@Autowired
	private FirstAidrRepository repo;
	private Validator validator;

	@Autowired
	public FirstAidServicesimpl(Validator validator) {
		super();
		this.validator = validator;
	}

	public void FirstAidServicesimpl(FirstAidrRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {
		System.out.println("validate and save working ");

		Set<ConstraintViolation<FirstAidDTO>> violations = validator.validate(aidDTO);
		if (!violations.isEmpty()) {
			System.out.println("validating contants is invalid");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			System.out.println("Data validation sucess save starting");
			boolean save = repo.save(aidDTO);
			return save;
		}
	}

}
