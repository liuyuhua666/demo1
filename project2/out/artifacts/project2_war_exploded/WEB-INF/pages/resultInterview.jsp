<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/31
  Time: 11:33
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
<div>
    姓名：${sessionScope.guest.gname}<br>
    职位：${sessionScope.interview.i_jname}<br>
    <form action="updateResult" method="post">
        面试结果：<input type="radio" name="i_result" value="通过"/>通过
        <input type="radio" name="i_result" value="未通过"/>未通过<br>
        <input type="hidden" name="i_id" value="${sessionScope.interview.i_id}"/>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>