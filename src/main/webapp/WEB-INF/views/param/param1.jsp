<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Param Test Page</h1>

	<form action="./param1" method="post">
		<p>
			p1<input type="text" name="p1" value="">
			<!-- 원래 벨류에 저장되서 이름과벨류가 같이 가는거임 -->
			<!-- //서버로 넘길때 중요한 속성이 파라미너 이름 이 이름은 DTO맴버변수와 이름 이 같아야 하고, 데이터 베이스 테이블 컬럼명과 동일하게 -->
		</p>
		<p>
			p2<input type="date" name="p2">
		</p>

		<p>
			p3<input type="color" name="p3">
		</p>

		<p>
			p4<select name="p4">
				<option value="k">KT</option>
				<option value="s">SKT</option>
				<option value="l">LG</option>
				<!-- value=""이렇ㄱ데 다른 값을 파라미터를 통해 보낼 수도 잇다. -->
			</select>
		</p>

		<p>
			kt <input type="radio" name="p5" value="kt"> 
			skt <input type="radio" name="p5" value="skt"> 
			lg <input type="radio" name="p5" value="lg"><!-- 이 벨류값이 없다면 파라미터가 넘어갈때 on만 옴,,
			그냥 선택되었다 란 뜻의 on임 뭐가 넘어오는지 개발자가 알수 있도록 벨류 값을 넣음  -->
		</p>
		
		<p>
			kt <input type="checkbox" name="p6" value="kt"> 
			skt <input type="checkbox" name="p6" value="skt"> 
			lg <input type="checkbox" name="p6" value="lg">
		</p>


		<button>submit</button>

	</form>
</body>
</html>