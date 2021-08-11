<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- ${member.id}:${member.password}<br>
<input type="button" value="수정" onclick="/member/update?id=${member.id}&password=${member.password}"> --%>
<form action="/member/update" method="post">
<input type="text" name="id" value="${member.id}" readonly><br>
<input type="text" name="password" value="${member.password}" readonly><br>
<input type="submit" value="수정하기">

</form>

</body>
</html>