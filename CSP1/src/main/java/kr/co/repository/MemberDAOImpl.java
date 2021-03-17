package kr.co.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	
	private final String NS = "kr.co.member";

	@Override
	public void memberJoin(MemberVO vo) {
		
		sqlSession.insert(NS+".memberJoin", vo);
		
	}

	@Override
	public int idCheck(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".idCheck", id);
	}
	
	
	
}
