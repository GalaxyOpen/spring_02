<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오후 2:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.css">
    <script src = "/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <h2>Hello5.jsp</h2>
    <table class = "table table-dark table-hover">
        <tr>
            <th>id</th>
            <th>이름</th>
            <th>학번</th>
        </tr>
  <%-- <c:forEach> : jsp 문법 --%>
    <%-- items : 반복할 대상, var 반복 변수 --%>
    <%-- ex ) for(StudentDTO s: studentList) --%>
    <c:forEach items = "${studentList}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.studentName}</td>
            <td>${s.studentNumber}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
