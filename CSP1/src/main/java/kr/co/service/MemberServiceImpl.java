package kr.co.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.repository.MemberDAO;
import kr.co.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	
	@Inject
	private MemberDAO memberDao;
	
	@Override
	public void memberJoin(MemberVO vo) {
		
		memberDao.memberJoin(vo);
	}

	@Override
	public int idCheck(String id) {
		// TODO Auto-generated method stub
		return memberDao.idCheck(id);
	}

}
