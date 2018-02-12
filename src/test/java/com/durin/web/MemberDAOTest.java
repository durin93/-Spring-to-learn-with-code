package com.durin.web;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.durin.dao.MemberDAO;
import com.durin.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	

	@Test
	public void testTime()throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember()throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setUsername("USER000");
		vo.setEmail("user000@aaa.com");
		
		dao.insertMember(vo);
		
	}
	
}
