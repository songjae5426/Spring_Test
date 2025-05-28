package com.songjae.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.songjae.spring.test.mybatis.domain.Real_estate;

@Mapper
public interface Real_estateRepository {
	
	// id에 따른 행 가져오기 
	// int id로 서비스에서 넘여준 인자 값을 받아온다
	// @Param("")은 서비스로 부터 받아온 인자를 xml에서 사용할 이름
	public Real_estate selectReal_estate(@Param("id") int id);

	public List<Real_estate> selectReal_estateRent(@Param("rent") int rent);

	public List<Real_estate> selectReal_estateRentComplexConditions(@Param("area") int area,
			@Param("price") int price);
	
	public int insertReal_estateObject(Real_estate real_estate);
	
	// xml에서 쓸 이름과 서비스로 부터 인자가 담겨지는 매개변수명이 같을 필요는 없다
	public int insertReal_estateParameter(@Param("realtorId") int realtorId, 
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") int rentPrice);
	
	public int updateReal_estate(Real_estate real_estate);

	public int deleteReal_estate(@Param("id") int id);
}
