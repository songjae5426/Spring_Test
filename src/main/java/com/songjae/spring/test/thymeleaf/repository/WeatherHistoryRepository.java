package com.songjae.spring.test.thymeleaf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.songjae.spring.test.thymeleaf.domain.WeatherHistory;

@Mapper
public interface WeatherHistoryRepository {
	public List<WeatherHistory> selectWeatherHistory();
}
