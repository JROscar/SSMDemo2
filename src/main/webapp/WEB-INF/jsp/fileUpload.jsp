<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 2018/10/24
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="/fileUpload" method="post"
          enctype="multipart/form-data" onsubmit="return check()">
        上传人：<input type="text" id="name" name="name"/><br/>
        上传文件：<input type="file" id="file" name="uploadfile" multiple="multiple"/><br/>
        <input type="submit" value="上传" />
    </form>
</body>
</html>
<script>
    function check() {
        var name = document.getElementById("name");
        var file = document.getElementById("file");
        if (name=""){
            alert("请填写上传人");
            return false;
        }
        if (file.length==0||file==""){
            alert("请添加上传文件");
            return false;
        }
        return true;
    }
</script>