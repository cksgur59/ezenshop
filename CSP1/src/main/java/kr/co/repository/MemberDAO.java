package kr.co.repository;

import org.springframework.stereotype.Repository;

import kr.co.vo.MemberVO;


@Repository
public interface MemberDAO {

	public void memberJoin(MemberVO vo);
	
	
}
