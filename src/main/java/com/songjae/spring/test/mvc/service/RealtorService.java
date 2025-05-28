package com.songjae.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.test.mvc.domail.Realtor;
import com.songjae.spring.test.mvc.repository.RealtorRepository;

@Service
public class RealtorService {
	
	@Autowired
	private RealtorRepository realtorRepository;
	
	// 입력받은 값으로 공인중개사 추가하기
	public int addRealtor(Realtor realtor) {
		return realtorRepository.insertRealtor(realtor);
	}
}
