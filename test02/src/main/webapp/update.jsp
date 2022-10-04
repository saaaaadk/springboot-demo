<%--
  Created by IntelliJ IDEA.
  User: 维磊
  Date: 2022/10/4
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/update" method="post">
  Id: <input type="text" name="id" value="${student.id}" readonly><br>
  name: <input type="text" name="name" value="${student.name}"> <br>
  age: <input type="text" name="age" value="${student.age}"><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
