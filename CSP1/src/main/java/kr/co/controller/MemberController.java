package kr.co.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.service.MemberService;
import kr.co.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService memberService;
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public void memberJoinGET() {
		logger.info("회원가입 페이지 진입");
	}
	
	// 회원가입 입력및 실행
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoinPOST(MemberVO vo) {
		logger.info("회원가입 진행");
		
		memberService.memberJoin(vo);
		
		return "redirect:/";
	}
	
	// 아이디 중복 체크
	@ResponseBody
	@RequestMapping(value = "/memberIdCheck",method = RequestMethod.POST)
	public String memberIdCheck(String id) {

		int result = memberService.idCheck(id);
		
		if(result != 0) {
			return "fail";
		}else {
			return "success";
		}
	}
	
	
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public void login() {
		
		
		
	}
	
}
