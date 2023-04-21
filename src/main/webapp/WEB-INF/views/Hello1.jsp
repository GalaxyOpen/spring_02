<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello1.jsp</h2>
<a href="/">index로 가기</a>
<form action="/form-param1" method ="get">
<%--     폼테그 목적지는 폼param1--%>
    <input type="text" name ="p1"><br>
    <input type="text" name ="p2"><br>
    <input type="submit" value="전송">
</form>

<form action="/form-param2" method ="post">
    <%--     폼테그 목적지는 폼param2--%>
    <input type="text" name ="p3"><br>
    <input type="text" name ="p4"><br>
    <input type="submit" value="전송">
</form>
</body>
</html>
