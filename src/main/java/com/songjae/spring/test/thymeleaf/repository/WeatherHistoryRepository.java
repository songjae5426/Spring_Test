package com.songjae.spring.test.thymeleaf.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.songjae.spring.test.thymeleaf.domain.WeatherHistory;

@Mapper
public interface WeatherHistoryRepository {
	public List<WeatherHistory> selectWeatherHistory();

	public int insertWeather(
			  @Param("date") LocalDate date	// 2025-05-30	// myBatis는 LocalDate타입의 객체를 알아서 변환해서 db에 넣어줌
			, @Param("weather") String weather
			, @Param("microDust") String microDust
			, @Param("temperatures") double temperatures
			, @Param("percipitation") double percipitation
			, @Param("windSpeed") double windSpeed);

	public int insertWeatherByObject(WeatherHistory weather);
}
