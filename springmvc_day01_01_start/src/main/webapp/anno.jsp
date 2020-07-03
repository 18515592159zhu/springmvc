<%--
  Created by IntelliJ IDEA.
  User: zhuchifeng
  Date: 2019/11/13
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--常用注解--%>
<a href="/anno/testRequestParam?name=haha">testRequestParam</a>
<a href="/anno/testPathVariable/100">testPathVariable</a>
<a href="/anno/testRequestHeader">testRequestHeader</a>
<a href="/anno/testCookieValue">testCookieValue</a>
<form method="post" action="/anno/testRequestBody">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>

<hr/>
<form method="post" action="/anno/testRequestBody1">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>
<hr/>
<form action="anno/testModelAttribute" method="post">
    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>
<br/>
<a href="/anno/testModelAttribute1?username=zhangsan">testModelAttribute</a>
<hr/>
<!-- 修改用户信息 -->
<form action="anno/updateUser" method="post">
    用户名称： <input type="text" name="username"><br/>
    用户年龄： <input type="text" name="age"><br/>
    <input type="submit" value="保存">
</form>

<!-- SessionAttribute 注解的使用 -->
<a href="anno/testPut">存入 SessionAttribute</a>
<hr/>
<a href="anno/testGet">取出 SessionAttribute</a>
<hr/>
<a href="anno/testClean">清除 SessionAttribute</a>
</body>
</html>