package com.songjae.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songjae.spring.test.mybatis.domain.Real_estate;
import com.songjae.spring.test.mybatis.service.Real_estateService;

@Controller
public class Real_estateController {

	@Autowired
	private Real_estateService real_estateService;
	
	@RequestMapping("/mybatis/test01/1")
	@ResponseBody
	public Real_estate real_estate(@RequestParam("id") int id) {
		return real_estateService.getReal_estate(id);
	}
	
	@RequestMapping("/mybatis/test01/2")
	@ResponseBody
	public List<Real_estate> real_estateRentPrice(@RequestParam("rent") int rent){
		return real_estateService.getReal_estateRent(rent);
	}
	
	@RequestMapping("/mybatis/test01/3")
	@ResponseBody
	public List<Real_estate> real_estateComplexConditions(@RequestParam("area")int area, @RequestParam("price") int price){
		return real_estateService.getReal_estateComplexConditions(area, price);
	}
}
