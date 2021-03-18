package com.iu.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //
public class MemberService {

	//디에이오의 객체가 필요해서 선언하는것
	@Autowired
	private MemberDAO memberDAO;//서비스는 DAO에 대해 의존적이다ㅣ.
	
	

	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		
		memberDTO = memberDAO.login(memberDTO);
		
		
		return memberDTO;
	}
	
	public int memberJoin()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		int result = memberDAO.join(memberDTO);
		
		return result;
	}
	
}
