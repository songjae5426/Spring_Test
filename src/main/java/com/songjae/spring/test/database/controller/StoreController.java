package com.songjae.spring.test.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songjae.spring.test.database.domain.Store;
import com.songjae.spring.test.database.service.StoreService;

@Controller
public class StoreController {
	@Autowired
	private StoreService storeService;
	
	// 가게 정보를 모두 reqsponse에 담는다
	@RequestMapping("db/store/list")
	@ResponseBody
	public List<Store> storeList() {
		// 가게 정보 목록 얻어 오기
		return storeService.getStoreList();
	}
}
