<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="./bankbook/bankbookList.do">BankBook</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="./member/memberJoin.do"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="./member/memberLogin.do"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>
	
	
	<div class="container">
		<div class="row">
			<h1>BankBookList</h1>

			<!-- 반복문테이블에 넣을거라고? -->
			<table class="table table-hover">
				<thead>
					<tr>
						<!-- 한개의 로우입니다. -->
						<th>BookName</th>
						<!-- 제목일땐 th쓰자 -->
						<th>Rate</th>
						<th>Sal</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${requestScope.list}" var="dto"><!-- var= 변수명을 dto로 하자 리스트에서 하나 꺼내서 dto에 담겠다 향상된 for문 -->
					<!-- 반복의 시작  -->
					<tr>
						<!-- 리스트에 있는 만큼 돌려야 하니까 반복문 필요 -->
						<td><a href="./bankbookSelect?bookNum=${dto.bookNum}" >${pageScope.dto.bookName}</a></td><!-- 메서드이름 써도 되고 이케 이름만 써도 되고 -->
						<td>${dto.rate }</td>
						<td>${dto.sal }</td>
					</tr>
					<!-- 반복의 끝 -->
					</c:forEach>
				</tbody>

			</table>

			
			<a href="./bankbookAdd" class="btn btn-danger">Write</a>



		</div>

	</div>

</body>
</html>