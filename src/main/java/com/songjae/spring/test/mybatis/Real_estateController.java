package com.songjae.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.songjae.spring.test.SpringTestApplication;
import com.songjae.spring.test.mybatis.domain.Real_estate;
import com.songjae.spring.test.mybatis.service.Real_estateService;

@Controller
@RequestMapping("/mybatis")
public class Real_estateController {

    private final SpringTestApplication springTestApplication;

	@Autowired
	private Real_estateService real_estateService;

    Real_estateController(SpringTestApplication springTestApplication) {
        this.springTestApplication = springTestApplication;
    }
	
	// id로 select해서 json으로 출력하기
	@RequestMapping("/test01/1")
	@ResponseBody
	// id라는 name의 request Parameter를 가져와 int id매개변수에 인자로 넘겨준다 
	public Real_estate real_estate(@RequestParam("id") int id) {
		return real_estateService.getReal_estate(id);
	}
	
	@RequestMapping("/test01/2")
	@ResponseBody
	public List<Real_estate> real_estateRentPrice(@RequestParam("rent") int rent){
		return real_estateService.getReal_estateRent(rent);
	}
	
	@RequestMapping("/test01/3")
	@ResponseBody
	public List<Real_estate> real_estateComplexConditions(@RequestParam("area")int area, @RequestParam("price") int price){
		return real_estateService.getReal_estateComplexConditions(area, price);
	}
	
	@RequestMapping("/test02/1")
	@ResponseBody
	public String real_estateObjectInsert() {
		Real_estate real_estate = new Real_estate();
		real_estate.setRealtorId(3);
		real_estate.setAddress("푸르지용 리버 303동 1104호");
		real_estate.setArea(89);
		real_estate.setType("매매");
		real_estate.setPrice(100000);
		int count = real_estateService.setReal_estateObjectInsert(real_estate);
			
		return "입력성공 : " + count;
	}
	
	@RequestMapping("/test02/2")
	@ResponseBody
	public String real_estateParameter(@RequestParam("realtorId") int realtorId) {
		int count = real_estateService.setReal_estateParameter(realtorId, 
				"썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		return "입력 성공 : " + count;
		
	}
	
	@RequestMapping("/test03/1")
	@ResponseBody
	public String real_estateUpdate() {
		Real_estate real_estate = new Real_estate();
		real_estate.setId(22);
		real_estate.setType("전세");
		real_estate.setPrice(7000);
		return "수정 성공 : " + real_estateService.updateReal_estate(real_estate);
	}
	
	@RequestMapping("/test03/2")
	@ResponseBody
	public String real_estateDelete(@RequestParam("id") int id) {
		return "삭제 성공 : " + real_estateService.deleteReal_estate(id);
	}
	
}
