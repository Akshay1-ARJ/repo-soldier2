package com.xworkz.soldgier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.FirstAidDTO;
import com.xworkz.soldgier.dto.ResortDTO;
import com.xworkz.soldgier.repositories.ResortRepository;

@Component
public class ResortServicesImpl implements ResortServices {

	private Validator validator;
	@Autowired
	private ResortRepository resort;

	@Autowired
	public ResortServicesImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	@Override
	public boolean saveAndValidate(ResortDTO dto) {

		System.out.println("Resoty Save nadtha ede");
		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("validating contants is invalid");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			System.out.println("Data validation sucess save starting");
			boolean save = resort.save(dto);
			return save;
		}

	}

}
