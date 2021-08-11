<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/member/updateProc" method="post">
	<input type="text" name="id" value="${member.id} readonly"><br>
	<input type="text" name="password" value="${member.password}"><br>
	<input type="submit" value="수정">
</form>

</body>
</html>