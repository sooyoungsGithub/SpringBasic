package org.soo.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.soo.domain.MemberVO;
import org.soo.persistence.MemberDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		
		System.out.println(dao.getTime());
		
	}
	
	@Test
	public void testInsertMember() throws Exception {

		MemberVO vo = new MemberVO();
		vo.setUserid("user04");
		vo.setUserpw("user04");
		vo.setUsername("USER04");
		vo.setEmail("user04@aaa.com");
		
		dao.insertMember(vo);

	}
	
	
	
}
