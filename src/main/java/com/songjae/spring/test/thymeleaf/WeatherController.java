package com.songjae.spring.test.thymeleaf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songjae.spring.test.thymeleaf.domain.WeatherHistory;
import com.songjae.spring.test.thymeleaf.service.WeatherHistoryService;

@Controller
@RequestMapping("/weather/")
public class WeatherController {
	
	@Autowired
	private WeatherHistoryService weatherHistoryService;
	
	// 날씨
	@GetMapping("/show")
	public String test04(Model model) {
		model.addAttribute("wearherHistoryList", weatherHistoryService.getWeatherHistory());
		return "thymeleaf/test04.html";
	}
	
	// 날씨 정보 입력 페이지 제공
	@GetMapping("/input/page")
	public String test04InputPage() {
		return "thymeleaf/test04-input.html";
	}
	
	// 입력페이지에서 전달받은 데이터 저장기능
	@GetMapping("/input")
	public String test04Input(
			// MySql에서는 Date를 입력받을떄 'yyyy-mm-dd'로 특정한 문자열 형식으로 입력 받는다 그렇기 떄문에 String으로 넘겨도되지만 날짜데이터만 규격화되어있는 Date관련 객체를 쓰는게 좋다
			// 기본적으로 자바의 Date관련 메소드(LocalDate등)는 "yyyy-MM-dd"로 특정 문자열 형식으로 입력받아야 날짜를 인식함
			// @DateTimeFormat(pattern="yyyy년 M월 d일")으로 지정한 형식의 문자열이 입력되면 자동으로 yyyy-MM-dd형식으로 바꿔서 인식하여 자바의 Date객체에 넣어줌
//			@DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date	// 2025-05-30
//			, @RequestParam("weather") String weather
//			, @RequestParam("microDust") String microDust
//			, @RequestParam("temperatures") double temperatures
//			, @RequestParam("percipitation") double percipitation
//			, @RequestParam("windSpeed") double windSpeed
			@ModelAttribute WeatherHistory weather) {
			// @ModelAttribute 엔터티클래스타입 변수명 => 파라미터로 받아온 값들을 엔터티 클래스에 자동으로 set해준다 => 파라미터 이름과 엔터티클래스의 필드이름이 같은 값끼리 매칭해서 저장함
		
		//int count = weatherHistoryService.addWeatherHistory(date, weather, microDust, temperatures, percipitation, windSpeed);
		
		weatherHistoryService.addWeatherHistoryByObject(weather);
		
		return "redirect:/weather/show";	// 클라이언트가 해당 주소로 다시 요청
	}
}
