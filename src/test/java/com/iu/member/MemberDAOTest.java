package com.iu.member;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.iu.file.MemberFileDAO;
import com.iu.file.MemberFileDTO;
import com.iu.s6.AbtractTest;

public class MemberDAOTest extends AbtractTest{
	@Inject
	private MemberDAO memberDAO;
	
	@Inject
	private MemberFileDAO memberFileDAO;
	
	@Test
	public void loginTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("t1");
		memberDTO.setPw("t1");
		memberDTO= memberDAO.getSelect(memberDTO);
		System.out.println(memberDTO.getEmail());
		System.out.println(memberDTO.getMemberFileDTO().getFname());
	}
	
	//@Test
	public void test() throws Exception {
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId("iu");
		memberFileDTO.setFname("fname");
		memberFileDTO.setOname("oname");
		int result = memberFileDAO.setWrite(memberFileDTO);
		assertEquals(1, result);
		
	}

}
