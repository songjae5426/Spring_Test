package com.songjae.spring.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.test.database.domain.NewReview;
import com.songjae.spring.test.database.domain.Store;
import com.songjae.spring.test.database.repository.NewReviewRepository;
import com.songjae.spring.test.database.repository.StoreRepository;

@Service
public class StoreService {
	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private NewReviewRepository newReviewRepository;
	
	// 가게 정보 목록 얻어 오기
	public List<Store> getStoreList() {
		// store 테이블의 모든 행 조회
		return storeRepository.selectStoreList();
	}
	
	// storeId로 new_review table에서 해당 가게 리뷰리스트 가져오기	
	public List<NewReview> getStoreReview(int storeId){
		return newReviewRepository.selectStoreReview(storeId);
	}
}
