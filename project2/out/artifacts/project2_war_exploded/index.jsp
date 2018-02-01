<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/26
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<fieldset>
    <legend>login</legend>
    <form action="toLogin" method="post">
        账号：<input name="g_name"><br>
        密码：<input name="g_password"><br>
        <input type="submit" value="游客登录"><br>
    </form>
</fieldset>
<a href="toRegister">游客注册</a>
<a href="managerRegister">管理员登录</a>
</body>
</html>