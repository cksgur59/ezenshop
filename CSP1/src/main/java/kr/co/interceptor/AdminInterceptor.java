package kr.co.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.co.vo.MemberVO;

public class AdminInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/* 관리자 페이지 진입 전 관리자 권한 확인 인터셉터 */
		System.out.println("admininterceptor진입");
		HttpSession session = request.getSession(); // 세션 획득
		
		MemberVO lvo = (MemberVO)session.getAttribute("member"); // lvo에 'member' 세션 대입
		
		if (lvo == null || lvo.getAdmin() == 0) { // 관리자 계정이 아닐 경우
			
			response.sendRedirect("/home"); // 홈으로 리다이렉트
			
			return false;
		}
		
		return true; // 관리자 계정 로그인인 경우
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
