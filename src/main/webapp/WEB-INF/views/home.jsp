<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Custom Login Page</h1>
<form action="/springSecurity/login" method="post">

<input type="text" name="username" id="username" value="admin"><br>

<input type="password" name="password" id="password" value="admin"><br>

<input type="submit" name="button" id="button" value="로그인">

<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
</form>
</body>
</html>
