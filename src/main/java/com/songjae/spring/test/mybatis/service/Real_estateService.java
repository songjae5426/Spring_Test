package com.songjae.spring.test.mybatis.service;

import java.util.List;import javax.print.DocFlavor.READER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.songjae.spring.test.database.service.StoreService;
import com.songjae.spring.test.mybatis.domain.Real_estate;
import com.songjae.spring.test.mybatis.repository.Real_estateRepository;

@Service
public class Real_estateService {

    private final StoreService storeService;
	
	@Autowired
	private Real_estateRepository real_estateRepository;

    Real_estateService(StoreService storeService) {
        this.storeService = storeService;
    }
	
	// id에 따른 값 가져오기
	public Real_estate getReal_estate(int id) {
		return real_estateRepository.selectReal_estate(id);
	}
	
	public List<Real_estate> getReal_estateRent(int rent){
		return real_estateRepository.selectReal_estateRent(rent);
	}
	
	public List<Real_estate> getReal_estateComplexConditions(int area, int price){
		return real_estateRepository.selectReal_estateRentComplexConditions(area, price);
	}
	
	public int setReal_estateObjectInsert(Real_estate real_estate) {
		return real_estateRepository.insertReal_estateObject(real_estate);
	}
	
	public int setReal_estateParameter(int realtorId, 
			String address, 
			int area, 
			String type,
			int price,
			int rentPrice) {
		
		return real_estateRepository.insertReal_estateParameter(realtorId, address, area, type, price, rentPrice);
	}
	
	public int updateReal_estate(Real_estate real_estate) {
		return real_estateRepository.updateReal_estate(real_estate);
	}
	
	public int deleteReal_estate(int id) {
		return real_estateRepository.deleteReal_estate(id);
	}
}
