package kr.co.service;

import kr.co.vo.MemberVO;

public interface MemberService {

	public void memberJoin(MemberVO vo);

	public int idCheck(String id);
	
	/* 로그인 */
    public MemberVO memberLogin(MemberVO member) throws Exception;

	
}
