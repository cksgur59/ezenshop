package kr.co.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public void memberJoinGET() {
		logger.info("회원가입 페이지 진입");
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public void login() {
		
	}
	
}
