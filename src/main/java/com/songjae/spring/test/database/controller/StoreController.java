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
	
	@ResponseBody
	@RequestMapping("/db/test01")
	public List<Store> selectStore() {
		return storeService.getStore();
	}
}
