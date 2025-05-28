package com.songjae.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.songjae.spring.test.mvc.domail.Seller;

@Mapper
public interface SellerRepository {
	
	// Sellerq테이블에 닉네임, 프로필url, 온도 Insert
	public int insertSeller(@Param("nickname") String nickname, 
			@Param("temperature") double temperature,
			@Param("profileImage") String profileImage);
	
	// id를 기준으로 내림차순으로 정렬후 첫 번째행 => 맨 마지막에 등록된 seller정보 가져오기
	public Seller selectLastSeller();
	
	// id입력받아 id를 조건으로 Seller정보 검색
	public Seller selectSellerById(@Param("id") int id);
	

}
