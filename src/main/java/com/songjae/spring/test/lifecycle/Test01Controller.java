package com.songjae.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {
	
	// String 출력하기
	@RequestMapping("/lifecycle/test01/1")
	@ResponseBody
	public String outPut() {
		return ""
				+ "<html>\n"
				+ "	<head>\n"
				+ "		<title>String 출력하기</title>\n"
				+ "	</head>\n"
				+ "	<body>\n"
				+ "		<h1>테스트 프로젝트 완성!</h1>\n"
				+ "		<b>해당 프로젝트를 통해서 문제풀이를 진행합니다!</b>\n"
				+ "	</body>\n"
				+ "</html>";
	}
	
	// json데이터 출력
	@RequestMapping("/lifecycle/test01/2")
	@ResponseBody
	public Map<String, Integer> jsonOutput(){
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		return map;
	}
}
