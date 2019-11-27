<%--
  Created by IntelliJ IDEA.
  User: 过往云烟~
  Date: 2019-11-21
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/emp/insert">
    名字:<input type="text" name="username"/>
    工资:<input type="text" name="salary"/>
    出生日期:<input type="text" name="hiredate"/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
