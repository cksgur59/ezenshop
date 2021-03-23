package kr.co.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String boardHomeGET() {
		
		logger.info("메인 페이지 진입");
		
		System.out.println("boardcontroller 진입");
		
		return "board/home";
	}
	
	
	@RequestMapping(value = "/join" , method = RequestMethod.GET)
	public String boardMemberJoinGET() {
		
		logger.info("메인 페이지 진입");
		
		System.out.println("boardcontroller 진입");
		
		return "member/memberJoin";
	}
	
	@RequestMapping(value = "/man",method = RequestMethod.GET)
	public String boardManGET() {
		return "board/man";
	}
	
	@RequestMapping(value = "/woman",method = RequestMethod.GET)
	public String boardWomanGET() {
		return "board/woman";
	}
	
	@RequestMapping(value = "/fakesocks",method = RequestMethod.GET)
	public String boardfakesocksGET() {
		return "board/fakesocks";
	}
	
	@RequestMapping(value = "/babyKids",method = RequestMethod.GET)
	public String boardBabyKidsGET() {
		return "board/babyKids";
	}
	
	@RequestMapping(value = "/kneeStocking",method = RequestMethod.GET)
	public String boardKneeStockingGET() {
		return "board/kneeStocking";
	}
	
	@RequestMapping(value = "/acc",method = RequestMethod.GET)
	public String boardAccGET() {
		return "board/acc";
	}
	
	@RequestMapping(value = "/notice",method = RequestMethod.GET)
	public String boardNoticeGET() {
		return "board/notice";
	}
}
