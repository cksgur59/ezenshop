package kr.co.mapper;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.repository.MemberDAO;
import kr.co.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	MemberDAO dao;
	
	@Test
	public void memberJoin(){
		MemberVO member = new MemberVO();
		
		member.setId("test");
		member.setPw("test");
		member.setName("test");
		member.setEmail("test");
		member.setAddress("test");
		member.setAdmin(0);
		member.setMoney(0);
		member.setPoint(0);
		
		System.out.println(member);
		
		dao.memberJoin(member);
	}
	
}
