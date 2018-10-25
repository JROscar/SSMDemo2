<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 2018/10/23
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isELIgnored="false" %>
<html>
<head>
    <title>订单查询</title>
</head>
<body>
<form action="/ordersToUser" method="post">
    订单编号：<input type="text" name="id"/><br/>
    所属用户：<input type="text" name="user.username"/><br/>
    所属密码：<input type="password" name="user.password"/><br/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>
