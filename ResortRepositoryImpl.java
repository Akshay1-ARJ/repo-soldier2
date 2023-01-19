package com.xworkz.soldgier.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.ResortDTO;

@Component
public class ResortRepositoryImpl implements ResortRepository {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Resort saving running");
		return true;
	}

}
