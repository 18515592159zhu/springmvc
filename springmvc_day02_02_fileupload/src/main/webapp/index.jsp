<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/4
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>传统文件上传</h3>

    <form action="/user/fileupload1" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        <input type="submit" value="上传" />
    </form>

    <h3>Springmvc文件上传</h3>

    <form action="/user/fileupload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        <input type="submit" value="上传" />
    </form>

    <h3>跨服务器文件上传</h3>

    <form action="/user/fileupload3" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        <input type="submit" value="上传" />
    </form>
    <font  color="red" style="text-shadow:0.1em 0.1em 0.05em  #ccc ">至此，CentOS 7.0系统安装配置图解教程完！</font>
</body>
</html>
