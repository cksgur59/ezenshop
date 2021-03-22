package kr.co.repository;

import kr.co.vo.MemberVO;

public interface MemberDAO {

	public void memberJoin(MemberVO vo);

	public int idCheck(String id);

	public MemberVO memberLogin(MemberVO member);
	
	
}
