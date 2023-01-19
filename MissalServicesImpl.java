package com.xworkz.soldgier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.FirstAidDTO;
import com.xworkz.soldgier.dto.MissalDTO;
import com.xworkz.soldgier.repositories.MissalRepository;

@Component
public class MissalServicesImpl implements MissalServices {
	private Validator validator;

	@Autowired
	private MissalRepository missalRepository;

	@Autowired
	public MissalServicesImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MissalDTO dto) {
		System.out.println("Missal save and validate running");
		Set<ConstraintViolation<MissalDTO>> violations = this.validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("validating contants is invalid");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			System.out.println("Data validation sucess save starting");
			boolean save = missalRepository.save(dto);
			return save;
		}

	}

}
