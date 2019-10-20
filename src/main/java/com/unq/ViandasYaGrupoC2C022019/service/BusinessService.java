package com.unq.ViandasYaGrupoC2C022019.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unq.ViandasYaGrupoC2C022019.model.Business;
import com.unq.ViandasYaGrupoC2C022019.persistence.BusinessRepository;

@Service
public class BusinessService {

	@Autowired
	private BusinessRepository businessRepository;
	
	public BusinessService(BusinessRepository repository) {
		this.businessRepository = repository;
	}

	public Business findByBusinessId(Long idBusiness) {
		return businessRepository.getOne(idBusiness);
	}

	public Business save(Business aBusiness) {
		return businessRepository.save(aBusiness);
	}

	
}