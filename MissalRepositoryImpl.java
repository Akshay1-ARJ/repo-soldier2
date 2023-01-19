package com.xworkz.soldgier.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.MissalDTO;

@Component
public class MissalRepositoryImpl implements MissalRepository {

	public MissalRepositoryImpl() {
		System.out.println("MissalRepository Constructor is Running");
	}

	@Override
	public boolean save(MissalDTO dto) {
		System.out.println("Missal saving running");
		return true;
	}

}
