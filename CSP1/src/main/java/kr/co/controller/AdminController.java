package kr.co.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	/* 관리자 메인 페이지 이동 */
    @RequestMapping(value="main", method = RequestMethod.GET)
    public void adminMainGET(){
        
    	
        
    }

	
}
