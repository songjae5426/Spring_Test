package com.songjae.spring.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.test.database.domain.Store;
import com.songjae.spring.test.database.repository.StoreRepository;

@Service
public class StoreService {
	@Autowired
	private StoreRepository storeRepository;
	
	
	// 가게 정보 목록 얻어 오기
	public List<Store> getStoreList() {
		// store 테이블의 모든 행 조회
		return storeRepository.selectStoreList();
	}
	
}
