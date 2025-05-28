package com.songjae.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songjae.spring.test.mvc.domail.Seller;
import com.songjae.spring.test.mvc.service.SellerService;

@Controller
@RequestMapping("/mvc/seller")	// 공통 url
public class SellerController {


	@Autowired
	private SellerService sellerService;


	// 판매자 등록
	// post로 설정
//	1번 @RequestMapping(path="mvc/seller/creat", method=RequestMethod.POST)
//	2번 @PostMapping("/mvc/seller/create") * 주로 이걸로 사용 *
// 	아무것도 안하면 get으로 기본값
//	이메일은 길기 때문에 post
//	@RequestMapping(path="mvc/seller/creat", method=RequestMethod.POST)
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("nickname") String nickcame,
			@RequestParam("temperature") double temperature,
			@RequestParam("profileImage") String profileImage) {
		int count = sellerService.addSeller(nickcame, temperature, profileImage);
		return "redirect:/mvc/seller/info";		// redirect:주소 => 해당 주소로 리다이렉트 시킨다 클라이언트가 다시 요청 (만약 redirect:를 써주지 않으면 해당주소에서 html파일을 찾으려고한다)
	}
	
	// 입력페이지 접속
	// post로 url로 접속이 불가능하다
	@GetMapping("/input")
	public String sellerInput() {
		return "mvc/seller/input";
	}
	
	// 판매자 정보 페이지 접속
	// 서블릿에서는 파라미터가 없으면 그냥 null로 들어갔지만 스프링에서는 필수 파라미터로 파라미터가 없으면 오류가 뜬다
	// 그래서 스프링에서는 필수파리미터를 꺼줘야한다
	// @RequestParam(value="id", required=false)	=> required=false : 필수파리미터 끄기(파라미터가 없으면 null로 넘어온다), required=true :필수파라미터로 설정
	// 그렇기 때문에 파라미터의 값을 int id로 받으면 오류가 발생한다 => 기본타입은 null을 저장하지 못하기 때문에
	@GetMapping("/info")
	public String sellerInfo(
			@RequestParam(value="id", required=false) Integer id,
			Model model) {
		Seller seller = null;
		// 재사용성
		if(id == null) {
			seller = sellerService.getLastSeller();
		}else {
			seller = sellerService.getSellerById(id);
		}
		
		model.addAttribute("seller", seller);
		return "mvc/seller/sellerInfo";
	}
	
	
	
	
//	// 입력받는 페이지 반환
//	@RequestMapping("test01/seller/addPage")
//	public String sellerAddPage() {
//		return "mvc/sellerInput";
//	}
//
//	// 입력하면 from태그가 이 메소드로 연결되어 insert하고 가장 최근에 등록한 사용자 정보를 보여주는 페이지의 메소드로 리다이렉트하게함
//	@RequestMapping("test01/seller/add")
//	public String sellerAdd(@RequestParam("nickName") String nickName,
//			@RequestParam("profileImgUrl") String profileImgUrl, @RequestParam("temperature") double temperature) {
//		// seller추가 기능
//		Seller seller = new Seller();
//		seller.setNickname(nickName);
//		seller.setProfileImage(profileImgUrl);
//		seller.setTemperature(temperature);
//		sellerService.addSeller(seller);
//
//		return "redirect:/mvc/test02/seller/lastSellerInfo"; // redirect:을 앞에 붙이면 해당 주소로 리다이렉트(클라이언트가 다시 요청한다)
//	}
//
//	// 가장 최근에 등록한 상요자 정보를 보여주는 페이지
//	@RequestMapping("test02/seller/lastSellerInfo")
//	public String lastSeller(Model model) {
//		model.addAttribute("sellerInfo", sellerService.getLastSeller());
//
//		return "mvc/inputSellerInfo"; // html파일 경로
//	}
//
//	@RequestMapping("test03/seller/searchId")
//	public String idSearchSeller(Model model, @RequestParam("id") int id) {
//		model.addAttribute("sellerInfo", sellerService.searchSellerId(id));
//
//		return "mvc/inputSellerInfo";
//	}

}
