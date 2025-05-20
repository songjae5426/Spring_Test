package com.songjae.spring.test.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.songjae.spring.test.database.domain.Store;

@Mapper
public interface StoreRepository {
	
	public List<Store> selectStore();
}
