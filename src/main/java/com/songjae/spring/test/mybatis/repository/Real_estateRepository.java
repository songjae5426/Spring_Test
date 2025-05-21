package com.songjae.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.songjae.spring.test.mybatis.domain.Real_estate;

@Mapper
public interface Real_estateRepository {
	// id에 따른 행 가져오기
	public Real_estate selectReal_estate(@Param("id") int id);

	public List<Real_estate> selectReal_estateRent(@Param("rent") int rent);

	public List<Real_estate> selectReal_estateRentComplexConditions(@Param("area") int area, @Param("price") int price);
}
