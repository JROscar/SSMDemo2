<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 2018/10/23
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="/OrdersEdit" method="post">
    <table width="30%" border="1">
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td>
                <input value="orders[0].id" name="id" type="checkbox"/>
            </td>
            <td>
                <input  value="orders[0].user.username" name="userName" type="text"/>
            </td>
        </tr>
        <tr>
            <td>
                <input value="orders[1].id" name="userId" type="checkbox"/>
            </td>
            <td>
                <input value="orders.[1].user.username" name="jack" type="text"/>
            </td>
        </tr>
        <tr>
            <td>
                <input value="orders[2].id" name="userId" type="checkbox"/>
            </td>
            <td>
                <input value="orders.[2].user.username" name="paker" type="text"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
