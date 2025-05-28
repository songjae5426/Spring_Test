package com.songjae.spring.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Controller {

	// Thymeleaf 파일을 접속 할때는 @Responsebody 어노테이션은 없어야 한다 단순히 경로를 연결하는거기때문에
	// Thymeleaf는 자바 라이브러리로 TEXT, HTML, XML javascript, CSS를 생성할 수 있는 템플릿 엔진이다
	// Thymeleaf파일의 확장자는 html로 하고 src/main/resources 폴더 안에 templates 패키지 안에 만든다
	@RequestMapping("/lifecycle/test03")
	public String thymeleafOutput() {
		return "lifecycle/test03";	// Thymeleaf 파일 경로 (src/main/resources폴더 , templates폴더 제외하고 파일 확장자도 제외한 경로)
	}
}
