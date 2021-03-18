package com.iu.s1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParameterController {
	@RequestMapping(value="/param/param1")
	public String paramTest() {
		
		return "param/param1";
	}
	@RequestMapping (value="/param/param1", method=RequestMethod.POST)
	public void paramTest2(@RequestParam(defaultValue = "100") int p, String p2, String p3, String p4, String p5, String [] p6) {//무슨 타입인지 잘모겠을 때는 일단 String으로 받고 잘 알겠으면 맞게 입력하기
		//value="p1",만약 String p1이 아니라 p만 써야한다면 이렇게 하기.,,,p1으로 넘어오는 파라미터 이름을 p로 여겨달라..
		//defaultValue = "100"아무런 값이 안들어왔을 때를 대비해서 디폴트 값 해두기,,
		System.out.println(p);
		System.err.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);//그냥 String으로 하면 하나의 이름에 여러개 값이 옴,,아하 스플릿,,,하는 방법이 있지만 배열로 하라
		for(int i =0; i<p6.length; i++) {
			System.out.println(p6[i]);
		}
		
	}
	
	
}
