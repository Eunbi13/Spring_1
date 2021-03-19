package com.iu.s1.member;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
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


	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)				//Model은 여기서만 가능하다 추상클래스라서 new를 사용해서 선언 불가능
	public ModelAndView memberLogin(MemberDTO memberDTO/* , ModelAndView modelAndView */ /*Model model*/)throws Exception{
		
		System.out.println("확인확인");

//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("pw"));
//
//		MemberDTO memberDTO= new MemberDTO();
//		memberDTO.setId(request.getParameter("id"));
//		memberDTO.setPw(request.getParameter("pw"));

		memberDTO =memberService.memberLogin(memberDTO );
		
		ModelAndView modelAndView = new ModelAndView();//얘는 그냥 new 선언해서 생성 가능
		
//		request.setAttribute("dto", memberDTO);
		//request 없이 jsp로 데이터를 보내는 Model 데이터를 운반하는 용도 데이터를 보내면 사라짐 리스폰스랑 같이 사라짐
		/* model.addAttribute("dto", memberDTO); */
		modelAndView.addObject("dto", memberDTO);
		modelAndView.setViewName("member/memberPage");//스트링을 리턴도 실제로 전송되는거 ㅇㅇ
		
//		String str = "";
//		if(memberDTO !=null) {
//			str="member/memberPage";
//		}else {
//			str="member/memberLogin";//얘가 뷰 객체에 담긴데,,,!
//		} 우리가 이거 보내도 스트링이 모델앤뷰타입으로 리턴이 됨 그냥 편의상에도 가능하다 

		return modelAndView;
	}
	@RequestMapping(value="/member/memberJoin")
	public void memberJoin(/* String id, String pw */) {
		
//		System.out.println(id);
//		System.out.println(pw);
		
	}
	@RequestMapping(value="member/memberJoin", method=RequestMethod.POST)//데이터베이스 셀렉트이고
	public void memberJoin(MemberDTO memberDTO) throws Exception{//이러면 꺼낼 필요가 없으니까 위에꺼랑 다르게!!

		
		int result = memberService.memberJoin(memberDTO);
		System.out.println(result);
		
//		return "/home"; void였넹,,ㅎ
	}


}
