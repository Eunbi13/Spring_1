package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	private BankBookDAO bankBookDAO;
	
	public List getList() throws Exception{
	
		List<BankBookDTO> ar=bankBookDAO.getList();
		
		return ar;
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception{
		
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		
		return bankBookDTO;
	}
	
	public void setUpdate() throws Exception{
		
	}
	
	public void setAdd()throws Exception{
		
	}
	
	public void delete()throws Exception{
		
	}
	
}
