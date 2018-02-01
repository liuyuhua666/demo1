<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/31
  Time: 19:49
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
    姓名：${sessionScope.employee.e_realname}
    <form action="addEmployee" method="post">
        入职时间：<input name="e_hiretime"/><br>
        上班时间：<input name="e_workstarttime"/><br>
        下班时间：<input name="e_workendtime"/><br>
        <input type="hidden" name="e_id" value="${sessionScope.employee.e_id}"/>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>