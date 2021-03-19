package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;



@Controller
public class BankBookController {
	@Autowired
	private BankBookService bankbookService;
	
	//리스트@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@RequestMapping(value = "/bankbook/bankbookList")
	public void getList(Model model) throws Exception{
//		ModelAndView modelAndView = new ModelAndView();
		
		List<BankBookDTO> ar =bankbookService.getList();
		
		model.addAttribute("list", ar);
		model.addAttribute("kind", "Bankbook");
//		modelAndView.setViewName("bankbook/bankbookList"); void로 할거니까 따로 담을 필요가 없잖아 그래서 그냥 모델을 매겨변수로 받아와서 하는거지 ㅇㅇ
		//뷰네임 안적어도 되긴한데 혹시 모르니까 걍 적어라 ㅇㅇ
//		return modelAndView;
	}
	
	//상세 정보@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@RequestMapping(value= "/bankbook/bankbookSelect")
	public ModelAndView getSelect(BankBookDTO bankBookDTO, ModelAndView modelAndView /* , Model model 써도 됨 왜냐면 viewName을 쓸 필요가 없으니까*/) throws Exception{
		//ModelAndView modelAndView = new ModelAndView();
		
		bankBookDTO=bankbookService.getSelect(bankBookDTO);
		modelAndView.addObject("select",bankBookDTO);
		modelAndView.setViewName("bankbook/bankbookSelect");
				
		return modelAndView;
	}
	
	//더하기@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@RequestMapping(value = "/bankbook/bankbookAdd")
	public void setAdd() throws Exception{
		
	}
	
	@RequestMapping(value = "/bankbook/bankbookAdd", method=RequestMethod.POST)
	public ModelAndView setAdd(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		int result = bankbookService.setAdd(bankBookDTO);
		System.out.println("Add: "+result);
		
		modelAndView.setViewName("redirect:bankbook/bankbookList");
		return modelAndView;
	}
	
	//업데이트@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@RequestMapping(value = "/bankbook/bankbookUpdate")
	public void setUpdate() throws Exception{
		
	}
	
	@RequestMapping(value = "/bankbook/bankbookUpdate", method = RequestMethod.POST)
	public ModelAndView setUpdate(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		int result = bankbookService.setUpdate(bankBookDTO);
		System.out.println("Update: "+result);
		modelAndView.setViewName("redirect: bankbook/bankbookList");
		
		return modelAndView;
	}
	//삭제@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@RequestMapping(value = "/bankbook/bankbookDelete")
	public ModelAndView setDelete(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect: bankbook/bankbookList");
		
		return modelAndView;
	}
	
	
	
}
