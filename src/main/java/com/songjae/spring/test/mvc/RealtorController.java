package com.songjae.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.songjae.spring.test.mvc.domail.Realtor;
import com.songjae.spring.test.mvc.service.RealtorService;

@Controller
@RequestMapping("/mvc/realtor")
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;
	
	// 공인중개사 추가 화면 
	@GetMapping("/addScreen")
	public String realtorAddScreen() {
		return "mvc/realtor/realtorInput";
	}
	
	// 공인 중개사 추가
	@PostMapping("/add")
	public String realtorAdd(@RequestParam("name") String name
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("rating") String rating
			, Model model) {
		Realtor realtor = new Realtor();	// xml에서 insert쿼리를 수행후 이 realtor객체에 setter로 id(기본키)값을 넣어줌
		realtor.setOffice(name);
		realtor.setPhoneNumber(phoneNumber);
		realtor.setAddress(address);
		realtor.setGrade(rating);
		int count = realtorService.addRealtor(realtor);
		
		model.addAttribute("realtor", realtor);
		return "/mvc/realtor/realtorInfo";
	}
	
}
