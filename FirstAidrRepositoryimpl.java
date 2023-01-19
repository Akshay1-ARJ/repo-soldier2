package com.xworkz.soldgier.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.FirstAidDTO;
@Component
public class FirstAidrRepositoryimpl implements FirstAidrRepository {

	@Override
	public boolean save(FirstAidDTO aidDTO) {
		System.out.println("Save Started");
		return true;
	}

}
