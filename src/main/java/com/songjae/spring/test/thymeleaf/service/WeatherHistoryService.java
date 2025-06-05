package com.songjae.spring.test.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.test.thymeleaf.domain.WeatherHistory;
import com.songjae.spring.test.thymeleaf.repository.WeatherHistoryRepository;

@Service
public class WeatherHistoryService {
	@Autowired
	private WeatherHistoryRepository weatherHistoryRepository;
	
	// 날씨 정보 리스트를 가져오는 메소드
	public List<WeatherHistory> getWeatherHistory(){
		List<WeatherHistory> weatherHistoryList = weatherHistoryRepository.selectWeatherHistory();
		
		// 넘어온 데이터를 바탕으로 화면을 만드는거기 때문에 뷰에서 해결
//		for(WeatherHistory weatherHistory : weatherHistoryList) {
//			switch (weatherHistory.getWeather()) {
//			case "비": 
//				weatherHistory.setWeather("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//				break;
//			case "흐림":
//				weatherHistory.setWeather("http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg");
//				break;
//			case "맑음":
//				weatherHistory.setWeather("http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg");
//				break;
//			case "구름조금":
//				weatherHistory.setWeather("http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg");
//			}
//			
//		}
		return weatherHistoryList;
	}
}
