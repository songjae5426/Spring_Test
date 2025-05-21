package com.songjae.spring.test.mybatis.service;

import java.util.List;import javax.print.DocFlavor.READER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.test.mybatis.domain.Real_estate;
import com.songjae.spring.test.mybatis.repository.Real_estateRepository;

@Service
public class Real_estateService {
	
	@Autowired
	private Real_estateRepository real_estateRepository;
	
	public Real_estate getReal_estate(int id) {
		// id에 따른 값 가져오기
		return real_estateRepository.selectReal_estate(id);
	}
	
	public List<Real_estate> getReal_estateRent(int rent){
		return real_estateRepository.selectReal_estateRent(rent);
	}
	
	public List<Real_estate> getReal_estateComplexConditions(int area, int price){
		return real_estateRepository.selectReal_estateRentComplexConditions(area, price);
	}
}
