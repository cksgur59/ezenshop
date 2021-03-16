package kr.co.service;

import kr.co.vo.MemberVO;

public interface MemberService {

	public void memberJoin(MemberVO vo);

	public int idCheck(String id);
	
}
