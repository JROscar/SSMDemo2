<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 2018/10/24
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    ${msg}
    <form action="/login" method="post">
        用户名：<input type="text" name="username"/><br/>
        密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
