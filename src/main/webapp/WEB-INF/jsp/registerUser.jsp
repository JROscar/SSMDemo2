<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 2018/10/22
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/registerUser" method="post">
    用户名：<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
