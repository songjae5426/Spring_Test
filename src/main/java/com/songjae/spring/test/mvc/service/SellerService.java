package com.songjae.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.songjae.spring.test.database.service.StoreService;
import com.songjae.spring.test.mvc.domail.Seller;
import com.songjae.spring.test.mvc.repository.SellerRepository;

@Service
public class SellerService {


	@Autowired
	private SellerRepository sellerRepository;


	
	
	// seller 추가후 추가된 행수 반환 기능
	public int addSeller(String nickcame, double temperature, String profileImage) {
		return sellerRepository.insertSeller(nickcame, temperature, profileImage);
	}
	
	// 마지막으로 추가된 seller정보 가져오기
	public Seller getLastSeller() {
		return sellerRepository.selectLastSeller();
	}
	
	// 입력 받은 id와 일치하는 판매자 정보 가져오기
	public Seller getSellerById(int id) {
		return sellerRepository.selectSellerById(id);
	}
	
//	// 마지막에 등록된 seller 가져오기
//	public Seller getLastSeller(){
//		return sellerRepository.selectLastSeller();
//	}
//	
//	// id를 통한 seller정보검색
//	public Seller searchSellerId(int id) {
//		return sellerRepository.selectIdSeller(id);
//	}
}
