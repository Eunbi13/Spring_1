package com.iu.s1.bankbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;



@Controller
public class BankBookController {

	private BankBookService bankbookService;
	
	@RequestMapping(value = "/bankbook/bankbookList")
	public ModelAndView getList() throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list", mv);
		mv.setViewName("/bankbook/bankbookList");
		
		return mv;
	}
	
	//이건 내가 그,,, 클릭한거임 내가 볼 통장을
	@RequestMapping(value= "/bankbook/bankbookSelect", method = RequestMethod.POST)
	public ModelAndView getSelect(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		bankBookDTO=bankbookService.getSelect(bankBookDTO);
		mv.addObject("list",bankBookDTO);
		mv.setViewName("/bankbook/bankbookSelect");
				
		return mv;
	}
	
	@RequestMapping(value = "")
	public void setAdd() throws Exception{
		
	}
	
	@RequestMapping(value = "")
	public void setUpdate() throws Exception{
		
	}
	
	@RequestMapping(value = "")
	public void delete() throws Exception{
		
	}
	
	
	
}
