package com.songjae.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.songjae.spring.test.mvc.domail.Realtor;

@Mapper
public interface RealtorRepository {
	
	// 입력받은 값으로 공인중개사 insert
	public int insertRealtor(Realtor realtor);
		
}
