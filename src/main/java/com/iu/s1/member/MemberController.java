package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;//컨트롤러는 서비스에 대해 의존적이다
	//객체를 넣는다 =inject



	//memberJoin print //url /member/memberLogin


	@RequestMapping(value="/member/memberLogin")
	public String memberLogin(/* String name, int age */) {

		System.out.println("히히");
		//		String name = request.getParameter("name");
		//		int age = Integer.parseInt(request.getParameter("age"));
//
//		System.out.println(name);
//		System.out.println(age);
		return "member/memberLogin";
	}


	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, ModelAndView modelAndView /*Model model*/)throws Exception{

		System.out.println("확인확인");

//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("pw"));
//
//		MemberDTO memberDTO= new MemberDTO();
//		memberDTO.setId(request.getParameter("id"));
//		memberDTO.setPw(request.getParameter("pw"));

		memberDTO =memberService.memberLogin(memberDTO );
		

		
//		request.setAttribute("dto", memberDTO);
		//request 없이 jsp로 데이터를 보내는 Model 데이터를 운반하는 용도 데이터를 보내면 사라짐 리스폰스랑 같이 사라짐
		model.addAttribute("dto", memberDTO);
		
		String str = "";
		if(memberDTO !=null) {
			str="member/memberPage";
		}else {
			str="member/memberLogin";
		}

		return str;
	}
	@RequestMapping(value="/member/memberJoin")
	public String memberJoin(/* String id, String pw */) {
		
//		System.out.println(id);
//		System.out.println(pw);
		
		return "member/memberJoin";
	}
	@RequestMapping(value="member/memberJoin", method=RequestMethod.POST)//데이터베이스 셀렉트이고
	public void memberJoin(MemberDTO memberDTO) throws Exception{//이러면 꺼낼 필요가 없으니까 위에꺼랑 다르게!!

		
		int result = memberService.memberJoin(memberDTO);
		System.out.println(result);
		
//		return "/home"; void였넹,,ㅎ
	}


}
