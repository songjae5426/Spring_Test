package com.songjae.spring.test.lifecycle;

import com.songjae.spring.test.database.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Controller {

    private final StoreService storeService;

    Test03Controller(StoreService storeService) {
        this.storeService = storeService;
    }
	
	@RequestMapping("/lifecycle/test03")
	public String thymeleafOutput() {
		return "lifecycle/test03";
	}
}
