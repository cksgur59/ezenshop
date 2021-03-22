package kr.co.controller;

import java.util.Random;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.service.MemberService;
import kr.co.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService memberService;
	
	@Inject
	private JavaMailSender mailSender;
	
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
			System.out.println("중복");
			return "fail";
		}else {
			System.out.println("가능");
			return "success";
		}
	}
	
	// 이메일 인증
	@ResponseBody
	@RequestMapping(value = "/mailCheck",method = RequestMethod.GET)
	public String mailCheckGET(String email) {
		
		System.out.println("인증번호 : "+email);
		
		/* 인증번호 생성 */
		Random random = new Random();
		int checkNum = random.nextInt(888888)+111111;
		System.out.println(checkNum);
		
		/* 이메일 보내기 */
		String setFrom = "cksgur5959@naver.com";
        String toMail = email;
        String title = "회원가입 인증 이메일 입니다.";
        String content = 
                "홈페이지를 방문해주셔서 감사합니다." +
                "<br><br>" + 
                "인증 번호는 " + checkNum + "입니다." + 
                "<br>" + 
                "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";
        
        try {
            
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
            helper.setFrom(setFrom);
            helper.setTo(toMail);
            helper.setSubject(title);
            helper.setText(content,true);
            mailSender.send(message);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        String num = Integer.toString(checkNum);
        return num;
	}
	
	/* 로그인 */
	@ResponseBody
    @RequestMapping(value="login", method=RequestMethod.GET)
    public String loginGET(MemberVO member, RedirectAttributes rttr) throws Exception{

		System.out.println(member);
    	MemberVO lvo = memberService.memberLogin(member);
    	System.out.println(lvo);
    	if(lvo == null) {    // 일치하지 않는 아이디, 비밀번호 입력 경우
            
            int result = 0;
            rttr.addFlashAttribute("result", result);
            return "fail";
            
        }
        return "success";

    }
	/* 로그인 */
    @RequestMapping(value="login.do", method=RequestMethod.POST)
    public String loginPOST(HttpServletRequest request, MemberVO member, RedirectAttributes rttr) throws Exception{

		HttpSession session = request.getSession();
    	MemberVO lvo = memberService.memberLogin(member);
    	
    	session.setAttribute("member", lvo); // 로그인 성공
    	
        return "redirect:/home";

    }
	
    /* 로그아웃 */
    @RequestMapping(value="logout", method=RequestMethod.GET)
    public String logoutGET(HttpServletRequest request) throws Exception{
    	
    	HttpSession session = request.getSession();
    	
    	session.invalidate();
    	
        return "redirect:/home";
    }

}
