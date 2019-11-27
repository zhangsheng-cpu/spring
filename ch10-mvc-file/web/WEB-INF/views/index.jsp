<%--
  Created by IntelliJ IDEA.
  User: 过往云烟~
  Date: 2019-11-20
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="/upload">
    <input type="file" name="myfile"/>
    <input type="submit" value="提交">
</form>
<a href="/download?filename=京东.png">下载(文件名有中文)</a>
<a href="/download?filename=1.png">下载</a>

<img src="/download?filename=1.png"/>
</body>
</html>
