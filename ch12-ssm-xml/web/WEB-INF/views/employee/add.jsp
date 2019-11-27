<%--
  Created by IntelliJ IDEA.
  User: 过往云烟~
  Date: 2019-11-21
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/emp/insert">
        名字:<input type="text" name="username"/><br>
        工资:<input type="text" name="salary"/><br>
        出生日期:<input type="text" name="hiredate"/><br>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
