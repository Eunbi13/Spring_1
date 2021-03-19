<%@page import="com.iu.s1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% MemberDTO memberDTO= (MemberDTO)request.getAttribute("dto"); %> <!-- 모델에 담았을 때도 리퀘스트에 담은 거 마냥 제대로 웹페이지에 떳음 
    모델로 보낸 것은 리퀘스트에서 보낸거와 동일하다-->
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Page</h1>
	
	<h1>email: <%=memberDTO.getEmail() %></h1>
	
	
	
</body>
</html>